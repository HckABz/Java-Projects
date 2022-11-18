/*
 * Alex Bravo
 * CS A170
 * July 7, 2022
 * 
 * Excersice 2
 */
import java.util.Scanner;
public class HalfString
{
    public static void main(String[] args)
    {
        System.out.print("Please enter an EVEN length string: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String sub = word.substring(0,word.length() / 2);
        System.out.println(sub);
    }
}
