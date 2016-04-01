package ProgByDoing;


import java.util.Random;
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
public class flickerPhrase {
    public static void main( String[] args )
	{
		Random rng = new Random();
		int r;
                Scanner kb = new Scanner(System.in);
		
		for ( int i=0; i<100000; i++ )
		{
			r = 1 + rng.nextInt(5);
			// Write five if statements here.
			// If r is 1, then call the function named 'first'.
                        if ( r== 1)
                        {
                            first();
                        }
			if ( r== 2)
                        {
                            second();
                        }
                        if ( r== 3)
                        {
                            third();
                        }
                        if ( r== 4)
                        {
                            fourth();
                        }
                        if ( r== 5)
                        {
                            fifth();
                        }
			

			//System.out.println("Hello there! Pls give me your name. Sorry I keep forgetting");
                        //kb.next();
		}

		System.out.println("I pledge allegiance to the flag.");
		
	}

	public static void first()
	{
		System.out.print("I                               \r");
	}

	public static void second()
	{
		System.out.print("  pledge                        \r");
	}

	public static void third()
	{
		System.out.print("         allegiance             \r");
	}

	public static void fourth()
	{
		System.out.print("                    to the      \r");
	}

	public static void fifth()
	{
		System.out.print("                           flag.\r");
	}
    
}
