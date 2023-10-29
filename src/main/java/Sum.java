import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Напишите программу, где пользователь вводит любое целое положительное число n.
        // А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите любое целое положительное число: ");
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("Сумма всех нечетных чисел от 1 до " + n + " равна " + sum);
        } catch (InputMismatchException e) {
            System.err.println("Введите целое число, пожалуйста!");
        } finally {
            scanner.close();
        }
    }
}
