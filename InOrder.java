/*
 * Alex Bravo
 * CS A170
 * 
 * July 16, 2022
 * 
 * Excercise 7
 */
import java.util.Scanner;
public class InOrder
{
    public static void main(String[] args)
    {
        System.out.print("Enter three integers, I'll sort them: ");
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        if (A<=B && B<=C)
        {
            System.out.print("The integers in sorted order are: " + A + " "+ B + " " + C);
        }else if (B<=A && A<=C)
        {
            System.out.print("The integers in sorted order are: " + B + " " + A + " " + C);
        }
        else if (C<=A && A<=B)
        {
            System.out.print("The integers in sorted order are: " + C + " " + A + " " + B);
        }
        else if (B<=C && C<=A)
        {
            System.out.print("The integers in sorted order are: " + B + " " + C + " " + A);
        }
        else if (C<=B && B<=A)
        {
            System.out.print("The integers in sorted order are: " + C + " " + B + " " + A);
        }
        else if (A<=C && C<=B)
        {
            System.out.print("The integers in sorted order are: " + A + " " + C + " " + B);
        }
    }
}