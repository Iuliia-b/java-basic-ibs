import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        /* Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
         а после этого произведите вывод первой строки матрицы на экран,
         где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
         */
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите количество строк: ");
            int row = scanner.nextInt();

            System.out.print("Введите количество столбцов: ");
            int column = scanner.nextInt();

            int[][] matrix = new int[row][column];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print("Введите значение элемента #" + j + " для строки #" + i + ": ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Матрица: ");
            for (int[] rows : matrix) {
                for (int element : rows) {
                    System.out.print(element + "\t");
                }
                System.out.println();
            }

            System.out.println("Первая строка матрицы, где каждый элемент умножается на 3: ");
            for (int i = 0; i < column; i++) {
                System.out.print(matrix[0][i] * 3 + "\t");
            }

        } catch (InputMismatchException e) {
            System.err.println("Введите число, пожалуйста!");
        } finally {
            scanner.close();
        }
    }
}
