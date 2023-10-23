import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        // 1. Ввести три числа с клавиатуры x, y, z
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();

        System.out.print("z: ");
        int z = scanner.nextInt();

        // 2. Найти и вывести в консоль среднее арифметическое этих чисел
        int averageMean = (x + y + z) / 3;
        System.out.println("Среднее арифметическое числел " + x + ", " + y + ", " + z + " равно " + averageMean);

        // 3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        int newNum = averageMean / 2;
        int floorNum = (int)Math.floor(newNum);

        // 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if(floorNum > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
