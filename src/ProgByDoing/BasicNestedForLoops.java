package ProgByDoing;

/**
 *
 * @author Nafiu
 */
public class BasicNestedForLoops {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                System.out.printf("(%d,%d) ", i, j);
            }
            System.out.println();
        }
    }
}
