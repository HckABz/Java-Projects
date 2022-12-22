/*
 * Alex Bravo 
 * CS A170
 * 
 * July 15, 2022
 * 
 * Excercise 7
 */
import java.util.Scanner;
public class Smallest
{
    public static void main(String[] args)
    {
        System.out.print("Enter three integers, I will find the smallest: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();
        if (number <= number2 && number <= number3)
        {
            System.out.printf("The smallest is " + number); 
        }
        else if (number2 <= number && number2 <= number3)
        {
            System.out.printf("The smallest is " + number2);
        }
        else if (number3 <= number && number3 <= number2)
        {
            System.out.printf("The smallest is " + number3);
        }
    }
}
