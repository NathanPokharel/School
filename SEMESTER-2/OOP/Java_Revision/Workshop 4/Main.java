final class Animal {
    public String name, age;

    Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    Animal() {}
}

class Calculator {


    public static void add(double... numbers) {
        double sum = java.util.Arrays.stream(numbers).sum();
        System.out.println("Sum of double: " + sum);
    }
}


class Hotel {
    public boolean checkUsername(String username){
        return username.matches("[A-Z][a-z]{3,}");
    }
    public boolean checkMobileNum(String num){
        return num.matches("0\\d{9,}");
    }

    public boolean checkPassword(String pass){
        return pass.matches("[a-zA-Z]+[@&]{1}[0-9]+");
    }

    public boolean checkAge(String pass){
        return ((2024 - Integer.parseInt(pass.split("/")[0])) >= 21)? true : false ;

    }
}
public class Main {
    public static void main(String[] args) {
        
    }
}


