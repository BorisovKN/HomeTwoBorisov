//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый, выведите массивы на экран
//в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a1 = new int[5], a2 = new int[5];
        int s1 = 0, s2 = 0;
        double avg1, avg2;
        for (int i = 0; i < a1.length; i++) {
            a1[i] = random.nextInt(15);
            a2[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        for (int i = 0; i < a1.length; i++) {
            s1 = s1 + a1[i];
            s2 = s2 + a2[i];
        }
        System.out.println();
        avg1 = (double) s1 / 5;
        avg2 = (double) s2 / 5;
        if (avg1 < avg2) {
            System.out.println("Среднее арифметическое первого массива меньше среднего арифмитического второго массива " + avg1 + " < " + avg2);
        } else if (avg2 < avg1) {
            System.out.println("Среднее арифметическое второго массива меньше среднего арифмитического первого массива " + avg2 + " < " + avg1);
        } else {
            System.out.println("Среднее арифметическое первого массива равно второму массиву " + avg1 + " = " + avg2);
        }
    }
}
