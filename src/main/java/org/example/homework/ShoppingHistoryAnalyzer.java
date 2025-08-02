package org.example.homework;

import java.util.*;

public class ShoppingHistoryAnalyzer {

    private final Map<String, Integer> frequencyMap = new HashMap<>();

    // Adds a single shopping cart to the frequency map
    public void addShoppingCart(List<String> cart) {
        for (String item : cart) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
    }

    // Adds multiple shopping carts
    public void addShoppingCarts(List<List<String>> carts) {
        for (List<String> cart : carts) {
            addShoppingCart(cart);
        }
    }

    // Returns the top K most frequent items (including ties)
    public List<String> getTopKFrequentItems(int k) {
        // Step 1: Bucket sort style - group items by frequency
        Map<Integer, List<String>> freqToItems = new HashMap<>();
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            int freq = entry.getValue();
            maxFreq = Math.max(maxFreq, freq);
            freqToItems.computeIfAbsent(freq, f -> new ArrayList<>()).add(entry.getKey());
        }

        // Step 2: Traverse from highest frequency downward
        List<String> result = new ArrayList<>();
        for (int freq = maxFreq; freq >= 1; freq--) {
            if (freqToItems.containsKey(freq)) {
                result.addAll(freqToItems.get(freq));
                if (result.size() >= k) {
                    // Check if adding this group causes a tie
                    if (result.size() > k) {
                        // Trim only if no tie: we assume entire group should be added
                        // because they have the same frequency
                        List<String> group = freqToItems.get(freq);
                        int groupSize = group.size();
                        int overlap = result.size() - k;

                        if (overlap < groupSize) {
                            return result;
                        }
                    } else {
                        return result;
                    }
                }
            }
        }
        return result; // fewer than k unique items
    }

    public static void main(String[] args) {
        ShoppingHistoryAnalyzer analyzer = new ShoppingHistoryAnalyzer();

        List<List<String>> shoppingCarts = Arrays.asList(
                Arrays.asList("apple", "banana", "apple"),
                Arrays.asList("banana", "apple", "orange"),
                Arrays.asList("banana", "kiwi", "kiwi"),
                Arrays.asList("banana", "apple")
        );

        analyzer.addShoppingCarts(shoppingCarts);

        int k = 2;
        List<String> topItems = analyzer.getTopKFrequentItems(k);

        System.out.println("Top " + k + " most frequently purchased items:");
        for (String item : topItems) {
            System.out.println(item + " (purchased " + analyzer.frequencyMap.get(item) + " times)");
        }
    }
}