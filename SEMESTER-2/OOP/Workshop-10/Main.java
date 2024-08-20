import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.add(new JLabel("Card 1", SwingConstants.CENTER), "Card 1");
        cardPanel.add(new JLabel("Card 2", SwingConstants.CENTER), "Card 2");
        cardPanel.add(new JLabel("Card 3", SwingConstants.CENTER), "Card 3");

        JButton nextButton = new JButton("Next");
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(nextButton, BorderLayout.SOUTH);

        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        nextButton.addActionListener(e -> cardLayout.next(cardPanel));

        frame.setVisible(true);
    }
}

