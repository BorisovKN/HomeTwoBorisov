//Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите какой элемент является в этом
//массиве максимальным и сообщите индекс его последнего вхождения в массив.
import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[12];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(a));
        int max = a[0], index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max ) {
                max = a[i];
                index = i;
            }
        }
        System.out.println("Самое большое число: " + max + " и индекс его последнего вхождения: " + index);
    }
}
