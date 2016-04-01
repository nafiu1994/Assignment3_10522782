package ProgByDoing;



import java.io.*;

/**
 *
 * @author Lawal Nafiu
 */
public class LetterRevisited {
    public static void main(String[] args) {
        String msg = 
        "+---------------------------------------------------------------------+\n"
      + "|                                                     P.O.BOX AN 10813|\n"
      + "|                                                       Accra-North   |\n"
      + "|                                                     31st March, 2016|\n"
      + "|                                                                     |\n"
      + "|                                   Bill Gates                        |\n"
      + "|                                   1 Microsoft Way                   |\n"
      + "|                                   Rednold, WA 98052                 |\n"
      + "|                                                                     |\n"
      + "+---------------------------------------------------------------------+\n";
        try
        {
            try (FileWriter letters = new FileWriter("alphabet.txt")) {
                letters.write(msg, 0, msg.length());
            }
        } catch(Exception e)
        {
            System.out.println();
        }
    }
}
