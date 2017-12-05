import java.util.Scanner;

/**
 * @see Task2Calculator
 * @author Андрей Лут
 */

public class Task2Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double first;
        double second;
        double result = 0;
        String action;

        //Ввести первую перенную
        System.out.println("Enter first number");
        first = input.nextDouble();
        System.out.println(first);

        //Ввести один из следующих операторов: сложения, вычитания, умножения, деления
        System.out.println("Enter one of this operators: \n+\n-\n*\n/");
        action = input.next();
        System.out.println(action);

        //Ввести вторую переменную
        System.out.println("Enter second number");
        second = input.nextDouble();
        System.out.println(second);



        if(action.equals("+")){
            result = first + second;
        }else if (action.equals("-")){
            result = first - second;
        }else if (action.equals("*")){
            result = first * second;
        }else if (action.equals("/")){
            result = first / second;
        }System.out.printf("%.4f", result);


    }
}
