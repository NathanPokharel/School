import java.util.Scanner;

class Employee{
    public String name,experience,department;
    private int age,salary;
    default int id;
    public Employee(String name,String experience, String department, int age , int salary , int id){
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }
    public void GetStuff(){
        return new Object[] {name,experience,department,age,salary,id};
    }

    public void SetStuff(String name,String experience, String department, int age , int salary , int id){
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

}
class Student{
    private String name,id,age;
    public Student(String name, String id , String age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public String[] getStuff(){
        String[] holder = {this.name,this.id,this.age};
        return holder;
    }
    public void setStuff(String name, String id, String age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
class Average{
    int a,b,c;
    public Average(int a, int b , int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getAverage(){
        System.out.println((this.a + this.b + this.c)/3);
    }
}
class User{
    public User(){
        System.out.println("user Created"); 
    }
}
class Box{
    int width,height,length;
    public Box(){
        this.length = 10;
        this.width = 8;
        this.height = 12;
    }
    public Box(int length, int breadth, int height){
        this.length = length;
        this.width = breadth;
        this.height = height;
    }
    public Box(int length){
        this.length = length;
    }
}
class Triangle{
    public int a,b,c;
    //public Triangle(int base, int height){
    //    System.out.println(0.5*base*height);
    //}
    public Triangle(int a,int b, int c){
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }
}

class Car {
    public String color;
    public int price;
    public Car(String color,int price){
        this.color = color;
        this.price = price;
    }
    public void getInfo(){
        System.out.printf("%s %d",this.color, this.price);
    }
}

public class Main {
    public static void triangle(){
        Triangle trg = new Triangle(10,15,20);
    }
    public static void create_car(){
        //Car newcar = new Car();
        //newcar.color = "#0d0f18";
        //newcar.price= 69;
        //Car newcar1 = new Car();
        //newcar1.color = "#0d0f19";
        //newcar1.price= 70;
        Car newcar = new Car("#0d0f18",69);
        newcar.getInfo();
    
    }
    public static void twodimension(){
        int[][] arr = {
            {5,12,17,9,3},
            {13,4,8,14,1},
            {9,6,3,7,21}
        };

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); 
        }

    }
    public static void linearSearch() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();
        for (int num : arr) {
            if (num == target) {
                System.out.println("Matched !");
                return;
            }
        }
        System.out.println("Not Found!");

    }
    public static void employee(){
        
    }
    public static void main(String[] args) {
        //twodimension();
        //linearSearch();
        //create_car();
        //triangle();
    }
}

