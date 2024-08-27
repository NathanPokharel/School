package banking;

public class Account extends Customer {
    private int balance;
    private int accountNumber;

    public Account (String Fname, String Lname, int accNum, int accBal){
        firstName = Fname;
        lastName = Lname;
        accountNumber = accNum;
        balance = accBal;
    }

    //Setters and getters
    public int getBalance() { return balance; }
    public int getAccountNum() { return accountNumber; }
    public void deposit(int amount) { balance += amount; }
    public void withdraw(int amount) { balance -= amount; }

}


