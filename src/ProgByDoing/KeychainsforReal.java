package ProgByDoing;


import java.util.Scanner;

/**
 *
 * @author Lawal Nafiu
 */
public class KeychainsforReal {
        public static void main (String args[]){
        Scanner kb = new Scanner(System.in);
        int reply, price = 10, num = 0;
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
                View_order(num, price);
            }
            else if( reply == 4){
                Checkout(num, price);
                break;
            }
        }
    }
        
    public static int Addkeychains(int c){
        Scanner kbr = new Scanner(System.in);
        int x = 0;
        System.out.println("You have " + c + " Keychains.\nHow many to add?");
        x = kbr.nextInt();
        System.out.println("You now have "+ (c+x) + " keychains");
        return (x+c);
       
    }
    public static int Removekeychains(int c){
        Scanner kbr = new Scanner(System.in);
        int x = 0;
        System.out.println("You have " + (c+x) +" keychains.\nHow many to remove? " );
        x = kbr.nextInt();
        System.out.println("You now have " + (c-x) +" keychains.\n " );
        return (c-x);     
    }
    public static void View_order(int c, int p){
        System.out.println("You have " + c + " chains.\nKeychains cost $" + p + ".\nTotal cost is $" + (c*p) +"."  );
        
        
    }
    public static void Checkout( int c, int p){
        Scanner kbr = new Scanner(System.in);
        System.out.println("What is your name? ");
        String x = kbr.next();
        View_order(c, p);
        System.out.println("Thanks for your order " + x +".");
    }
    
}
