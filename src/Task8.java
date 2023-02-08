//Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран. Подсчитайте сколько
//в массиве чётных элементов и выведете это количество на экран на отдельной строке.
import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[15];
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(99);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Количество четных чисел в массиве: " + b);
    }
}
