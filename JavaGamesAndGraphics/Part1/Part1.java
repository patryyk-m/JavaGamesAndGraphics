import javax.swing.*;
import java.awt.event.*;

public class Part1 extends JFrame implements ActionListener {
    JDesktopPane desktop;

    public Part1() {
        setTitle("Games Menu");

        int inset = 50;
        setSize(800, 600); // Setting JFrame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        desktop = new JDesktopPane();
        setContentPane(desktop);
        setJMenuBar(createMenuBar());

        desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
    }

    protected JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu gamesMenu = new JMenu("Games Menu");

        JMenuItem chessMenuItem = new JMenuItem("Launch Chess Game");
        chessMenuItem.setActionCommand("chess");
        chessMenuItem.addActionListener(this);
        gamesMenu.add(chessMenuItem);

        JMenuItem snakesMenuItem = new JMenuItem("Launch Snakes and Ladders");
        snakesMenuItem.setActionCommand("snakes");
        snakesMenuItem.addActionListener(this);
        gamesMenu.add(snakesMenuItem);

        menuBar.add(gamesMenu);

        return menuBar;
    }

    public void actionPerformed(ActionEvent e) {
        if ("chess".equals(e.getActionCommand())) {
            launchInternalFrame("Chess Board", "../images/chess.jpg");
        } else if ("snakes".equals(e.getActionCommand())) {
            launchInternalFrame("Snakes and Ladders", "../images/snakes.jpg");
        }
    }

    protected void launchInternalFrame(String title, String imageName) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        JLabel imageLabel = new JLabel(new ImageIcon(imageName));
        internalFrame.add(imageLabel);
        internalFrame.pack();
        internalFrame.setVisible(true);
        desktop.add(internalFrame);

        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Part1 frame = new Part1();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}