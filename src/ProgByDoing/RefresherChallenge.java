package ProgByDoing;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUMINA BFS
 */
public class RefresherChallenge {
    public static void main(String [] args){
        int i = 10;
        Scanner keyboard = new Scanner(System.in);
      System.out.print("What is your name: ");
      String name = keyboard.next();
      if ( name.equalsIgnoreCase("Mitchell"))
          i = 5;
      
      for (int k =0; k<i; k++)
          System.out.println(name);
    }
    
}
