import java.util.Scanner;

/**
 * @see Task2Calculator
 * @author Андрей Лут
 */

public class Task2Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first;
        String temp1;
        String temp2;
        int second;
        double result = 0;
        String action;

        while (true) {
            //Ввести первую перенную
            System.out.println("\nEnter first number");
            temp1 = input.nextLine();
            first = Integer.parseInt(temp1);


            //Ввести один из следующих операторов: сложения, вычитания, умножения, деления
            System.out.println("Enter one of this operators: \n+\n-\n*\n/");
            action = input.nextLine();

            //Ввести вторую переменную
            System.out.println("Enter second number");
            temp2 = input.nextLine();
            second = Integer.parseInt(temp2);



            if (action.equals("+")) {
                result = (first + second);
            } else if (action.equals("-")) {
                result = first - second;
            } else if (action.equals("*")) {
                result = first * second;
            } else if (action.equals("/")) {
                result = first / second;
            }
                System.out.printf("%.4f", result);
        }
    }
}
