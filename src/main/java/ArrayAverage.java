import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
            System.out.print("Введите размер массива: ");
            int length = scanner.nextInt();

            double[] array = new double[length];

            for (int i = 0; i < length; i++) {
                System.out.print("Введите значение элемента #" + i + ": ");
                array[i] = scanner.nextDouble();
            }
            System.out.println("Массив: " + Arrays.toString(array));

            //2. Посчитайте среднее арифметическое элементов массива.
            double sum = 0.0;
            for (double element : array) {
                sum += element;
            }
            double averageMean = sum / array.length;
            System.out.println("Среднее арифметическое элементов массива: " + averageMean);

            //3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
            for (int i = 0; i < array.length; i++) {
                array[i] *= averageMean;
            }
            System.out.println("Изменённый массив: " + Arrays.toString(array));

        } catch (InputMismatchException e) {
            System.err.println("Введите число, пожалуйста!");
        } finally {
            scanner.close();
        }
    }
}
