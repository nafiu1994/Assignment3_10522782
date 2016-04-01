package ProgByDoing;


import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas{
    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0,0, 400,400);
        g.setColor(Color.black);    
        g.drawOval(70,50,220,200);
        g.fillOval(180, 148, 5, 5);
        g.drawLine(180,150,90,150);
        g.drawLine(180,150,100,185);
        g.setFont(new Font("default", Font.BOLD, 20));
        g.drawString("12", 178, 70);
        g.drawString("6", 178, 245);
        g.drawString("3", 275, 155);
        g.drawString("9", 75, 155);
        g.setFont(new Font("default", Font.BOLD, 10));
        g.drawString("12", 178, 70);
        g.drawString("6", 178, 245);
        g.drawString("3", 275, 155);
        g.drawString("9", 75, 155);
        
    }
    public static void main(String [] args){
        JFrame wn = new JFrame("A Smiling Face");
        wn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wn.setSize(400, 400);
        wn.setAlwaysOnTop(true);
        ClockFace panel = new ClockFace();
        wn.add(panel);
        wn.setVisible(true);
    }
    
}
