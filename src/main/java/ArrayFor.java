import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayFor {
    public static void main(String[] args) {
        /*
        1. Пользователь вводит размер массива и данные с клавиатуры в массив
        2. Сравнить элементы массива с заранее заданными константами x, y, z.
        3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
         */
        final int x = 5;
        final int y = 7;
        final int z = 2;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int length = scanner.nextInt();

            int[] array = new int[length];

            for (int i = 0; i < length; i++) {
                System.out.print("Введите значение элемента #" + i + ": ");
                array[i] = scanner.nextInt();
            }
            System.out.println("Массив: " + Arrays.toString(array));
            System.out.println("Константы: " + x + ", " + y + ", " + z);

            for (int j : array) {
                if (j == x || j == y || j == z) {
                    System.out.println("Значение " + j + " имеется в константах");
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Введите целое число, пожалуйста!");
        } finally {
            scanner.close();
        }
    }
}
