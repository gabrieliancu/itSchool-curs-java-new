package org.example.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;

class ColorList {
    public static void main(String[] args) {
        // Create a new ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print out the collection
        System.out.println("List of colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

 class IterateArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // 1. Using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 2. Using a for loop with index
        System.out.println("\nIterating using for loop with index:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // 3. Using an iterator
        System.out.println("\nIterating using iterator:");
        var iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

class InsertAtFirstPosition {
    public static void main(String[] args) {
        // Create a new ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print list before insertion
        System.out.println("Before insertion: " + colors);

        // Insert a color at the first position (index 0)
        colors.add(0, "Red");

        // Print list after insertion
        System.out.println("After insertion: " + colors);
    }
}

class RetrieveElement {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add some elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Specify the index to retrieve
        int index = 2;

        // Check if the index is valid
        if (index >= 0 && index < colors.size()) {
            // Retrieve and print the element
            String element = colors.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }
}

class UpdateArrayElement {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print original list
        System.out.println("Original list: " + colors);

        // Index to update
        int indexToUpdate = 1;
        String newColor = "Orange";

        // Check if the index is valid
        if (indexToUpdate >= 0 && indexToUpdate < colors.size()) {
            colors.set(indexToUpdate, newColor);  // Update the element
            System.out.println("Updated list: " + colors);
        } else {
            System.out.println("Invalid index: " + indexToUpdate);
        }
    }
}

class RemoveThirdElement {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print original list
        System.out.println("Original list: " + colors);

        // Check if list has at least 3 elements
        if (colors.size() >= 3) {
            // Remove the third element (index 2)
            colors.remove(2);
            System.out.println("List after removing third element: " + colors);
        } else {
            System.out.println("The list does not have a third element to remove.");
        }
    }
}

class SearchArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Element to search
        String searchColor = "Blue";

        // Search for the element
        if (colors.contains(searchColor)) {
            System.out.println(searchColor + " is found in the list.");
        } else {
            System.out.println(searchColor + " is not found in the list.");
        }
    }
}

class SortArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original list
        System.out.println("Original list: " + colors);

        // Sort the list
        Collections.sort(colors);

        // Print the sorted list
        System.out.println("Sorted list: " + colors);
    }
}

class CopyArrayList {
    public static void main(String[] args) {
        // Original ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Blue");

        // Create a new list and copy manually
        ArrayList<String> copiedList = new ArrayList<>();
        for (String color : originalList) {
            copiedList.add(color);
        }

        // Display both lists
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List: " + copiedList);
    }
}

class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original list: " + colors);

        Collections.shuffle(colors);

        System.out.println("Shuffled list: " + colors);
    }
}

class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original list: " + colors);

        Collections.reverse(colors);

        System.out.println("Reversed list: " + colors);
    }
}

class ExtractSubList {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original list: " + colors);

        // Extract a portion (sublist) from index 1 to 4 (exclusive)
        List<String> subList = colors.subList(1, 4);

        System.out.println("Extracted portion: " + subList);
    }
}

class CompareArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "Red", "Green", "Blue", "Yellow");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "Green", "Red", "Yellow", "Blue");

        // 1. Check if exactly equal (same order and elements)
        boolean exactEqual = list1.equals(list2);
        System.out.println("Are lists exactly equal? " + exactEqual);

        // 2. Check if contain same elements regardless of order
        boolean sameElements = new HashSet<>(list1).equals(new HashSet<>(list2));
        System.out.println("Do lists contain the same elements (order ignored)? " + sameElements);

        // 3. Find common elements
        ArrayList<String> common = new ArrayList<>(list1);
        common.retainAll(list2);
        System.out.println("Common elements: " + common);
    }
}

class SwapElementsArrayList {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original list: " + colors);

        // Indices to swap
        int index1 = 1; // "Green"
        int index2 = 3; // "Yellow"

        // Swap elements
        if (index1 >= 0 && index1 < colors.size() && index2 >= 0 && index2 < colors.size()) {
            String temp = colors.get(index1);
            colors.set(index1, colors.get(index2));
            colors.set(index2, temp);
            System.out.println("List after swapping elements at indices " + index1 + " and " + index2 + ": " + colors);
        } else {
            System.out.println("Invalid indices.");
        }
    }
}

class JoinArrayLists {
    public static void main(String[] args) {
        // First ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        // Second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Purple");
        list2.add("Orange");

        // Create a new list to hold the joined lists
        ArrayList<String> joinedList = new ArrayList<>(list1);

        // Add all elements from the second list
        joinedList.addAll(list2);

        // Print the joined list
        System.out.println("Joined ArrayList: " + joinedList);
    }
}

class CloneArrayList {
    public static void main(String[] args) {
        // Original ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Blue");

        // Clone using the constructor (no unchecked cast)
        ArrayList<String> clonedList = new ArrayList<>(originalList);

        // Display both lists
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);
    }
}

class EmptyArrayList {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Before clearing: " + colors);

        // Empty the ArrayList
        colors.clear();

        System.out.println("After clearing: " + colors);
    }
}

class TestArrayListEmpty {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        // Test on empty list
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Add elements
        colors.add("Red");
        colors.add("Green");

        // Test again after adding elements
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}

class TrimArrayListCapacity {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print initial size and capacity info (capacity isn't directly accessible, so just size)
        System.out.println("Initial size: " + colors.size());

        // Trim the capacity to the current size
        colors.trimToSize();

        // After trim
        System.out.println("Capacity trimmed to size: " + colors.size());

        // Just to show the list contents
        System.out.println("List elements: " + colors);
    }
}

class IncreaseArrayListCapacity {
    public static void main(String[] args) {
        // Create an empty ArrayList
        ArrayList<String> colors = new ArrayList<>();

        System.out.println("Initial size: " + colors.size());

        // Increase internal capacity to hold at least 20 elements without resizing
        colors.ensureCapacity(20);

        // Add some elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Size after adding elements: " + colors.size());
        System.out.println("List contents: " + colors);
    }
}