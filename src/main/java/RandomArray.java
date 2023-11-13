import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        // Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
        Random random = new Random();

        int[] array = new int[15];

        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(21) - 20;
        }
        System.out.println("Массив: " + Arrays.toString(array));

        //1. Выведите максимальный и минимальный элемент массива.
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);

        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (min > array[i + 1]) {
                min = array[i + 1];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);

        //2. Из максимального и минимального значения выведите наибольшее по модулю.
        int modMax = Math.abs(max);
        int modMin = Math.abs(min);

        System.out.println("Наибольшее по модулю: " + Math.max(modMax, modMin));
    }
}
