import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Первое целое число: ");
            int firstNum = scanner.nextInt();

            System.out.print("Второе целое число: ");
            int secondNum = scanner.nextInt();

            System.out.print("Введите символ ‘+’, ‘-’, ‘*’ или ‘/’: ");
            char symbol = scanner.next().charAt(0);

            // 2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
            switch (symbol) {
                case '+':
                    System.out.println(firstNum + secondNum);
                    break;
                case '-':
                    System.out.println(firstNum - secondNum);
                    break;
                case '*':
                    System.out.println(firstNum * secondNum);
                    break;
                case '/':
                    System.out.println(firstNum / secondNum);
                    break;
                default:
                    System.err.println("Что-то не так! Попробуйте ещё раз!");
            }
        } catch (ArithmeticException e) {
            System.err.println("Нельзя делить на 0");
        } catch (InputMismatchException e) {
            System.err.println("Введите целое число, пожалуйста!");
        } finally {
            scanner.close();
        }
    }
}
