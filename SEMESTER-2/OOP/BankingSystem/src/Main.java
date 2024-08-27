import banking.Account;
import banking.Transaction;
import io.ReadAccounts;
import java.util.LinkedList;
import ui.GUI;


public class Main {
    public LinkedList<Account> accounts = new LinkedList<>();
    public LinkedList<String> firstNames = new LinkedList<>();
    public LinkedList<String> lastNames = new LinkedList<>();
    public LinkedList<Integer> accountList = new LinkedList<>();
    public LinkedList<Integer> balanceList = new LinkedList<>();
    public ReadAccounts readAccounts = new ReadAccounts("../data/accounts.csv");

    public static void main(String[] args) {
        Main mainInstance = new Main();

        try {
            mainInstance.firstNames =  mainInstance.readAccounts.getFirstNames();
            mainInstance.lastNames =   mainInstance.readAccounts.getLastNames();
            mainInstance.accountList = mainInstance.readAccounts.getAccounts();
            mainInstance.balanceList = mainInstance.readAccounts.getBalances();

            for (int i = 0; i<mainInstance.firstNames.size(); i++) {
                mainInstance.accounts.add(new Account(
                    mainInstance.firstNames.get(i) ,
                    mainInstance.lastNames.get(i) ,
                    mainInstance.accountList.get(i) ,
                    mainInstance.balanceList.get(i)));
            }
        } catch (Exception e){
            System.out.println(e);
        } finally{
            new GUI(mainInstance.accounts);
        }

    }
}
