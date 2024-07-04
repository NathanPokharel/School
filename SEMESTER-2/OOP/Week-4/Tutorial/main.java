/*
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int employeeId;
    double salary;
    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
public class main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 30, 1001, 50000.0);
        System.out.println("Employee 1 details:");
        employee1.display();
        Employee employee2 = new Employee("Bob", 28, 1002, 45000.0);
        System.out.println("\nEmployee 2 details:");
        employee2.display();
    }
}

*/

/*
class GrandParent {
    public void displayGrandParent() {
        System.out.println("I am Grandparent");
    }
}

class Parent extends GrandParent {
    public void displayParent() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("I am Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayGrandParent();
        child.displayParent();
        child.displayChild();
    }
}

*/

/*
class Animal {
    String name;
    double weight;
    String color;
    int age;

    public Animal(String name, double weight, String color, int age) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.age = age;
    }
}

class Dog extends Animal {
    String breed;
    boolean isIndoor;

    public Dog(String name, double weight, String color, int age, String breed, boolean isIndoor) {
        super(name, weight, color, age);
        this.breed = breed;
        this.isIndoor = isIndoor;
    }
}

class Cat extends Animal {
    double height;
    public Cat(String name, double weight, String color, int age, double height) {
        super(name, weight, color, age);
        this.height = height;
    }
}

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 25.5, "Brown", 3, "Labrador", true);
        System.out.println("Name: " + dog.name);
        System.out.println("Weight: " + dog.weight);

        Cat cat = new Cat("Whiskers", 5.2, "Black", 2, 30.0);
        System.out.println("Name: " + cat.name);
        System.out.println("Weight: " + cat.weight);
    }
}

*/

/*
class MathOperations{
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(double a, double b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class main {
    public static void main(String[] args) {
        MathOperations adder = new MathOperations();
        adder.add(2,3);
        adder.add(2.2,3.3);
        adder.add(2,3,4);
    }
}
*/

/*
class AreaCalculator {
    public void calculateArea(int length, int width) {
        System.out.println(length*width);
    }

    public void calculateArea(double side) {
        System.out.println(side*side);
    }

    public void calculateArea(double base, double height) {
        System.out.println(0.5*base*height);
    }

}

public class main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        calculator.calculateArea(5, 3);
        calculator.calculateArea(4.0);
        calculator.calculateArea(6.0, 2.5);
    }
}
*/
/*
class Animal {
    String name;
    double weight;
    String color;
    int age;

    public Animal(String name, double weight, String color, int age) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.age = age;
    }
    public void MakeSound(){
        System.out.println("Made A Sound");
    }
}

class Dog extends Animal {
    String breed;
    boolean isIndoor;

    public Dog(String name, double weight, String color, int age, String breed, boolean isIndoor) {
        super(name, weight, color, age);
        this.breed = breed;
        this.isIndoor = isIndoor;
    }
    public void MakeSound(){
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    double height;
    public Cat(String name, double weight, String color, int age, double height) {
        super(name, weight, color, age);
        this.height = height;
    }
    public void MakeSound(){
        System.out.println("Meow");
    }
}

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 25.5, "Brown", 3, "Labrador", true);
        System.out.println("Name: " + dog.name);
        System.out.println("Weight: " + dog.weight);
        dog.MakeSound();

        Cat cat = new Cat("Whiskers", 5.2, "Black", 2, 30.0);
        System.out.println("Name: " + cat.name);
        System.out.println("Weight: " + cat.weight);
        cat.MakeSound();
    }
}

*/


/*
class A{
    public void display(){
        System.out.println("Im A!");
    }
}
class B extends A{
    public void display(){
        System.out.println("Im B!");
    }
}
class C extends A{
    public void display(){
        System.out.println("Im C!");
    }
}
public class main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        b.display();
        c.display();

    }
}
*/
/*
class Animal {
    String name;
    double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    String breed;

    public Cat(String name, double weight, String breed) {
        super(name, weight);
        this.breed = breed;
    }

    public void makeSound() {
        super.makeSound(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers", 5.2, "Siamese");
        System.out.println("Name: " + cat.name);
        System.out.println("Weight: " + cat.weight);
        System.out.println("Breed: " + cat.breed);
        cat.makeSound();
    }
}
*/
/*
class Animal {
    String name;
    double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    String breed;
    public Cat(String name, double weight, String breed) {
        super(name, weight);
        this.breed = breed;
    }

    public void makeSound() {
        super.makeSound(); 
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    String breed;
    boolean isIndoor;

    public Dog(String name, double weight, String breed, boolean isIndoor) {
        super(name, weight);
        this.breed = breed;
        this.isIndoor = isIndoor;
    }

    public void makeSound() {
        super.makeSound(); 
        System.out.println("Woof");
    }
}

public class main{
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 25.5, "Labrador", true);
        System.out.println("Name: " + dog.name);
        System.out.println("Weight: " + dog.weight);
        System.out.println("Breed: " + dog.breed);
        System.out.println("Is Indoor: " + dog.isIndoor);
        dog.makeSound();
    }
}

*/
/*
class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void printArea() {
        System.out.println("Area method in Shape class");
    }
}

class Square extends Shape {
    double length;

    public Square(String color, double length) {
        super(color);
        this.length = length;
    }

    public void printArea() {
        double area = length * length;
        System.out.println("Area of square with color " + color + ": " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public void printArea() {
        double area = length * width;
        System.out.println("Area of rectangle with color " + color + ": " + area);
    }
}

public class main {
    public static void main(String[] args) {
        Square square = new Square("Red", 5.0);
        square.printArea();
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        rectangle.printArea();
    }
}
*/
