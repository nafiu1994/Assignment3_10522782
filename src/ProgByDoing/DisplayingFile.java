package ProgByDoing;

import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author Lawal Nafiu
 */
public class DisplayingFile {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String fName;
        System.out.println("Open which file:  ");
        fName = kb.next();
        try
        {
            FileReader rdr = new FileReader(fName);
            int inByte;
            do {
                inByte = rdr.read();
                if (inByte != -1)
                System.out.print((char)inByte);
            } while (inByte != -1);
            rdr.close();
        }catch(Exception ep)
        {
            System.err.println("System error!\nFile not found!");
        }
        
    }
}
