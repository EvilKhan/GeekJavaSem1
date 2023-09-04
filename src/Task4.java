//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Random random = new Random();

        String a = new String("anna");
        String b = new String("anna");

        System.out.println(a.equals(b));

        int[] arr = new int[]{1, 1, 0, 1,1,1,1,1,1, 0, 1, 1, 1};
//        arr[0] = 1;
//        arr[1] = 1;
//        arr[4] = 34;

        int count = 0; // счетчик количества подряд идущих 1;
        int maxLength = 0; // счетчик последней макс цепочки единичек;

        for (int i = 0; i < arr.length; i++) { // i = i + 1 и то же самое что i += 1
            if (arr[i] == 1) {
                count++;
                if (count > maxLength) {// если текущая цепочка больше итоговой
                    maxLength = count;
                }
            } else {
                count = 0;
            }

        }
        System.out.println("Result: " + maxLength);
    }
}