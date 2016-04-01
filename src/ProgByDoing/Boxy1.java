package ProgByDoing;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Nafiu
 */
public class Boxy1 extends Canvas{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(20,20, 100, 100);
        g.setColor(Color.white);
        g.fillRect(30,30, 80, 80);
        g.setColor(Color.cyan);
        g.fillRect(200,100, 100, 100);
        g.setColor(Color.white);
        g.fillRect(210,110, 80, 80);
        g.setColor(Color.green);
        g.fillRect(150,450, 100, 100);
        g.setColor(Color.white);
        g.fillRect(160,460, 80, 80);
        g.setColor(Color.orange);
        g.fillRect(310,300, 100, 100);
        g.setColor(Color.white);
        g.fillRect(320,310, 80, 80);
    }
    public static void main(String [] args){
        JFrame win = new JFrame("Four Boxes");
        win.setSize(800,600);
        win.setBackground(Color.white);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Boxy1());
        win.setVisible(true);
    }
    
}
