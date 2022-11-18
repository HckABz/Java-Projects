/*
 * Alex Bravo 
 * CS A170
 * 
 * July 16, 2022
 * 
 * Excercise 10
 */
public class SumEvenNumbers
{
    public static void main(String[] args)
    {
        int num = 0;
        int sum = 0;
        while (num <100) 
        {
            num+=2;
            sum = sum + num;
            
        }
        System.out.println("The sum is " + sum);
    }
}