/*
 * Alex Bravo
 * CS A170
 * 
 * July 17, 2022
 * 
 * Excercise 7
 *?
 */
import java.util.Scanner;
public class Digits
{
    public static void main(String[] args)
    {
        System.out.println("Enter an integer:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num2 = 0;
        int num3 = 0;
        System.out.print("Number reversed: ");
        while (num > 0)
        {
            num2 = (num % 10);
            num = (num / 10 );
            System.out.print(num2);
            num3 = num3 + num2;
        }
        System.out.println();
        System.out.println("Sum of digits: " + num3);
    }
}