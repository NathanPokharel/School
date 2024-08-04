interface Animal {
    abstract void eat();
    abstract void walk();
}

interface Printable {
    abstract void display();
}

class Cow implements Animal,Printable{
    public void eat(){

    }
    public void walk(){

    }
    public void display(){

    }

}
abstract class Vehicle{
    abstract void wheel();
    public void door(){
        System.out.println("Declared Metho");
    }
}

class Bus extends Vehicle{
    void wheel(){
        System.out.println("wheel");
    }

}

public class Main {
    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        //Bus bus = new Bus();
        //bus.door();
        //bus.wheel();
        try{
            //System.out.println(10/0);
            int[] age = {10,20,25,24,28,27,30,31,32};
            System.out.println(age[9]);
        }catch(ArithmeticException  | ArrayIndexOutOfBoundsException e){
            System.out.println("Cant ",e);
        }

    }
}
