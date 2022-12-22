/*
 * Alex Bravo 
 * CS A170
 *
 *July 18, 2022
 *
 *Excersice 10
 */
import java.util.Scanner;
public class Stars
{
    public static void main(String[] args)
    {
        System.out.print("Enter an integer from 3 to 10: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int num2 = num;num2 > 0;num2--)
        {
            for (int num3 = num2;num3 > 0;num3--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}