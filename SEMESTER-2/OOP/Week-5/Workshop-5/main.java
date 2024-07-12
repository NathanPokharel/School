import java.util.regex.Matcher;
import java.util.regex.Pattern;
//abstract class Shape{
//    abstract void calculateArea();
//    abstract void calculatePerimeter();
//
//}
//class Quadilateral extends Shape{
//    void calculateArea(){
//        System.out.println("Calculatin Area");
//    }
//    void calculatePerimeter(){
//        System.out.println("Calculatin Perimeter");
//    }
//}
//
//abstract class Vehicle {
//    abstract void wheel();
//    abstract void door();
//
//}
//
//class Bus extends Vehicle{
//    void wheel(){
//        System.out.println("This is wheel");
//    }
//
//    void door(){
//        System.out.println("This is door");
//    }
//}

//interface Animal{
//    void eat();
//    void walk();
//}
//
//interface Printable{
//    void display();
//}
//
//class Cow implements Animal,Printable{
//
//    public void walk(){
//        System.out.println("Walkin");
//    }
//
//    public void eat(){
//        System.out.println("Eatin");
//    }
//
//    public void display() {
//        System.out.println("Displays");
//    }
//}
//
//interface LivingBeing{
//     void specialFeature();
//}
//
//class Fish implements LivingBeing{
//    public void specialFeature(){
//        System.out.println("Fish Swims");
//    }
//
//}
//
//class Bird implements LivingBeing{
//    public void specialFeature(){
//        System.out.println("Bird flies");
//    }
//
//}

//public class main {
//
//     public static void main(String[] args) {
//        try {
//            printAge();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Index Out Of Bounds ");
//        }
//    }
//
//    public static void printAge() throws ArrayIndexOutOfBoundsException {
//        int[] age = {10, 20, 25, 24, 28, 27, 30, 31, 32};
//        System.out.println(age[9]);
//    }
//
//}


public class  main{
    public static void main(String[] args) {
        String text = "Somefile.java";
        String regex = ".*\\.java";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
