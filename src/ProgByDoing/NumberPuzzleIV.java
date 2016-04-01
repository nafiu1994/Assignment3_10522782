package ProgByDoing;


/**
 *
 * @author Lawal Nafiu
 */
public class NumberPuzzleIV {

    public static void main(String[] args) {
        int sum, num;
        for (int a= 1; a < 45; a++) 
        {
            for (int b = 1; b < 45; b++)
            {
                for (int c = 1; c < 45; c++) 
                {
                    for (int d = 1; d < 45; d++) 
                    {
                        if((a + 2 == b - 2) && (b - 2 == c * 2) && (c * 2 == d / 2))
                        {
                            if(a + b + c +d == 45)
                            {
                                System.out.println(a + " " + b + " " + c + " " + d);
                            }
                        }
                    }
                }
            }
        }
    }
}
