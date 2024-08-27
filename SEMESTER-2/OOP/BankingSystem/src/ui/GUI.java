package ui;

import java.util.LinkedList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import banking.Account;
import banking.Transaction;
import io.WriteAccounts;

public class GUI extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private Transaction transferObject;
    private StringBuilder sbAllData;
    private LinkedList<Account> globalAccounts;
    private WriteAccounts writerObject;

    private JLabel showAllData;
    private JButton showAllButton;

    private JTextField accDeposit, depositInput;
    private JButton depositButton;

    private JTextField withdrawInput, accWithdraw;
    private JButton withdrawButton;

    private JTextField acc1Transfer, acc2Transfer, transferAmount;
    private JButton transferButton;

    private JButton nextButton, previousButton;

    private JTable accountTable;
    private JScrollPane scrollPane;

    public GUI(LinkedList<Account> accounts) {
        globalAccounts = accounts;
        sbAllData = new StringBuilder();
        transferObject = new Transaction();
        writerObject = new WriteAccounts("../data/accounts.csv");
        HandlerClass handler = new HandlerClass(this);  // Pass the GUI instance

        // Set up the CardLayout and main panel
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Set up each section
        setupShowAllPanel(handler);
        setupDepositPanel(handler);
        setupWithdrawPanel(handler);
        setupTransferPanel(handler);

        // Navigation buttons
        nextButton = new JButton("Next");
        previousButton = new JButton("Previous");
        nextButton.addActionListener(e -> cardLayout.next(cardPanel));
        previousButton.addActionListener(e -> cardLayout.previous(cardPanel));

        JPanel navigationPanel = new JPanel(new FlowLayout());
        navigationPanel.add(previousButton);
        navigationPanel.add(nextButton);

        // Set up the JFrame
        setTitle("Banking GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(cardPanel, BorderLayout.CENTER);
        add(navigationPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void setupShowAllPanel(HandlerClass handler) {
        JPanel showAllPanel = new JPanel(new BorderLayout());
        String[] columnNames = {"Account Number", "First Name", "Last Name", "Balance"};
        Object[][] data = {};  
        accountTable = new JTable(data, columnNames);
        scrollPane = new JScrollPane(accountTable);

        showAllButton = new JButton("Refresh");
        showAllButton.addActionListener(handler);

        showAllPanel.add(scrollPane, BorderLayout.CENTER);
        showAllPanel.add(showAllButton, BorderLayout.SOUTH);

        cardPanel.add(showAllPanel, "Show All");
    }

    private void setupDepositPanel(HandlerClass handler) {
        JPanel depositPanel = new JPanel();
        depositPanel.setLayout(new BoxLayout(depositPanel, BoxLayout.Y_AXIS));  // Stack items vertically

        // Placeholder for user profile image
        depositPanel.add(new JLabel(new ImageIcon("../data/images/deposit_image.png")) {{
            setAlignmentX(Component.CENTER_ALIGNMENT);  // Center the image
        }});
        depositPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Add some vertical spacing

        // Add account deposit label and text field
        depositPanel.add(new JLabel("Deposit Into Account:") {{
            setAlignmentX(Component.CENTER_ALIGNMENT);
        }});
        depositPanel.add(new JTextField(10) {{
            setMaximumSize(new Dimension(200, 30));  // Set preferred size
            setAlignmentX(Component.CENTER_ALIGNMENT);  // Center the text field
            accDeposit = this;  // Assigning the text field to the variable
        }});
        depositPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Spacing between fields

        // Add deposit amount label and text field
        depositPanel.add(new JLabel("Deposit Amount:") {{
            setAlignmentX(Component.CENTER_ALIGNMENT);
        }});
        depositPanel.add(new JTextField(10) {{
            setMaximumSize(new Dimension(200, 30));  // Set preferred size
            setAlignmentX(Component.CENTER_ALIGNMENT);  // Center the text field
            depositInput = this;  // Assigning the text field to the variable
        }});
        depositPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Spacing before the button

        // Add deposit button
        depositPanel.add(new JButton("Deposit") {{
            addActionListener(handler);
            setAlignmentX(Component.CENTER_ALIGNMENT);  // Center the button
            depositButton = this;  // Assigning the button to the variable
        }});

        // Add this panel to the card panel (CardLayout)
        cardPanel.add(depositPanel, "Deposit");
    }


    private void setupWithdrawPanel(HandlerClass handler) {
        JPanel withdrawPanel = new JPanel();
        withdrawPanel.setLayout(new BoxLayout(withdrawPanel, BoxLayout.Y_AXIS));  // Stack items vertically

        // Placeholder for user profile image
        withdrawPanel.add(new JLabel(new ImageIcon("../data/images/withdraw_image.png")) {{
            setAlignmentX(Component.CENTER_ALIGNMENT);  // Center the image
        }});
        withdrawPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Add some vertical spacing

        // Add account withdraw label and text field
        withdrawPanel.add(new JLabel("Withdraw From Account:") {{
            setAlignmentX(Component.CENTER_ALIGNMENT);
        }});
        withdrawPanel.add(new JTextField(10) {{
            setMaximumSize(new Dimension(200, 30));  // Set preferred size
            setAlignmentX(Component.CENTER_ALIGNMENT);  // Center the text field
            accWithdraw = this;  // Assigning the text field to the variable
        }});
        withdrawPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Spacing between fields

        // Add withdraw amount label and text field
        withdrawPanel.add(new JLabel("Withdraw Amount:") {{
            setAlignmentX(Component.CENTER_ALIGNMENT);
        }});
        withdrawPanel.add(new JTextField(10) {{
            setMaximumSize(new Dimension(200, 30));  // Set preferred size
            setAlignmentX(Component.CENTER_ALIGNMENT);  // Center the text field
            withdrawInput = this;  // Assigning the text field to the variable
        }});
        withdrawPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Spacing before the button

        // Add withdraw button
        withdrawPanel.add(new JButton("Withdraw") {{
            addActionListener(handler);
            setAlignmentX(Component.CENTER_ALIGNMENT);  // Center the button
            withdrawButton = this;  // Assigning the button to the variable
        }});

        // Add this panel to the card panel (CardLayout)
        cardPanel.add(withdrawPanel, "Withdraw");
    }


    private void setupTransferPanel(HandlerClass handler) {
        JPanel transferPanel = new JPanel();
        transferPanel.setLayout(new BoxLayout(transferPanel, BoxLayout.Y_AXIS));  // Stack items vertically

        // Add components to the panel (in vertical order)
        transferPanel.add(new JLabel(new ImageIcon("../data/images/transfer_image.png")) {{
            setAlignmentX(Component.CENTER_ALIGNMENT);
        }});
        transferPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Add vertical spacing

        transferPanel.add(new JLabel("Transfer From Account:") {{
            setAlignmentX(Component.CENTER_ALIGNMENT);
        }});
        transferPanel.add(new JTextField(10) {{
            setMaximumSize(new Dimension(200, 30));
            setAlignmentX(Component.CENTER_ALIGNMENT);
            acc1Transfer = this;  // Assigning the text field to the variable
        }});
        transferPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Spacing between fields

        transferPanel.add(new JLabel("Transfer To Account:") {{
            setAlignmentX(Component.CENTER_ALIGNMENT);
        }});
        transferPanel.add(new JTextField(10) {{
            setMaximumSize(new Dimension(200, 30));
            setAlignmentX(Component.CENTER_ALIGNMENT);
            acc2Transfer = this;  // Assigning the text field to the variable
        }});
        transferPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Spacing between fields

        transferPanel.add(new JLabel("Transfer Amount:") {{
            setAlignmentX(Component.CENTER_ALIGNMENT);
        }});
        transferPanel.add(new JTextField(10) {{
            setMaximumSize(new Dimension(200, 30));
            setAlignmentX(Component.CENTER_ALIGNMENT);
            transferAmount = this;  // Assigning the text field to the variable
        }});
        transferPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Spacing before the button

        transferPanel.add(new JButton("Transfer") {{
            addActionListener(handler);
            setAlignmentX(Component.CENTER_ALIGNMENT);
            transferButton = this;  // Assigning the button to the variable
        }});

        // Add this panel to the card panel (CardLayout)
        cardPanel.add(transferPanel, "Transfer");
    }

    private class HandlerClass implements ActionListener {
        private GUI mainFrame;  // Reference to the main GUI frame

        public HandlerClass(GUI frame) {
            this.mainFrame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == showAllButton) {
                handleShowAll();
            } else if (e.getSource() == depositButton) {
                handleDepositOrWithdraw(false);
            } else if (e.getSource() == withdrawButton) {
                handleDepositOrWithdraw(true);
            } else if (e.getSource() == transferButton) {
                handleTransfer();
            } else {
                System.out.println("Error");
            }
        }

        private void handleShowAll() {
            System.out.println("Show All button clicked!");
            Object[][] accountData = new Object[globalAccounts.size()][4];
            for (int i = 0; i < globalAccounts.size(); i++) {
                Account acc = globalAccounts.get(i);
                accountData[i][0] = acc.getAccountNum();
                accountData[i][1] = acc.getFirstName();
                accountData[i][2] = acc.getLastName();
                accountData[i][3] = acc.getBalance();
            }
            String[] columnNames = {"Account Number", "First Name", "Last Name", "Balance"};
            accountTable.setModel(new javax.swing.table.DefaultTableModel(accountData, columnNames));
            accountTable.repaint();
        }

        private void handleDepositOrWithdraw(boolean isWithdraw) {
            String amountStr, accountNumStr;
            JTextField accountField, amountField;

            if (isWithdraw) {
                accountField = accWithdraw;
                amountField = withdrawInput;
            } else {
                accountField = accDeposit;
                amountField = depositInput;
            }

            amountStr = amountField.getText();
            accountNumStr = accountField.getText();

            if (amountStr != null && !amountStr.isEmpty() && accountNumStr != null && !accountNumStr.isEmpty()) {
                try {
                    int amount = Integer.parseInt(amountStr);
                    boolean success = false;

                    if (amount <= 0) {
                        JOptionPane.showMessageDialog(mainFrame, 
                            "Invalid amount. Please enter a positive number.", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    for (Account acc : globalAccounts) {
                        if ((""+acc.getAccountNum()).equals(accountNumStr)) {
                            if (isWithdraw) {
                                if (amount > acc.getBalance()) {
                                    JOptionPane.showMessageDialog(mainFrame, 
                                        "Not Enough Money", 
                                        "Error", 
                                        JOptionPane.ERROR_MESSAGE);
                                    return;
                                }
                                acc.withdraw(amount);
                            } else {
                                acc.deposit(amount);
                            }
                            success = true;
                            break;
                        }
                    }

                    if (success) {
                        String operation = isWithdraw ? "Withdrew" : "Deposited";
                        System.out.println(operation + " " + amount + " to account " + accountNumStr);
                        writerObject.saveChanges(globalAccounts);
                    } else {
                        JOptionPane.showMessageDialog(mainFrame, 
                            "Account not found.", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(mainFrame, 
                        "Invalid amount. Please enter a valid number.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(mainFrame, 
                    "No amount or account number provided.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }

        }

        private void handleTransfer() {
            String acc1NumStr = acc1Transfer.getText();
            String acc2NumStr = acc2Transfer.getText();
            String transferAmountStr = transferAmount.getText();

            if (acc1NumStr == null || acc1NumStr.isEmpty() || acc2NumStr == null || acc2NumStr.isEmpty() || transferAmountStr == null || transferAmountStr.isEmpty()) {
                JOptionPane.showMessageDialog(mainFrame, 
                    "Missing account number(s) or transfer amount.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                int transferAmount = Integer.parseInt(transferAmountStr);
                if (transferAmount <= 0) {
                    JOptionPane.showMessageDialog(mainFrame, 
                        "Invalid amount. Please enter a positive number.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Account acc1 = null;
                Account acc2 = null;

                // Find the accounts from the global list
                for (Account acc : globalAccounts) {
                    if (String.valueOf(acc.getAccountNum()).equals(acc1NumStr)) {
                        acc1 = acc;
                    } else if (String.valueOf(acc.getAccountNum()).equals(acc2NumStr)) {
                        acc2 = acc;
                    }
                    if (acc1 != null && acc2 != null) break;
                }

                if (acc1 == null || acc2 == null) {
                    JOptionPane.showMessageDialog(mainFrame, 
                        "Account not found.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (acc1.getBalance() < transferAmount) {
                    JOptionPane.showMessageDialog(mainFrame, 
                        "Not Enough Money To Send", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }

                transferObject.transfer(acc1, acc2, transferAmount);
                JOptionPane.showMessageDialog(mainFrame, 
                    "Transferred " + transferAmount + " from account " + acc1NumStr + " to account " + acc2NumStr, 
                    "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
                writerObject.saveChanges(globalAccounts);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(mainFrame, 
                    "Invalid transfer amount. Please enter a valid number.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}
