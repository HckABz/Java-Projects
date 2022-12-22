/*
 * Alex Bravo
 * CS A170
 * July 6, 2022
 * 
 * Excersie 2
 */
import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        System.out.print("Enter three numbers - I will average them: ");
        Scanner in = new Scanner(System.in);
        double number1 = in.nextDouble();
        double number2 = in.nextDouble();
        double number3 = in.nextDouble();
        double answer =((number1 + number2 + number3) / 3);
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.2f",number1,number2,number3,answer);        
    }
}