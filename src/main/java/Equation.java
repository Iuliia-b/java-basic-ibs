import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку из пяти символов, где второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’ ");
        System.out.println("Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке ");

        String line = scanner.nextLine();

        char a = line.charAt(0);
        char b = line.charAt(2);
        char c = line.charAt(4);

        if (line.charAt(1) == '+') {
            if (a == 'x') {
                int result = Character.getNumericValue(c) - Character.getNumericValue(b);
                System.out.println("x=" + result);
            } else if (b == 'x') {
                int result = Character.getNumericValue(c) - Character.getNumericValue(a);
                System.out.println("x=" + result);
            } else {
                int result = Character.getNumericValue(a) + Character.getNumericValue(b);
                System.out.println("x=" + result);
            }
        } else {
            if (a == 'x') {
                int result = Character.getNumericValue(b) + Character.getNumericValue(c);
                System.out.println("x=" + result);
            } else if (b == 'x') {
                int result = Character.getNumericValue(a) - Character.getNumericValue(c);
                System.out.println("x=" + result);
            } else {
                int result = Character.getNumericValue(a) - Character.getNumericValue(b);
                System.out.println("x=" + result);
            }
        }
        scanner.close();
    }
}
