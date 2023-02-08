//Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
//Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
import java.util.Arrays;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        boolean b = true;
        for (int i = 1; i < a.length; i++) {
            if(a[i]<=a[i-1]){
                b = false;
                break;
            }
        }
        if(b){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
