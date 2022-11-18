/* 
 * Alex Bravo
 * CS A170
 * 
 * July 17, 2022
 * 
 * Excercise 10
 */
import java.util.Scanner;
public class SumOfOddNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int A = in.nextInt();
        System.out.print("Enter b: ");
        int B = in.nextInt();
        int sum = 0;
        while(A <= B)
        {
            if (A % 2 == 1)
            {
                sum = sum + A;
            }
            A++;
        }
        System.out.println("The sum is " + sum);
    }
}