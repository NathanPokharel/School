public class main {
    public static void main(String[] args) {
        Account acc1 = new Account("j", "Doe", "4234234", 1000);
        Account acc2 = new Account("Jane", "fasfasf", "654321", 500);
        acc1.deposit(200);
        acc1.withdraw(100);
        Transaction.transfer(acc1, acc2, 300);
    }
}
class Customer {
    String firstName;
    String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class Account extends Customer {
    String accountNumber;
    double balance;

    public Account(String firstName, String lastName, String accountNumber, double initialBalance) {
        super(firstName, lastName);
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not Enough");
        }
    }
}

class Transaction {
    public static void transfer(Account from, Account to, double amount) {
        if (from.balance >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
        } else {
            System.out.println("Not Enough");
        }
    }
}



