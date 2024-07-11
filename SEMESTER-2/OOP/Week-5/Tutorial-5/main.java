//abstract class Parent {
//    abstract void message();
//}
//
//class ChildClass1 extends Parent {
//    @Override
//    void message() {
//        System.out.println("This is first subclass");
//    }
//}
//
//class ChildClass2 extends Parent {
//    @Override
//    void message() {
//        System.out.println("This is second subclass");
//    }
//}
//
//public class main{
//    public static void main(String[] args) {
//        Parent child1 = new ChildClass1();
//        child1.message();
//
//        Parent child2 = new ChildClass2();
//        child2.message();
//    }
//}
//
//abstract class Bank {
//    abstract void GetBalance();
//}
//
//class A extends Bank{
//    public int deposit;
//    void GetBalance(){
//        System.out.println(deposit);
//
//    }
//
//}
//class B extends Bank{
//    public int deposit;
//    void GetBalance(){
//        System.out.println(deposit);
//
//    }
//
//}
//class C extends Bank{
//    public int deposit;
//    void GetBalance(){
//        System.out.println(deposit);
//
//    }
//
//}
//public class main{
//    public static void main(String[] args) {
//        A banka = new A();
//        banka.deposit = 100;
//        B bankb = new B();
//        bankb.deposit = 150;
//        C bankc = new C();
//        bankc.deposit = 200;
//        banka.GetBalance();
//        bankb.GetBalance();
//        bankc.GetBalance();
//
//
//    }
//}
//abstract class Shape{
//    abstract void getRectangleArea(int a, int b);
//    abstract void getSquareArea(int a);
//    abstract void getCircleArea(int a);
//}
//class Area extends Shape{
//    @Override
//    void getRectangleArea(int a, int b){
//        System.out.println(a*b);
//    }
//
//    @Override
//    void getSquareArea(int a){
//        System.out.println(a*a);
//    }
//
//    @Override
//    void getCircleArea(int a){
//        System.out.println(3.141592653*a*a);
//    }
//}
//
//public class main{
//    public static void main(String[] args) {
//        Area shape = new Area();
//        shape.getRectangleArea(5,4);
//        shape.getSquareArea(5);
//        shape.getCircleArea(5);
//
//    }
//}

//interface Shape {
//    void calculateArea();
//}
//
//class Circle implements Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public void calculateArea() {
//        double area = 3.14159265358979 * radius * radius;
//        System.out.println("Circle area: " + area);
//    }
//}
//
//class Rectangle implements Shape {
//    private double length;
//    private double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    @Override
//    public void calculateArea() {
//        double area = length * width;
//        System.out.println("Rectangle area: " + area);
//    }
//}
//
//public class main{
//    public static void main(String[] args) {
//        Shape circle = new Circle(5);
//        circle.calculateArea();
//
//        Shape rectangle = new Rectangle(5, 4);
//        rectangle.calculateArea();
//    }
//}

//interface PowerOnOff {
//    void turnOn();
//    void turnOff();
//}
//
//interface DeviceInfo {
//    void displayInfo();
//}
//
//interface ElectronicDevice extends PowerOnOff, DeviceInfo {
//}
//
//class Television implements ElectronicDevice {
//    @Override
//    public void turnOn() {
//        System.out.println("Television is turned on.");
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("Television is turned off.");
//    }
//
//    @Override
//    public void displayInfo() {
//        System.out.println("This is a television.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Television tv = new Television();
//        tv.displayInfo();
//        tv.turnOn();
//        tv.turnOff();
//    }
//}
//

//public class main{
//
//    public static void main(String[] args) {
//        String somestring = "UGABGUA0";
//        System.out.println(somestring.matches("[A-Z0-9]+"));
//        somestring = "Thiswillwork";
//        System.out.println(somestring.matches("[A-Z][a-z]+"));
//        somestring = "ThisWontwork";
//        System.out.println(somestring.matches("[A-Z][a-z]+"));
//        somestring = "somefile.txt";
//        System.out.println(somestring.matches(".*\\.txt"));
//        somestring = "somefile1txt";
//        System.out.println(somestring.matches("[a-zA-Z]\\w{2,15}"));
//
//
//    }
//}
//
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int age = -1; 
            if (age < 0) {
                throw new AgeException("Age is less than 0");
            } else {
                System.out.println("Age is: " + age);
            }
        } catch (AgeException e) {
            System.err.println("AgeException occurred: " + e.getMessage());
        }
    }
}

