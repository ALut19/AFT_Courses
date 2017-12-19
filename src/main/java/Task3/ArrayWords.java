package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWords {
    public static void arrayWords() {

        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter amount of words:");
        int size = input1.nextInt(); // вводим длину массива
        String[] arrayw = new String[size]; //массив заполняем введенными значениями

        System.out.println("Words " + Arrays.toString(arrayw));

        String maxi = "";
        int a = 0;

        for (int i = 0; i < arrayw.length; i++) {

            System.out.println("Enter " + i);
            arrayw[i] = input1.next();

            if (arrayw[i].length() > a) {
                a = arrayw[i].length();
                maxi = arrayw[i];
            }
        }
        System.out.println("Max word is " + maxi);
    }
}

