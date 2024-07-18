//import java.util.ArrayList;
//
//public class Main{
//    public static void main(String[] args) {
//        ArrayList<String> studentList = new ArrayList<>();
//        studentList.add("a");
//        studentList.add("b");
//        studentList.add("c");
//        System.out.println("Students:");
//        for (String student : studentList) {
//            System.out.println(student);
//        }
//        studentList.remove("a");
//        System.out.println("Students:");
//        for (String student : studentList) {
//            System.out.println(student);
//        }
//    }
//}

//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main{
//    public static void main(String[] args) {
//        ArrayList<String> studentList = new ArrayList<>();
//        studentList.add("a");
//        studentList.add("b");
//        studentList.add("c");
//
//        Collections.reverse(studentList);
//
//        for (String student : studentList) {
//            System.out.println(student);
//        }
//    }
//}
//
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("a");
//        arrayList1.add("b");
//
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("c");
//        arrayList2.add("d");
//
//        arrayList1.addAll(arrayList2);
//
//        for (String item : arrayList1) {
//            System.out.println(item);
//        }
//    }
//}
//

//import java.util.LinkedList;
//
//public class Main {
//    public static void main(String[] args) {
//        LinkedList<String> colors = new LinkedList<>();
//        colors.add("red");
//        colors.add("green");
//        colors.add("blue");
//
//        colors.set(colors.indexOf("green"), "purple");
//        colors.remove("blue");
//
//        for (String color : colors) {
//            System.out.println(color);
//        }
//    }
//}
//

//import java.util.LinkedList;
//
//public class Main {
//    public static void main(String[] args) {
//        LinkedList<String> colors = new LinkedList<>();
//        colors.addFirst("red");
//        colors.addLast("blue");
//        if (colors.isEmpty()) {
//            System.out.println("The linked list is empty.");
//        } 
//        String firstElement = colors.getFirst();
//        String lastElement = colors.getLast();
//        System.out.println("First element: " + firstElement);
//        System.out.println("Last element: " + lastElement);
//    }
//}
//

//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
//        stack.push("A");
//        stack.push("B");
//        stack.push("C");
//        stack.pop();
//        stack.push("D");
//        stack.push("E");
//        String topElement = stack.peek();
//        System.out.println("Top element: " + topElement);
//        System.out.println("Stack: " + stack);
//    }
//}
//
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Main {
//    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
//        queue.add("A");
//        queue.add("B");
//        queue.add("C");
//        queue.remove("A");
//        queue.add("D");
//        queue.add("E");
//        String frontElement = queue.peek();
//        System.out.println("Queue: " + queue);
//    }
//}
//

//import java.util.HashSet;
//
//public class Main {
//    public static void main(String[] args) {
//        HashSet<Integer> integerSet = new HashSet<>();
//        integerSet.add(1);
//        integerSet.add(2);
//        integerSet.add(3);
//        integerSet.add(2); 
//        System.out.println("HashSet: " + integerSet);
//    }
//}

//import java.util.TreeSet;
//
//public class Main {
//    public static void main(String[] args) {
//        TreeSet<String> colors = new TreeSet<>();
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Blue");
//        colors.add("Yellow");
//        colors.add("Purple");
//        System.out.println("TreeSet : " + colors);
//    }
//}

//import java.util.LinkedHashSet;
//
//public class Main {
//    public static void main(String[] args) {
//        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(20); 
//        System.out.println(":" + numbers);
//    }
//}

//import java.util.TreeSet;
//
//public class Main{
//    public static void main(String[] args) {
//        TreeSet<String> setA = new TreeSet<>();
//        setA.add("Red");
//        setA.add("Green");
//        setA.add("Blue");
//
//        TreeSet<String> setB = new TreeSet<>();
//        setB.add("Blue");
//        setB.add("Yellow");
//        setB.add("Purple");
//
//        setA.retainAll(setB);
//        System.out.println("Intersection of setA and setB: " + setA);
//
//        setA.addAll(setB);
//        System.out.println("Union of setA and setB: " + setA);
//
//    }
//}


//import java.util.HashSet;
//
//public class Main{
//    public static void main(String[] args) {
//        HashSet<Integer> setA = new HashSet<>();
//        setA.add(1);
//        setA.add(2);
//        setA.add(3);
//        setA.add(4);
//        setA.add(5);
//        setA.add(6);
//
//        HashSet<Integer> setB = new HashSet<>();
//        setB.add(1);
//        setB.add(2);
//        setB.add(3);
//
//        System.out.println(setA.containsAll(setB));
//
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
//
//
//import java.util.TreeMap;
//
//public class Main{
//    public static void main(String[] args) {
//        TreeMap<String, String> countryCapitals = new TreeMap<>();
//
//        countryCapitals.put("France", "Paris");
//        countryCapitals.put("Germany", "Berlin");
//
//        for (String country : countryCapitals.keySet()) {
//            String capital = countryCapitals.get(country);
//            System.out.println(country + " - " + capital);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String input = "Abc123";
//        if (input.matches("[a-zA-Z0-9]{6}")) {
//            System.out.println("Valid input");
//        } else {
//            System.out.println("Invalid input");
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        String input = "7893333333";
        if (input.matches("[789]\\d{9}")) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }
    }
}

