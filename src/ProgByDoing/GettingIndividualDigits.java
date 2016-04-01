package ProgByDoing;



/**
 *
 * @author Lawal Nafiu
 */
public class GettingIndividualDigits {
        public static void main(String[] args) throws Exception 
    {
        int sum;
        for(int j = 10; j < 100; j++)
        {
            System.out.print(j + ", ");
            sum = 0;
            for (int i = 0; i < 2; i++) 
            {
                if( i == 0)
                {
                    sum += j / 10;
                    System.out.print(sum + "+");
                }
                else
                {
                    sum += j % 10;
                    
                }
            }
            System.out.println(j%10 + " = " + sum);
        }
    }
}
