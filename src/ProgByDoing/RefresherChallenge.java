package ProgByDoing;


import java.util.Scanner;

/**
 *
 * @author Lawal Nafiu
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
