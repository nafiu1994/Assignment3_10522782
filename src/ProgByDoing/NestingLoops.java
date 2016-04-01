package ProgByDoing;



public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++  )
            {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            // * You will add a line of code here.
            System.out.println();
        }

        System.out.println("\n");

    }
}
/*
    1. The variable n changes faster than the one in the outer loop(c).
    2. The output changes. The variable n changes slower than c.
    3. There is a new line after every output.
    4. The print statements of the inner loop is on 
       a newline after every change in the outer loop.
*/
