/*
 * Alex Bravo 
 * CS A170
 * 
 * July 17, 2022
 * 
 * Excercise 7
 */
public class PowerOf2
{
    public static void main(String[] args)
    {
        int counter = 0;
        while ( counter < 21)
        {
            System.out.println("2 to the " + counter + " equals " + Math.pow(2,counter));
            counter++;
        }
    }
}