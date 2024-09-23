import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;

public class Part2 extends JFrame {

    JPanel panel = new JPanel(new GridLayout(2, 1));
    JLabel imageLabel = new JLabel("Choose an image here", JLabel.CENTER);
    JLabel colorLabel = new JLabel("Choose a color here", JLabel.CENTER);

    ImageIcon selectedImage = null; 

    public Part2() {
        setTitle("Part2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setResizable(true);

        imageLabel.setBorder(new LineBorder(Color.BLACK, 2));
        colorLabel.setBorder(new LineBorder(Color.BLACK, 2));

        panel.add(imageLabel);
        panel.add(colorLabel);

        add(panel);

        imageLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int optionVal = fileChooser.showOpenDialog(panel);

                if (optionVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    selectedImage = new ImageIcon(file.getAbsolutePath());
                    imageLabel.setIcon(selectedImage);
                }
            }

            public void mouseExited(MouseEvent e) {
                if (selectedImage != null && e.getSource() == imageLabel) {
                    imageLabel.setIcon(null); 
                }
            }
        });

        colorLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Color chosenColor = JColorChooser.showDialog(panel, "Choose a color", Color.WHITE);
                colorLabel.setOpaque(true);
                colorLabel.setBackground(chosenColor);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Part2();
    }
}
