class Lamp{
    private boolean IsOn;
    public Lamp(){
        this.IsOn = false;
    }
    public void turnOn(){
        this.IsOn = true;
        System.out.println(this.IsOn);
    }
    public void turnOff(){
        this.IsOn = false;
        System.out.println(this.IsOn);
    }
}
class Customer{
    private String customerId;
    private String name;
    private String bankAccount;
    public Customer(String Id, String name, String bankAccount){
        this.customerId = Id;
        this.name = name;
        this.bankAccount = bankAccount;
    }
    public String[] getStuff(){
        String holder[] = {this.customerId,this.name,this.bankAccount};
        return holder;
    }
    public void setStuff(String customerId,String name, String bankAccount){
        this.customerId = customerId;
        this.name = name;
        this.bankAccount = bankAccount;
    }
}

class Address{
    private String street;
    private String city;
    private String zip;

    public Address(String street, String city, String zip){
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public String[] getStuff(){
        String holder[] = {this.street,this.city,this.zip};
        return holder;
    }

    public void setStuff(String street,String city, String zip){
        this.street = street;
        this.city = city;
        this.zip = zip;
    }
}


class Box {
    private int width;
    private int length;
    private int height;

    public Box(int width, int length ,int height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Box(int length){
        this.length = length;
    }
    
    public Box(){
        this.length= 10;
        this.width = 8;
        this.height= 12;
    }

    public void getVolume(){
        if (this.width == 0 && this.height == 0) {
            System.out.println(this.length * this.length * this.length);
        }else{
            System.out.println(this.length * this.width * this.height);
        }
    }
}


class BankAccount{
    private String accountNumber;
    private int balance;
    private String accountHolderName;
    private String accountHolderAddress;

    public BankAccount(String accountNumber, int balance, String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }
    
    public BankAccount() {
        this.accountNumber = "000";
        this.balance = 0;
        this.accountHolderName = "Default-Account";
        this.accountHolderAddress = "Default-Street";
    }

    public void depositMoney(int toAdd){
        this.balance += toAdd;
        System.out.println("Current Balance: "+this.balance);
    }
    public void withDrawMoney(int toSub){
        this.balance -= toSub;
        System.out.println("Current Balance: "+this.balance);
    }
    public int getBalance(){
        return this.balance;
    }
}


public class Main {
    public static void QuestionTwelve(){
        Customer cust1 = new Customer("1","Someone0","12346");
        Customer cust2 = new Customer("2","Someone1","12347");
        for(String i: cust1.getStuff()){
            System.out.println(i);
        }
        cust1.setStuff("2","ChangedSomeone","342423");
        for(String i: cust1.getStuff()){
            System.out.println(i);
        }
    }

    public static void QuestionTen(){
        Address addr = new Address("something","Kathmandu","44600");
        for(String i: addr.getStuff()){
            System.out.println(i);
        }
    }

    public static void QuestionNine(){
        Box cube= new Box(10);
        Box cuboid = new Box(10,10,10);
        Box noParam = new Box();
        cube.getVolume();
        cuboid.getVolume();
        noParam.getVolume();

    }
    public static void QuestionSix(){
        Lamp lamp = new Lamp();
        lamp.turnOn();
        lamp.turnOff();

    }
    public static void QuestionThree(){
        BankAccount account = new BankAccount("12345",1000,"Someone","Kathmandu");
        BankAccount account2 = new BankAccount();
        account.depositMoney(200);
        account.withDrawMoney(100);
        System.out.println(account.getBalance());
    }
    public static void QuestionTwo(){
        double[] numbers = {1.1, 2.2, 3.3, 4.4, 5.5};
        double sum = 0;
        for(double i:numbers){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void QuestionOne(){
        int a[] = {1,2,3,4,5};
        for (int i = a.length - 1; i>=0 ; i--) {
            System.out.println(a[i]); 
        }
    }
    public static void main(String[] args) {
        //QuestionOne();
        //QuestionTwo();
        //QuestionSix();
        QuestionThree();
        //QuestionNine();
        //QuestionTen();
        //QuestionTwelve();

    }
}
