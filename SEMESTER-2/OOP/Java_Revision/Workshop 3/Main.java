class BankAccount {
    public double accNum,balance;
    public String accHolder,accHolderAddr;

    public BankAccount(double accnum,double balance, String name, String address){
        accNum = accnum;
        balance = balance;
        accHolderAddr = name;
        accHolderAddr = address;
    }
    BankAccount(){
        System.out.println("Acc Created");
    }
}
public class Main {
    public static void main(String[] args) {
        //double[] numbers = {1.5, 2.5, 3.5, 4.5, 5.5};

        //double sum = java.util.Arrays.stream(numbers).sum();
        //double average = java.util.Arrays.stream(numbers).average().orElse(0.0);

        //// Print the results
        //System.out.println("Sum: " + sum);
        //System.out.println("Average: " + average);
        BankAccount account = new BankAccount(12345.0,12345,"Nathan","Somwhere");
        BankAccount account1 = new BankAccount();
        System.out.println(account.accNum);
    }

}
