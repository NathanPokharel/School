package io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import banking.Account;
import io.ReadAccounts;

public class WriteAccounts {
    private String url;
    public WriteAccounts (String url){
        this.url = url;
    }
    public void saveChanges(LinkedList<Account> accounts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(url))) {
            for (Account acc : accounts) {
                String line = acc.getFirstName() + "," +
                              acc.getLastName() + "," +
                              acc.getAccountNum() + "," +
                              acc.getBalance();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Accounts saved to " + url);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

