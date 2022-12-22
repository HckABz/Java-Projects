/*
 * Alex Bravo
 * CS A170
 * July 5, 2022
 * 
 * Excercise 2
 */

import java.util.Scanner;
public class NumberShape
{
    public static void main(String[] args)
    {
    System.out.println("Enter a single-digit number: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    System.out.printf("%4d%n",number);
    System.out.printf("%3d %1d%n",number,number);
    System.out.printf("%2d%d %1d%d%n",number,number,number,number);
    System.out.printf("%1d%d %1d %1d%d",number,number,number,number,number);
    }
}