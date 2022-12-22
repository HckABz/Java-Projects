/*
 * Alex Bravo
 * CS A170
 * 
 * July 10, 2022
 * 
 * Excersisce 5
 */
import java.util.Scanner;
public class LetterGradeToNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter letter grade:");
        Scanner in = new Scanner(System.in);
        String letter = in.nextLine();
        if (letter.equals("A"))
        {
            double A = 4.0;
            System.out.printf("The numeric value is " + A + ".");
        }
        else if (letter.equals("A-"))
        {
            double A = 4.0 - 0.3;
            System.out.printf("The numeric value is " + A + ".");
        }
        else if (letter.equals("A+"))
        {
            double A = 4.0;
            System.out.printf("The numeric value is " + A + ".");
        }
        else if (letter.equals("B"))
        {
            double B = 3.0;
            System.out.printf("The numeric value is " + B + ".");
        }
        else if (letter.equals("B+"))
        {
            double B = 3.0 + 0.3;
            System.out.printf("The numeric value is " + B + ".");
        }
        else if (letter.equals("B-"))
        {
            double B = 3.0 - 0.3;
            System.out.printf("The numeric value is " + B + ".");
        }
        else if (letter.equals("C"))
        {
            double C = 2.0;
            System.out.printf("The numeric value is " + C + ".");
        }
        else if (letter.equals("C-"))
        {
            double C = 2.0 - 0.3;
            System.out.printf("The numeric vlaue is " + C + ".");
        }
        else if (letter.equals("C+"))
        {
            double C = 2.0 + 0.3;
            System.out.printf("The numeric vlaue is " + C + ".");
        }
        else if (letter.equals("D"))
        {
            double D = 1.0;
            System.out.printf("The numeric value is " + D + ".");
        }
        else if (letter.equals("D-"))
        {
            double D = 1.0 - 0.3;
            System.out.printf("The numric value is " + D + ".");
        }
        else if (letter.equals("D+"))
        {
            double D = 1.0 + 0.3;
            System.out.printf("The numric value is " + D + ".");
        }
        else if (letter.equals("F"))
        {
            double F = 0.0;
            System.out.printf("The numeric value is " + F + ".");
        }
    }
}
