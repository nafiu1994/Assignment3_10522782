package ProgByDoing;
import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Lawal Nafiu
 */
public class SmilingFaceFunction extends Canvas {

    public void paint(Graphics g) {
        drawSmilingFace(g, 100, 100);
        drawSmilingFace(g, 400, 350);
    }
    public void drawSmilingFace(Graphics g, int x, int y){
        g.setColor(Color.yellow);
        g.fillOval(x, y, 100, 100);
        g.setColor(Color.blue);
        g.fillOval(x+25, y+30, 15, 15);
        g.fillOval(x+65, y+30, 15, 15);
        g.drawArc(x+25, y+30, 50, 50, 225, 90);
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("A Smiling Face Function");
        win.setSize(1024, 768);
        win.setAlwaysOnTop(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new SmilingFaceFunction());
        win.setVisible(true);
    }
}
