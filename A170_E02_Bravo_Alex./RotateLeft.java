/*
 * Alex Bravo
 * CS A170
 * 
 * July 8, 2022
 * 
 * Excercise 2
 */
import java.util.Scanner;
public class RotateLeft
{
    public static void main(String[] args)
    {
        System.out.print("Please enter a string: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String sub1 = word.substring(0,2);
        String sub2 = word.substring(2,word.length());
        String sub3 = sub2.concat(sub1);
        System.out.println(sub3);
    }
}