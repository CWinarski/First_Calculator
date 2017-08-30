package Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CalcFunctions
{

    public static void main (String [] args) {

        Double numOne;
        Double numTwo;
        Double result;
        int operator;

        Scanner kb = new Scanner(System.in);

        System.out.println("Hello! Thank you for trying out me out!");

            try
            {
                System.out.println("Please enter in the first number: ");
                numOne = kb.nextDouble();

                System.out.println("Please enter in the second number: ");
                numTwo = kb.nextDouble();
            } catch (InputMismatchException e)

        {
            System.out.println("Sorry, that was not a number");
            System.exit(1);
        }

        System.out.println("Please enter in the number of the sign you want to use: 1(Add +); 2(Subtract -); 3(Multiply *); 4(Divide /): ");
        operator = kb.nextInt();

            if (operator == 1) {
                result = (numOne + numTwo);

            } else if (operator == 2) {
                result = (numOne - numTwo);

            } else if (operator == 3) {
                result = (numOne * numTwo);

            } else if (operator == 4) {
                result = (numOne / numTwo);

            } else {
                System.out.println("Error; not a number between 1-4.");
            }

            if (numTwo == 0 && operator == 4)
            {
               System.out.println("Error! Cannot divide by Zero!");
               System.exit(1);
            } else
                {
                    System.out.println("First Number: " + numOne);
                    System.out.println("Second Number: " + numTwo);
                }

        if (operator == 1)
        {
            System.out.println("Operation Chosen: + ");

        } else if (operator == 2)
        {
            System.out.println("Operation Chosen: - ");

        } else if (operator == 3)
        {
            System.out.println("Operation Chosen: * ");
        } else if (operator == 4)
        {
            System.out.println("Operation Chosen: / ");

        } else
        {
            System.out.println("Error; Selection was not made for calculation");
        }
        System.out.println("Result of Calculation: " + result);
    }

}



