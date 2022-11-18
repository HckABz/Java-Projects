/*
 * Alex Bravo
 * CS A170
 * 
 * July 10, 2022
 * 
 * Excersisce 5
 */
import java.util.Scanner;
public class NumberEvenOdd
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if ((number % 2)==0)
        {
            System.out.printf(number + " is an even number");
        }
        else if ((number % 2)==1)
        {
            System.out.printf(number + " is an odd number");
        }
    }
}
