package ProgByDoing;

/**
 *
 * @author Lawal Nafiu
 */
import java.util.Scanner;
public class AreaCalculator {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int r, l , b, h, w;
        int reply;
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("1. Triangle\n2. Rectangle\n3. Square\n4. Circle\n5. Quit\n Which shape: ");
        reply = kb.nextInt();
        if ( reply == 1){
            System.out.println("Base: ");
            b = kb.nextInt();
            System.out.println("Height: ");
            h = kb.nextInt();
            System.out.println("The Area is " + area_triangle(b,h));         
        }
        else if( reply == 2){
            System.out.println("Length : ");
            l = kb.nextInt();
            System.out.println("Width: ");
            w = kb.nextInt();
            System.out.println("The Area is " + area_rectangle(l,w));
        }
        else if( reply == 4){
            System.out.println("Radius : "); 
            r = kb.nextInt();
            System.out.println("The Area is " + area_circle(r));
        }
        else if( reply == 3){
            System.out.println("Length : ");
            l = kb.nextInt();
            System.out.println("The Area is " + area_square(l));
        }
        else{
            System.out.println("Goodbye!");
        }
        
    }
    public static double area_circle(int r){
        return ( Math.PI*r*r);
    }
    public static int area_rectangle( int length, int width ){
        return (length*width);
    }
    public static int area_square( int side ){
        return (side*side);
    }
    public static double area_triangle( int base, int height ){
        return (0.5 * base * height);
    }
    
}
