//Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int h = 0;
        for (int i = 0; i < 24; i += 3) {
            a = a * 2;
            h = h + 3;
            System.out.println("Количество Амеб: " + a + " через " + h + " ч");
        }
    }
}
