package ProgByDoing;

import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author Lawal Nafiu
 */


public class ClockFace extends Canvas{
    public void paint(Graphics g){
        g.drawOval(50, 50, 400, 400);
        g.fillOval(245, 245, 10, 10);
        g.drawString("1", 335, 95);
        g.drawString("2", 410, 160);
        g.drawString("4", 410, 350);
        g.drawString("5", 335, 415);
        g.drawString("7", 155, 420);
        g.drawString("8", 85, 355);
        g.drawString("10", 80, 170);
        g.drawString("11", 150, 90);
        g.drawLine(250,250, 70, 250);
        g.drawLine(250,250, 120, 320);
        
        g.setFont(new Font("Sans-Serif", Font.BOLD, 20));
        g.drawString("A CLOCK FACE", 170, 40);
        g.drawString("12", 240, 70);
        g.drawString("3", 435, 260);
        g.drawString("9", 55, 260);
        g.drawString("6", 240, 445);
    }
    public static void main(String[] args){
        JFrame win = new JFrame("A Clock Face");
        win.setSize(500,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setAlwaysOnTop(true);
        win.setLocation(300,100);
        win.add(new ClockFace());
        win.setVisible(true);
    }
    
}
