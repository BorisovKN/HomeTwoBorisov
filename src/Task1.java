//Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней?
public class Task1 {
    public static void main(String[] args) {
        double s = 10;
        double a = 10;
        for (int i = 2; i <= 7; i++) {
            s = s + (s * 0.1);
            a = a + s;
        }
        System.out.print("Дистанция за 7 дней: " + a + " км");
    }
}
