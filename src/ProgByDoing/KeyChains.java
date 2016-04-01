package ProgByDoing;

/**
 *
 * @author Lawal Nafiu
 */
import java.util.Scanner;
public class KeyChains {
    public static void main (String args[]){
        Scanner kb = new Scanner(System.in);
        int reply;
        System.out.println("Ye Olde Keychain Shoppe");
        while(true){
            System.out.println("1. Add Keychains to order\n2. Remove keychaons from oder\n3.View Current Order\n4.Checkout");
            System.out.println("Please enter your choice:");
            reply = kb.nextInt();
            if ( reply == 1){
                Addkeychains();
            }
            else if ( reply == 2){
                Removekeychains();
            }
            else if ( reply == 3){
                ViewCurrent();
            }
            else if( reply == 4){
                Checkout();
                break;
            }
        }
    }
    public static void Addkeychains(){
        
    }
    public static void Removekeychains(){
        
    }
    public static void ViewCurrent(){
        
    }
    public static void Checkout(){
        System.out.println("CHECKOUT");
    }
    
}
