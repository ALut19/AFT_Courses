import java.util.Scanner;

/**
 * Created by user on 06.12.2017.
 */
public class Task2Calculator_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double first;
        double second;
        double result = 0;
        String sResult = "";
        String action;

        //Ввести первую перенную
        System.out.println("Enter first number");
        first = input.nextDouble();

        //Ввести один из следующих операторов: сложения, вычитания, умножения, деления
        System.out.println("Enter: \n \"1\" for addition \n \"2\" for subtraction \n \"3\" for multiplication \n \"4\" for division");
        action = input.next();

        //Ввести вторую переменную
        System.out.println("Enter second number");
        second = input.nextDouble();

        switch (action) {
            case "1":
                result = first + second;
                sResult=String.valueOf(result);
                break;
            case "2":
                result = first - second;
                sResult=String.valueOf(result);
                break;
            case "3":
                result = first * second;
                sResult=String.valueOf(result);
                break;
            case "4":
                if (second == 0)
                System.out.println("nope!");
                 else{
                     result = first / second;
                    sResult=String.valueOf(result);
                 }
                 break;
            default: sResult="no step";

        }
        System.out.println(sResult);
    }
}