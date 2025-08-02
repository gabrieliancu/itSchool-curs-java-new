package org.example.homework;

import java.util.*;

public class ShoppingHistoryAnalyzer {

    private final Map<String, Integer> frequencyMap = new HashMap<>();

    public void addShoppingCart(List<String> cart) {
        for (String item : cart) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
    }

    public void addShoppingCarts(List<List<String>> carts) {
        for (List<String> cart : carts) {
            addShoppingCart(cart);
        }
    }

    public List<String> getTopKFrequentItems(int k) {
        Map<Integer, List<String>> freqToItems = new HashMap<>();
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            int freq = entry.getValue();
            maxFreq = Math.max(maxFreq, freq);
            freqToItems.computeIfAbsent(freq, f -> new ArrayList<>()).add(entry.getKey());
        }

        List<String> result = new ArrayList<>();
        for (int freq = maxFreq; freq >= 1; freq--) {
            if (freqToItems.containsKey(freq)) {
                result.addAll(freqToItems.get(freq));
                if (result.size() >= k) {
                    if (result.size() > k) {
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
        return result;
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