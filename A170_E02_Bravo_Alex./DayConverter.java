/*
 * Alex Bravo
 * CS A170
 * July 6, 2022
 * 
 * Excercsie 2
 */
import java.util.Scanner;
public class DayConverter
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number of days:");
        Scanner input = new Scanner(System.in);
        int day_number = input.nextInt();
        int day_hours = (day_number * 24);
        int day_minutes = (day_number * 1440);
        int day_seconds = (day_number * 86400);
        System.out.printf(day_number + " days is " + day_hours + " hours or " + day_minutes  + " minutes or " + day_seconds + " seconds");
    }
}