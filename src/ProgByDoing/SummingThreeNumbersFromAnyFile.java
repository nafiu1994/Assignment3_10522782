package ProgByDoing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Nafiu
 */
public class SummingThreeNumbersFromAnyFile {
    public static void main(String[] args)
    {
        Scanner input;
        int num;
        int sum = 0;
        String file;
        System.out.println("Which file would you like to read numbers from:");
        file = new Scanner(System.in).nextLine();
        System.out.println("Reading numbers from file \"" + file + "\"... done.");
        try
        {
            input = new Scanner(new File(file));
            sum = 0;
            while(true)
            {
                num = input.nextInt();
                sum = sum + num;
                System.out.print(num ); 
                if (input.hasNextInt())
                {
                    System.out.print(" + ");
                }
            }
            
            
        }
        catch(FileNotFoundException fileNotFound)
        {
            System.err.println("File not found!");
            System.exit(1);
        }
        catch(InputMismatchException mismatch)
        {
            System.out.print( " = ");
            System.out.println(sum);
        }
        catch(NoSuchElementException suchElement)
        {
           System.out.print( " = ");
           System.out.println(sum);
        }
        
    }
    
}
