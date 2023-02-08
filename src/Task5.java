//Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class Task5 {
    public static void main(String[] args) {
        for (int inch = 1; inch <= 20; inch++) {
            double cm = inch * 2.54;
            System.out.println(inch + " дйюм " + cm + " cм");
        }
    }
}
