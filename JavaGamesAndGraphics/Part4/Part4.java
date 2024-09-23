import java.awt.*;
import javax.swing.*;

public class Part4 extends JFrame {

    public Part4() {
        setTitle("Snowman Drawing");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawSnowman(g);
    }

    public void drawSnowman(Graphics g) {
        drawBody(g);
        drawHead(g);
        drawLimbs(g);
    }

    public void drawHead(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(150, 50, 100, 100); // Head

        
        g.setColor(Color.black);
        g.fillOval(170, 80, 10, 10); // Left eye
        g.fillOval(210, 80, 10, 10); // Right eye

        
        g.setColor(Color.orange);
        int[] xPoints = {195, 205, 200};
        int[] yPoints = {90, 90, 100};
        g.fillPolygon(xPoints, yPoints, 3); // Nose 
    }

    public void drawBody(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(100, 150, 200, 200); // Body
    }

    public void drawLimbs(Graphics g) {
        g.setColor(Color.white);

        // Draw arms
        g.drawLine(120, 180, 80, 130); // Left arm
        g.drawLine(280, 180, 320, 130); // Right arm

        // Draw legs
        g.drawLine(170, 350, 130, 300); // Left leg
        g.drawLine(230, 350, 270, 300); // Right leg
    }

    public static void main(String[] args) {
        new Part4();
    }
}
