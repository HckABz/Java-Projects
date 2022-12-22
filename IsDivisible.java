/*
 * Alex Bravo 
 * CS A170
 * 
 * July 14, 2022
 * 
 * Exercise 7
 */
import java.util.Scanner;
public class IsDivisible
{
    public static void main(String[] arg)
    {
        System.out.print("Enter two integers, I'll check if one is divisible by the other: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int number2 = in.nextInt();
        if (number % number2 == 0)
        {
            System.out.printf(number +" is divisible by "+ number2);
        }
        else if (number2 % number == 0)
        {
            System.out.printf(number2 + " is divisible by " + number);
        }
        else
        {
            System.out.print(number2 + " and " + number + " are not divisible");
        }
    }
}