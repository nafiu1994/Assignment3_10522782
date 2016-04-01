package ProgByDoing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUMINA BFS
 */
import java.util.Scanner;
public class Multiples {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("Choose number: ");
        num = keyboard.nextInt();
        for (int i = 1; i < 13; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
    
}
