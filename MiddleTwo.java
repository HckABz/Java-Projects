/*
 * Alex Bravo
 * CS A170
 * 
 * July 8, 2022
 * 
 * Excercise 2
 */
import java.util.Scanner;
public class MiddleTwo
{
    public static void main(String[] args)
    {
        System.out.print("Please enter a string: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int sub1 = word.length()/2-1;
        int sub2 = sub1 + 2;
        String word2 = word.substring(sub1,sub2);
        System.out.print(word2);
    }
}