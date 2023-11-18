import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CharsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();

        System.out.println("Введите строки: ");
        ArrayList<String> inputStrings = new ArrayList<>(n);
        for (int i = 0; i <= n; i++) {
            inputStrings.add(scanner.nextLine());
        }

        int maxDifferentChars = 0;
        String result = null;

        for (String inputString : inputStrings) {
            Set<Character> differentChars = new HashSet<>();
            for (char character : inputString.toCharArray()) {
                differentChars.add(character);
            }

            int count = differentChars.size();
            if (count > maxDifferentChars) {
                maxDifferentChars = count;
                result = inputString;
            }
        }

        System.out.println("Строка с максимальным количеством различных символов: " + result);
        scanner.close();
    }
}
