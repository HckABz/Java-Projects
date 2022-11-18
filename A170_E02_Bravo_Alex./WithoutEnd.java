/* 
 *Alex Bravo
 *CS A170
 *
 *July 8, 2022
 *
 *Excercise 2
 */
import java.util.Scanner;
public class WithoutEnd
{
    public static void main(String[] args)
    {
        System.out.print("Please enter a string: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String sub = word.substring(1,word.length()-1);
        System.out.println(sub);
    }
}

