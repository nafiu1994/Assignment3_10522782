package ProgByDoing;
import java.util.Scanner;

/**
 *
 * @author Lawal Nafiu
 */
public class OdometerLoops
{
    public static void main( String[] args ) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which base (2-10):  ");
        int n = keyboard.nextInt();
        
        for ( int thous=0; thous<n; thous++ )
        {
            for ( int hund=0; hund<n; hund++ )
            {
                for ( int tens=0; tens<n; tens++ )
                {
                    for ( int ones=0; ones<n; ones++ )
                    {
                        System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r");
                        Thread.sleep(500);
                    }
                }System.out.println();
            }
        }

        System.out.println();
    }
}
/*
    1. There was no change in the output

*/