package ProgByDoing;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Lawal Nafiu
 */
public class SimpleWebInput {
    public static void main(String[] args) throws Exception
    {
        URL mcool = new URL("http://cs.leanderisd.org/mitchellis.txt");
        String one;
        Scanner webIn = new Scanner( mcool.openStream() );
        one = webIn.nextLine();
        
        System.out.println(one);
    }
}
