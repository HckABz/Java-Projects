/*
 * Alex Bravo
 * CS A170
 * 
 * July 10, 2022
 * 
 * Excersisce 5
 */
import java.util.Scanner;
public class DaysInMonth
{
    public static void main(String[] args)
    {
        System.out.print("Enter a month (1-12) and I will print the number of the days in that month: ");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        switch (month)
        {
            case 1: System.out.print("31 days");
            break;
            case 2: System.out.print("28 or 29 days");
            break;
            case 3: System.out.print("31 days");
            break;
            case 4: System.out.print("30 days");
            break;
            case 5: System.out.print("31 days");
            break;
            case 6: System.out.print("30 days");
            break;
            case 7: System.out.print("31 days");
            break;
            case 8: System.out.print("31 days");
            break;
            case 9: System.out.print("30 days");
            break;
            case 10: System.out.print("31 days");
            break;
            case 11: System.out.print("30 days");
            break;
            case 12: System.out.print("31 days");
            break;
            default: System.out.print("invalid number!");
            break;
        }
    }
}
