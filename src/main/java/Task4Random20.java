public class Task4Random20 {
    public static void main(String[] args) {

        int max = 0;
        int min = 0;
        int[] array = new int[20];

        for (int i = 0; i < array.length  ; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.println(array[i]);

            if(array[i] > max){
                max = array[i];
            }if (array[i] < min) {
                min = array[i];
            }
        }

        //меняю местами max и min
        max = min + max;
        min = max - min;
        max = max - min;

        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}