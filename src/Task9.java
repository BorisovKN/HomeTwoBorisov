//Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите массив на экран в строку.
//Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}