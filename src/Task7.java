//Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
public class Task7 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 99; i++) {
            if ((i % 2) != 0) {
                s += i;
            }
        }
        System.out.println("Сумма всех нечетных чисел: " + s);
    }
}
