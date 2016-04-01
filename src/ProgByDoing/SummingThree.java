package ProgByDoing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileReader;

/**
 *
 * @author Nafiu
 */
public class SummingThree {
    public static void main(String[] args)
    {
        int sum = 0;
        System.out.println("Reading numbers from file \"3nums.txt\".... done");
        try 
        {
            FileReader nums = new FileReader("3nums.txt");
            int digit;
            do {
                digit = nums.read();
                if (digit != -1)
                {
                    char temp = (char)digit;
                    if (Character.isDigit(temp))
                    {
                        sum += digit;
                        System.out.print(digit + " + ");
                    }
                }
            } while (digit != -1);
            System.out.print(" = " + sum + "\n");
            nums.close();
            
        } catch (Exception e) 
        {
            System.out.println("Unenable to write file");
        }
    }
}
