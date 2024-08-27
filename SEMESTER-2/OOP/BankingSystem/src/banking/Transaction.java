package banking;

public class Transaction {
    public void transfer(Account acc1, Account acc2,int amount){
        if (amount > 0 && acc1.getBalance() >= amount) {
            acc1.withdraw(amount);
            acc2.deposit(amount);
        }
    }
}
