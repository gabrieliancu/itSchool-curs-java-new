package org.example.homework;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Collections;

class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C"); // Append element (add appends at end by default)
        System.out.println("List after append: " + list);
    }
}

class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer item : list) {
            System.out.println(item);
        }
    }
}

class LinkedListExample3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        int startIndex = 2;
        ListIterator<String> iterator = list.listIterator(startIndex);

        System.out.println("Iterating from index " + startIndex);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class LinkedListExample4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Bird");

        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.println("Iterating in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

class LinkedListExample5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("C");
        list.add(1, "B"); // Insert "B" at index 1

        System.out.println("After insertion: " + list);
    }
}

class LinkedListExample6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");
        list.add("C");

        list.addFirst("A");  // Insert at first
        list.addLast("D");   // Insert at last

        System.out.println("After adding first and last: " + list);
    }
}

class LinkedListExample7 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");
        list.addFirst("A");  // Insert at front

        System.out.println("List: " + list);
    }
}

class LinkedListExample8 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.addLast("C");  // Insert at end

        System.out.println("List: " + list);
    }
}

class LinkedListExample9 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "D"));

        LinkedList<String> toInsert = new LinkedList<>(Arrays.asList("B", "C"));
        int index = 1;

        list.addAll(index, toInsert);

        System.out.println("After inserting elements at index " + index + ": " + list);
    }
}

class LinkedListExample10 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");
        list.add("D");

        String element = "B";
        System.out.println("First occurrence of '" + element + "': " + list.indexOf(element));
        System.out.println("Last occurrence of '" + element + "': " + list.lastIndexOf(element));
    }
}

class LinkedListExample11 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}

class LinkedListExample12 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.remove("Green");

        System.out.println("After removal: " + list);
    }
}

class LinkedListExample13 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        list.removeFirst();
        list.removeLast();

        System.out.println("After removing first and last: " + list);
    }
}

class LinkedListExample14 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        list.clear();

        System.out.println("After clear: " + list);
    }
}

class LinkedListExample15 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Collections.swap(list, 0, 2);

        System.out.println("After swap: " + list);
    }
}

class LinkedListExample16 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 5; i++) list.add(i);

        Collections.shuffle(list);

        System.out.println("After shuffle: " + list);
    }
}

class LinkedListExample17 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("C");
        list2.add("D");

        list1.addAll(list2);

        System.out.println("After joining: " + list1);
    }
}

class LinkedListExample18 {
    public static void main(String[] args) {
        LinkedList<String> original = new LinkedList<>();
        original.add("Red");
        original.add("Green");

        LinkedList<String> clone = (LinkedList<String>) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}

class LinkedListExample19 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("X");
        list.add("Y");

        String first = list.removeFirst();

        System.out.println("Removed first element: " + first);
        System.out.println("List after removal: " + list);
    }
}

class LinkedListExample20 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("X");
        list.add("Y");

        String first = list.getFirst();

        System.out.println("First element (not removed): " + first);
        System.out.println("List remains: " + list);
    }
}