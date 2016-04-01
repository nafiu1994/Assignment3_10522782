package ProgByDoing;

import java.io.FileReader;

/**
 *
 * @author Lawal Nafiu
 */
public class VowelCapitalization {
    public static void main(String [] args)
    {
                try
        {
            FileReader rdr = new FileReader("vowels.txt");
            int inByte;
            do {
                inByte = rdr.read();
                char in = (char) inByte;
                if (inByte != -1)
                {
                    if(in == 'a' || in == 'o' || in == 'e' || in == 'i'|| in == 'u' )
                    {
                        System.out.print(Character.toUpperCase(in));
                    }
                    else
                    {
                        System.out.print(in);
                    }
                }
            } while (inByte != -1);
            rdr.close();
        }catch(Exception ep)
        {
            System.out.println("File not found");
        }
    }
}
