import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            System.out.println("Введите текущий курс доллара: ");
            double dollarCourse = scanner.nextDouble();

            System.out.println("Введите количество рублей: ");
            int rub = scanner.nextInt();

            double result = rub / dollarCourse;
            System.out.println("Итого: " + df.format(result) + " долларов");

        } catch (InputMismatchException e) {
            System.err.println("Введите число, пожалуйста!");
        } finally {
            scanner.close();
        }
    }
}
