package org.example.homework;

import java.util.TreeSet;

class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("TreeSet: " + colors);
    }
}

class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}

class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Cherry");
        set2.add("Date");

        set1.addAll(set2);

        System.out.println("Combined TreeSet: " + set1);
    }
}

class TreeSetExample4 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);

        System.out.println("Original TreeSet: " + numbers);
        System.out.println("Reverse order: " + numbers.descendingSet());
    }
}

class TreeSetExample5 {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("First element: " + fruits.first());
        System.out.println("Last element: " + fruits.last());
    }
}

class TreeSetExample6 {
    public static void main(String[] args) {
        TreeSet<String> original = new TreeSet<>();
        original.add("One");
        original.add("Two");

        TreeSet<String> clone = new TreeSet<>(original);

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}

class TreeSetExample7 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("Size: " + set.size());
    }
}

class TreeSetExample8 {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("C");

        boolean areEqual = set1.equals(set2);
        System.out.println("Are TreeSets equal? " + areEqual);
    }
}

class TreeSetExample9 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        System.out.println("Numbers less than 7: " + numbers.headSet(7));
    }
}

class TreeSetExample10 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        Integer element = 4;
        Integer result = numbers.ceiling(element);

        System.out.println("Element >= " + element + ": " + result);
    }
}

class TreeSetExample11 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        Integer element = 6;
        Integer result = numbers.floor(element);

        System.out.println("Element <= " + element + ": " + result);
    }
}

class TreeSetExample12 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        Integer element = 5;
        Integer result = numbers.higher(element);

        System.out.println("Element strictly greater than " + element + ": " + result);
    }
}

class TreeSetExample13 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        Integer element = 5;
        Integer result = numbers.lower(element);

        System.out.println("Element strictly less than " + element + ": " + result);
    }
}

class TreeSetExample14 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        String first = set.pollFirst();

        System.out.println("Removed first element: " + first);
        System.out.println("TreeSet after removal: " + set);
    }
}

class TreeSetExample15 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        String last = set.pollLast();

        System.out.println("Removed last element: " + last);
        System.out.println("TreeSet after removal: " + set);
    }
}

class TreeSetExample16 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        boolean removed = set.remove(20);

        System.out.println("Element 20 removed? " + removed);
        System.out.println("TreeSet after removal: " + set);
    }
}

