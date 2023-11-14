import java.util.Scanner;

public class StringSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку из слов, разделенных пробелами: ");
        String sentence = scanner.nextLine();

        //1. Вывод слов, состоящих только из латиницы
        System.out.println("Слова, состоящие только из латиницы: ");
        String[] words = sentence.split(" ");
        int sum = 0;

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                sum++;
                System.out.print(word + " ");
            }
        }

        //2. Вывод количество этих слов
        System.out.println();
        System.out.println("Количество слов, состоящих только из латиницы: " + sum);
        scanner.close();
    }
}