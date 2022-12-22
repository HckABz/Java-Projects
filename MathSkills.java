/*
 * Alex Bravo
 * CS A170
 * July 6,2022
 * 
 * Excercise 2
 */
import java.util.Scanner;
public class MathSkills{
    public static void main(String[] args)
    {
        System.out.println(" Enter THREE numbers and I will show you my math skills:");
        Scanner input=new Scanner(System.in);
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();
        System.out.println("Check this out:");
        System.out.printf("%1d + %1d - %1d = %1d%n",number1,number2,number3,(number1 + number2 - number3));
        System.out.printf("%1d - %1d * %1d = %1d%n",number1,number2,number3,(number1 - number2 * number3));
        System.out.printf("(%1d - %1d ) * %1d = %1d%n",number1,number2,number3,(number1 - number2) * number3);
        System.out.printf("%1d squared is %1d",number1,(int) Math.pow(number1,2));
    }
}