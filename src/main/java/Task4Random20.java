/**
 * Created by Андрей Лут on 11.12.2017.
 */

import java.util.Random;
import java.util.Arrays;

public class Task4Random20 {
    public static void main(String[] args) {

        int[] arr = new int[20];
        fillRandom(arr, 21);
        System.out.println(Arrays.toString(arr));
    }

    public static void fillRandom(int[] arr, int n) {
        int max = 0;
        int min = 0;

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(n) - 10;

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
