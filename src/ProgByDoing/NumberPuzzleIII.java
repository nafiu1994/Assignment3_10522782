package ProgByDoing;




/**
 *
 * @author Lawal Nafiu
 */
public class NumberPuzzleIII {
    public static void main(String[] args)
    {
        int sum, num;
        for(int j = 100; j < 1000; j++)
        {
            sum = 0;
            num = j;
            for(int i = 0; i< 3; i++)
            {
                sum +=  Math.pow((num % 10), 3);
                num /= 10;
            }
            if ( sum == j)
            {
                System.out.println(j);
            }
        }
    }
}
