//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число A: ");
        double a = in.nextDouble();
        System.out.print("Введите число B: ");
        double b = in.nextDouble();
        int c = 0;
        for (int i = 1; i <= a; i++){
            c +=b;
        }
        System.out.print(c);
    }
}
