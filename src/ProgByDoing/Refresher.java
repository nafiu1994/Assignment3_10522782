package ProgByDoing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUMINA BFS
 */
import java.util.Scanner;
public class Refresher {
    public static void main(String [] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("What is your name: ");
      String name = keyboard.next();
      
      for (int i =0; i<10; i++)
          System.out.println(name);
    }
}
