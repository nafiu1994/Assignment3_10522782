package ProgByDoing;


import java.awt.*;
import javax.swing.JFrame;
public class SmilingFace extends Canvas {

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 400, 500);
        g.setColor(Color.yellow);
        g.fillOval(95, 100, 200, 200);
        g.setColor(Color.blue);
        g.fillOval(140, 150, 40, 40);
        g.fillOval(210,150,40,40);
        g.setColor(Color.red);
        g.drawArc(138,130,120,120,225,90);
        
        
        
    }
    public static void main(String [] args){
        JFrame wn = new JFrame("A Smiling Face");
        wn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wn.setSize(400, 500);
        SmilingFace panel = new SmilingFace();
        wn.add(panel);
        wn.setVisible(true);
    }
}
