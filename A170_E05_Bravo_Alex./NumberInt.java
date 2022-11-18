/*
 * Alex Bravo
 * CS A170
 * 
 * July 10, 2022
 * 
 * Excersisce 5
 */
import java.util.Scanner;
public class NumberInt
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number == 0)
        {
            System.out.print("It is zero!");
        
        }
        else if (number > 0)
        {
            System.out.print("It's a positive number.");
        }
        else if (number < 0)
        {
            System.out.print("It's a negative number.");
        }
    }
}
