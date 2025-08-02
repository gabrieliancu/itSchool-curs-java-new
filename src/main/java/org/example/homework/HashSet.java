package org.example.homework;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;

class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");  // Append element (just add)
        System.out.println("HashSet elements: " + set);
    }
}

class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Bird");

        for (String element : set) {
            System.out.println(element);
        }
    }
}

class HashSetExample3 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        System.out.println("Number of elements: " + set.size());
    }
}

class HashSetExample4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("X");
        set.add("Y");
        System.out.println("Before clear: " + set);
        set.clear();
        System.out.println("After clear: " + set);
    }
}

class HashSetExample5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        System.out.println("Is empty? " + set.isEmpty());
        set.add("Element");
        System.out.println("Is empty after adding? " + set.isEmpty());
    }
}

class HashSetExample6 {
    public static void main(String[] args) {
        HashSet<String> original = new HashSet<>();
        original.add("Red");
        original.add("Green");

        // Create a shallow copy via the copy constructor — no cast needed
        HashSet<String> clone = new HashSet<>(original);

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}

class HashSetExample7 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");

        String[] array = set.toArray(new String[0]);

        System.out.println("Array elements:");
        for (String s : array) {
            System.out.println(s);
        }
    }
}

class HashSetExample8 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Cherry");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet elements (sorted): " + treeSet);
    }
}

class HashSetExample9 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);

        List<Integer> list = new ArrayList<>(set);

        System.out.println("ArrayList elements: " + list);
    }
}

class HashSetExample10 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        HashSet<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("A");

        boolean areEqual = set1.equals(set2);

        System.out.println("Are the two sets equal? " + areEqual);
    }
}

class HashSetExample11 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Dragonfruit");
        set2.add("Cherry");

        set1.retainAll(set2);

        System.out.println("Common elements: " + set1);
    }
}

class HashSetExample12 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("X");
        set.add("Y");

        System.out.println("Before removal: " + set);
        set.clear();
        System.out.println("After removal: " + set);
    }
}

