package org.example.homework;

import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        System.out.println("Map after adding key-value pairs: " + map);
    }
}

class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        System.out.println("Size of the map: " + map.size());
    }
}

class HashMapExample3 {
    public static void main(String[] args) {
        HashMap<Integer, String> sourceMap = new HashMap<>();
        sourceMap.put(1, "One");
        sourceMap.put(2, "Two");

        HashMap<Integer, String> targetMap = new HashMap<>();
        targetMap.putAll(sourceMap);

        System.out.println("Target map after copying: " + targetMap);
    }
}

class HashMapExample4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("X", "X-ray");
        map.put("Y", "Yankee");

        System.out.println("Map before clear: " + map);
        map.clear();
        System.out.println("Map after clear: " + map);
    }
}

class HashMapExample5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("Is map empty? " + map.isEmpty());

        map.put(100, "Hundred");
        System.out.println("Is map empty after adding an element? " + map.isEmpty());
    }
}

class HashMapExample6 {
    public static void main(String[] args) {
        HashMap<String, String> original = new HashMap<>();
        original.put("key1", "value1");
        original.put("key2", "value2");

        // Create a shallow copy using the copy constructor — no unchecked cast needed
        HashMap<String, String> copy = new HashMap<>(original);

        System.out.println("Original map: " + original);
        System.out.println("Copied map: " + copy);
    }
}

class HashMapExample7 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Ten");

        System.out.println("Contains key 10? " + map.containsKey(10));
        System.out.println("Contains key 20? " + map.containsKey(20));
    }
}

class HashMapExample8 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");

        System.out.println("Contains value 'One'? " + map.containsValue("One"));
        System.out.println("Contains value 'Two'? " + map.containsValue("Two"));
    }
}

class HashMapExample9 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        System.out.println("Map entries:");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

class HashMapExample10 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Name", "Alice");
        map.put("City", "Paris");

        String value = map.get("Name");
        System.out.println("Value for key 'Name': " + value);

        String missing = map.get("Age");
        System.out.println("Value for missing key 'Age': " + missing); // prints null
    }
}

class HashMapExample11 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);
    }
}

class HashMapExample12 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");

        Collection<String> values = map.values();
        System.out.println("Values: " + values);
    }
}