package ProgByDoing;


import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas{
    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.fillOval(100,100,200,200);
    }
    public static void main(String []args){
        JFrame window = new JFrame("A Circle");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(480,500);
        Circle canvas = new Circle();
        window.add(canvas);
        window.setVisible(true);
    }
}
