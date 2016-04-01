package ProgByDoing;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Nafiu
 */
public class Boxy2 extends Canvas{
    public void paint(Graphics g){
        this.drawBox(g, Color.cyan, 50,80);
        this.drawBox(g, Color.yellow, 10,10);
        this.drawBox(g, Color.green, 500,34);
        this.drawBox(g, Color.blue, 534,358);
        this.drawBox(g, Color.red, 210,5);
        this.drawBox(g, Color.magenta, 130,174);
        this.drawBox(g, Color.PINK, 450,146);
        this.drawBox(g, Color.LIGHT_GRAY, 600,180);
        this.drawBox(g, Color.green, 578,378);
        this.drawBox(g, Color.red, 689,123);
        this.drawBox(g, Color.blue, 234,143);
        this.drawBox(g, Color.black, 223,358);
        
    }
    public void drawBox(Graphics window, Color c, int x, int y){
        window.setColor(c);
        window.fillRect(x, y, 100, 100);
        window.setColor(Color.white);
        window.fillRect(x+10,y+10,80,80);
    }
    public static void main(String [] args){
        JFrame win = new JFrame("Four Boxes");
        win.setSize(800,600);
        win.setAlwaysOnTop(true);
        win.setBackground(Color.white);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Boxy2());
        win.setVisible(true);
    }
    
}
