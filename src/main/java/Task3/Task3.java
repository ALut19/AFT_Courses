package Task3;

import java.util.Scanner;

public class Task3 {

    ArrayWords arrayWords;
    Calculator calculator;

    public static void main(String[] args) {

        Scanner choise = new Scanner(System.in);
        int button = 0;
        while (true) {
            System.out.println("Please enter: \n1 - for ArrayWords; \n2 - for Calculator");
            button = choise.nextInt();

            if (button == 1) {
                ArrayWords.arrayWords();
            } else if (button == 2) {
                Calculator.calculator();
            } else if (button!=2 || button!=1)
                break;
        }
    }
}
