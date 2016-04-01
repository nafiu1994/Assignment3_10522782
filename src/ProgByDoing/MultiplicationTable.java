package ProgByDoing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Nafiu
 */
public class MultiplicationTable {
    public static void main(String [] args)
    {
        System.out.println("x  |   1   2   3   4   5   6   7   8   9");
        System.out.println("===+====================================");
        for ( int j=1; j <= 12; j++ )
                {
                    if (j < 10)
                    {
                        System.out.print(j + "  | ");
                    }
                    else
                    {
                        System.out.print(j + " | ");
                    }
                    for ( int i=1; i<=9; i++ )
                    {
                        if(i*j < 10)
                        {
                            System.out.print((i*j) + "   ");
                        }
                        else
                        {
                            System.out.print((i*j) + "  ");
                        }
                    }
                    System.out.println();
                }
    }
}
