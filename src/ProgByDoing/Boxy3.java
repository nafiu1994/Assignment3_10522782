package ProgByDoing;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Nafiu
 */
public class Boxy3 extends Canvas{
    public void paint(Graphics g){
        this.drawBox(g, Color.green, 567,300, 50, 30);
        this.drawBox(g, Color.cyan, 379,220, 230, 23);
        this.drawBox(g, Color.gray, 23,32, 243, 126);
        this.drawBox(g, Color.blue, 100,80, 234, 150);
        this.drawBox(g, Color.red, 423,345, 123, 30);
        this.drawBox(g, Color.orange, 50,220, 54, 213);
        this.drawBox(g, Color.magenta, 600,130, 132, 321);
        this.drawBox(g, Color.yellow, 412,398, 67, 96);
    }
    public void drawBox(Graphics window, Color c, int x, int y, int w, int h){
        window.setColor(c);
        window.fillRect(x, y, w, h);
        window.setColor(Color.white);
        window.fillRect(x+10,y+10,w-20,h-20);
    }
    public static void main(String [] args){
        JFrame win = new JFrame("Four Boxes");
        win.setSize(800,600);
        win.setAlwaysOnTop(true);
        win.setBackground(Color.white);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Boxy3());
        win.setVisible(true);
    }
    
}
