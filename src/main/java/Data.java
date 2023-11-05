import java.util.InputMismatchException;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //1. Ввести первое число с клавиатуры и записать его в строковую переменную.
            System.out.print("Введите первое число: ");
            int x = scanner.nextInt();
            String xStr = Integer.toString(x);

            //2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
            System.out.print("Введите второе число: ");
            int y = scanner.nextInt();

            //3. Сравнить 2 числа и вывести большее на экран
            int z = Integer.parseInt(xStr);
            System.out.println("Большее число: " + Math.max(z, y));

            //4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
            double min = Math.min(z, y);
            System.out.println("Меньшее число: " + min);

        } catch (InputMismatchException e) {
            System.err.println("Введите целое число, пожалуйста!");
        } finally {
            scanner.close();
        }
    }
}
