package ProgByDoing;



import java.util.Scanner;

/**
 *
 * @author Lawal Nafiu
 */
public class MoreNumberPuzzles {
    public void NumLessThan56()
    {
        int sum;
        System.out.println();
        for(int j = 10; j <= 56; j++)
        {
            sum = 0;
            for (int i = 0; i < 2; i++) 
            {
                if( i == 0)
                {
                    sum += j / 10;
                }
                else
                {
                    sum += j % 10;
                    
                }
                if(sum > 10)
                {
                    System.out.println(j);
                }
            }
        }
        System.out.println();
    }
    public void NumReverse()
    {
        System.out.println();
        int sum, reverse;
        for(int j = 10; j < 100; j++)
        {
            sum = 0;
            reverse = 0;
            for (int i = 0; i < 2; i++) 
            {
                if( i == 0)
                {
                    sum += j / 10;
                    reverse += sum;
                }
                else
                {
                    sum += j % 10;
                    reverse += (j%10) * 10;
                }
               if(sum == j - reverse)
                {
                    System.out.println(j + " " + reverse);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int usr;
        do
        {
            System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
            System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
            System.out.println("3) Quit");
            usr = kb.nextInt();
            if(usr == 1)
            {
                new MoreNumberPuzzles().NumLessThan56();
            }
            else if (usr == 2)
            {
                new MoreNumberPuzzles().NumReverse();
            }
        }while(usr != 3);
    }
}
