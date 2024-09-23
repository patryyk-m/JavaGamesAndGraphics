import javax.swing.*;
import java.awt.*;

public class Part3 extends JFrame {

    public Part3() {
        setTitle("Adventure Game");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton startButton = new JButton("Start Adventure");
        startButton.addActionListener(e -> {
            Options();
        });

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(startButton);

        pack();
        setSize(400, 300);
        setVisible(true);
    }

    private void Options() {
        String[] options = {"Portal 1", "Portal 2", "Portal 3"};
        int choice = JOptionPane.showOptionDialog(this,
                "Choose a portal to enter:",
                "Adventure Begins!",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);

        if (choice == 0) {
            pathOne();
        } else if (choice == 1) {
            pathTwo();
        } else if (choice == 2) {
            pathThree();
        }
    }

    private void pathOne() {
        int decision = JOptionPane.showConfirmDialog(this,
                "You encounter an alien. Do you greet the alien?",
                "Alien Encounter",
                JOptionPane.YES_NO_OPTION);

        if (decision == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this,
                    "The alien welcomes you and gives you a gift.",
                    "Outcome",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "The alien feels offended and asks you to leave.",
                    "Outcome",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void pathTwo() {
        int decision = JOptionPane.showConfirmDialog(this,
                "You find a mysterious artifact. Do you pick it up?",
                "Mysterious Artifact",
                JOptionPane.YES_NO_OPTION);

        if (decision == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this,
                    "The artifact grants you special powers!",
                    "Outcome",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "You decide to leave the artifact untouched.",
                    "Outcome",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void pathThree() {
        int decision = JOptionPane.showConfirmDialog(this,
                "You come across a hidden passage. Do you explore it?",
                "Hidden Passage",
                JOptionPane.YES_NO_OPTION);

        if (decision == JOptionPane.YES_OPTION) {
            ImageIcon customImage = new ImageIcon("trs.png"); // Replace 'trs.png' with your image path
            JOptionPane.showMessageDialog(this,
                    "You discover a treasure!",
                    "Outcome",
                    JOptionPane.INFORMATION_MESSAGE,
                    customImage);
        } else {
            JOptionPane.showMessageDialog(this,
                    "You decide not to explore the passage.",
                    "Outcome",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Part3();
    }
}
