/*
 * Alex Bravo 
 * CS A170
 * 
 * July 17, 2022
 * 
 * Excercise 7
 */
import java.util.Scanner;
public class ForLoops
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int firstNum = in.nextInt();
        System.out.println("Enter another integer larger then the first one:");
        int secondNum = in.nextInt();
        int sum = 0;
        int sum2 = 0;
        System.out.print("Even numbers:");
        for (int evenNum = firstNum ;evenNum <= secondNum;evenNum++)
        {
            if (evenNum % 2 == 0)
            {
                sum = sum + evenNum;
                System.out.print(" " + evenNum);
            }
        }
        System.out.println();
        System.out.println("Sum of even numbers = " + sum);
        System.out.print("Odd numbers:");
        for (int evenNum = firstNum ;evenNum <= secondNum;evenNum++)
        {
            if (evenNum % 2 == 1)
            {
                sum2 = sum2 + evenNum;
                System.out.print(" " + evenNum);
            }
        }
        System.out.println();
        System.out.println("Sum of odd numbers = " + sum2);
    }
}