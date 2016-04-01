package ProgByDoing;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Lawal Nafiu
 */
public class ALittlePuzzle {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String fName;
        System.out.println("Open which file:  ");
        fName = kb.next();
        try {
            FileReader text = new FileReader(fName);
            int inByte, kount = 0;
            do {
                kount++;
                inByte = text.read();
                if (inByte != -1 && kount == 3) {
                    System.out.print((char) inByte);
                    kount = 0;
                }
            } while (inByte != -1);
            text.close();
            System.out.println();

        } catch (Exception e) {
            System.out.println("Unenable to write file");
        }
    }
}
