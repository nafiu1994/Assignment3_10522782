package ProgByDoing;




/**
 *
 * @author Nafiu
 */
public class NumberPuzzlesI {

    public static void main(String[] args) throws Exception 
    {
        for(int j = 10; j < 100; j++)
        {
            for (int i = 10; i < 100; i++) 
            {
                if(i + j == 60 && ((i*j)*(i-j))/(i*j) == 14)
                {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}
