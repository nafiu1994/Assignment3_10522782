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
public class KeychainsUltimate {
    public static void main (String args[]){
        Scanner kb = new Scanner(System.in);
        int reply, price = 10, num = 0,  extra = 1;
        double tax = 0.0825, shipcost = 5.0;
        System.out.println("Ye Olde Keychain Shoppe");
        while(true){
            System.out.println("\n1. Add Keychains to order\n2. Remove keychains from oder\n3.View Current Order\n4.Checkout");
            System.out.println("Please enter your choice:");
            reply = kb.nextInt();
            if ( reply == 1){
               num = Addkeychains( num );
            }
            else if ( reply == 2){
               num = Removekeychains(num);
            }
            else if ( reply == 3){
                View_order(num, price,shipcost, tax, extra);
            }
            else if( reply == 4){
                Checkout(num, price,shipcost, tax, extra);
                break;
            }
            else{
                System.out.println("Wrong choice, choose again!");
            }
        }
    }
        
    public static int Addkeychains(int c){
        Scanner kbr = new Scanner(System.in);
        int x = 0;
        System.out.println("You have " + c + " Keychains.\nHow many to add?");
        x = kbr.nextInt();
        while(x<0){
            System.out.println("Enter postive numbers only! ");
            x = kbr.nextInt();
        }
        System.out.println("You now have "+ (c+x) + " keychains");
        return (x+c);
       
    }
    public static int Removekeychains(int c){
        Scanner kbr = new Scanner(System.in);
        int x = 0;
        System.out.println("You have " + (c+x) +" keychains.\nHow many to remove? " );
        x = kbr.nextInt();
        while( (c-x) < 0){
            System.out.println("Not enough chains to remove, Please enter a smaller number.");
            x = kbr.nextInt();
        }
        System.out.println("You now have " + (c-x) +" keychains.\n " );
        return (c-x);     
    }
    public static void View_order(int c, int p, double scost, double tax, int perchain){
        System.out.println("You have " + c + " chains.\nKeychains cost $" + p + "."  );
        System.out.println("Shipping charges $" + (scost) + ". ");
        System.out.println("Subtotal before tax " + (c*p) +".");
        System.out.println("Tax on the order " + (tax*100) + "%.");
        System.out.println("Final cost of order = $" + (  (tax*p*c) + (c*perchain) +scost +(c*p)) +"." );
        
    }
    public static void Checkout( int c, int p, double scost, double tax, int perchain){
        Scanner kbr = new Scanner(System.in);
        System.out.println("What is your name? ");
        String x = kbr.next();
        View_order(c, p, scost,  tax, perchain);
        System.out.println("Thanks for your order " + x +".");
    }
}
