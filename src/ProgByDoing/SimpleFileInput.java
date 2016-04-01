package ProgByDoing;

import java.io.FileReader;

/**
 *
 * @author Lawal Nafiu
 */
public class SimpleFileInput {

    public static void main(String[] args) {
        System.out.print("Using my psychic powers (aided by reading data from the file, I have\n"
                + "determined that your name is ");

        try 
        {
            FileReader text = new FileReader("name.txt");
            int inByte;
            do {
                inByte = text.read();
                if (inByte != -1)
                System.out.print((char)inByte);
            } while (inByte != -1);
            System.out.println(".");
            text.close();
            
        } catch (Exception e) 
        {
            System.out.println("Unenable to write file");
        }
        

    }
}
