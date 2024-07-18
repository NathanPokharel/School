//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> students = new ArrayList<>();
//        students.add("a");
//        students.add("b");
//        students.add("c");
//        students.add("d");
//        students.add("e");
//        students.remove("d");
//        System.out.println(students);
//    }
//}

//import java.util.LinkedList;
//public class Main {
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        System.out.println(list.isEmpty());
//        list.addFirst(10);
//        list.addLast(20);
//        System.out.println(list);
//    }
//}

//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1, 2, 3, 4, 5);
//        int k = 2;
//        Collections.rotate(list, k);
//        System.out.println(list);
//    }
//}

//import java.util.LinkedList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        LinkedList<String> colors = new LinkedList<>();
//        Collections.addAll(colors, "Red", "Blue", "Green", "Yellow", "Black");
//        for (String color : colors) {
//            System.out.println(color);
//        }
//        System.out.println(colors.contains("Red"));
//        Collections.shuffle(colors);
//        System.out.println(colors);
//        Collections.sort(colors);
//        System.out.println(colors);
//    }
//}

//import java.util.Stack;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        Stack<String> tasks = new Stack<>();
//        Collections.addAll(tasks, "Read", "Write", "Code");
//        tasks.pop();
//        Collections.addAll(tasks, "Debug", "Test");
//        System.out.println(tasks.peek());
//        System.out.println(tasks);
//    }
//}
//
//
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
//        String sentence = "Hello World";
//        Stack<String> stack = new Stack<>();
//        for (String word : sentence.split(" ")) stack.push(word);
//        while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
//    }
//}

//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Main {
//    public static void main(String[] args) {
//        Queue<String> printQueue = new LinkedList<>();
//        printQueue.add("Document1");
//        printQueue.add("Document2");
//        printQueue.add("Document3");
//        printQueue.poll();
//        printQueue.add("Document4");
//        printQueue.add("Document5");
//        System.out.println(printQueue.peek());
//        System.out.println(printQueue);
//    }
//}

//import java.util.TreeSet;
//
//public class Main {
//    public static void main(String[] args) {
//        TreeSet<String> names = new TreeSet<>();
//        names.add("Coming");
//        names.add("Up");
//        names.add("With");
//        names.add("Names is");
//        names.add("Hard");
//        System.out.println(names);
//    }
//}

//import java.util.HashSet;
//import java.util.Set;
//
//public class Main {
//    public static void main(String[] args) {
//        Set<String> set1 = new HashSet<>();
//        Set<String> set2 = new HashSet<>();
//
//        set1.addAll(Set.of("Dog", "Cat", "Elephant", "Lion"));
//        set2.addAll(Set.of("Cat", "Giraffe", "Dog", "Monkey"));
//
//        System.out.println(set1);
//        System.out.println(set2);
//        performUnion(set1, set2);
//        performIntersection(set1, set2);
//        performDifference(set1, set2);
//    }
//
//    public static void performUnion(Set<String> set1, Set<String> set2) {
//        Set<String> union = new HashSet<>(set1);
//        union.addAll(set2);
//        System.out.println("Union: " + union);
//    }
//
//    public static void performIntersection(Set<String> set1, Set<String> set2) {
//        Set<String> intersection = new HashSet<>(set1);
//        intersection.retainAll(set2);
//        System.out.println("Intersection: " + intersection);
//    }
//
//    public static void performDifference(Set<String> set1, Set<String> set2) {
//        Set<String> difference = new HashSet<>(set1);
//        difference.removeAll(set2);
//        System.out.println("Difference (Set1 - Set2): " + difference);
//    }
//}

//import java.util.HashMap;
//
//public class Main{
//    public static void main(String[] args) {
//        HashMap<String, String> contacts = new HashMap<>();
//        contacts.put("A", "000000000");
//
//        for (String name : contacts.keySet()) {
//            String phoneNumber = contacts.get(name);
//            System.out.println(name + ": " + phoneNumber);
//        }
//    }
//}

//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        Map<String, String> countryCapitals = new HashMap<>();
//
//        countryCapitals.put("USA", "Washington D.C.");
//        countryCapitals.put("Canada", "Ottawa");
//
//        printMap(countryCapitals);
//        System.out.println(getCapital("Japan", countryCapitals));
//
//        System.out.println(containsCapital("Paris", countryCapitals));
//
//        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
//            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
//        }
//    }
//
//    // Method to print all key-value pairs in a HashMap
//    public static void printMap(Map<String, String> map) {
//        System.out.println("Printing map contents:");
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
//        }
//    }
//
//    // Method to get the capital of a specific country from the HashMap
//    public static String getCapital(String country, Map<String, String> map) {
//        return map.get(country);
//    }
//
//    // Method to check if a capital exists in the HashMap
//    public static boolean containsCapital(String capital, Map<String, String> map) {
//        return map.containsValue(capital);
//    }
//}
//

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        Integer[] numbers = { 5, 2, 9, 1, 5, 6 };
//
//        Arrays.sort(numbers);
//        System.out.println("asc order: " + Arrays.toString(numbers));
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }
//    }
//}
//

//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        String[] colors = { "Blue", "Red", "Green", "Yellow", "Purple" };
//        Arrays.sort(colors);
//        System.out.println("asc: " + Arrays.toString(colors));
//        System.out.println();
//        for (int i = colors.length - 1; i >= 0; i--) {
//            System.out.print(colors[i] + " ");
//        }
//        System.out.println();
//
//    }
//}
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 3, 5, 7, 9, 11, 13, 15);
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
        int target = 7;
        int index = binarySearch(numbers, target);
        System.out.println(index != -1 ? "Element " + target + " found at index: " + index : "Element " + target + " not found.");
    }

    public static int binarySearch(List<Integer> list, int target) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (list.get(mid) == target) return mid;
            if (list.get(mid) < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}

