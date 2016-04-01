package ProgByDoing;

import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Lawal Nafiu
 */
public class HighScore {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String msg;
        int high;
        System.out.println("You got a high score!");
        System.out.println("Please enter your score: ");
        high = kb.nextInt();
        System.out.println("Please enter your name:  ");
        String s = kb.nextLine();
        msg = kb.nextLine();
        String highS = Integer.toString(high);
        try
        {
            try (FileWriter letters = new FileWriter("score.txt")) {
                letters.write(highS);
                letters.append("\n");
                letters.append(msg);
            }
        } catch(Exception e)
        {
            System.out.println("Unenable to write file");
        }
        System.out.println("Data stored into score.txt");
        
    }
}
