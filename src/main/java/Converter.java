import java.text.DecimalFormat;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 1. Пользователю предлагается на выбор ввести массу или расстояние
        System.out.println("Выберите что переводить: 1 - масса (килограмм), 2 - расстояние (метр)");
        int value = scanner.nextInt();

        // 2. Пользователю предлагается выбрать единицу измерения
        int weight = 0;
        int length = 0;

        if (value == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - фунт, 4 - унция");
            weight = scanner.nextInt();
        } else {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            length = scanner.nextInt();
        }

        // 3. Пользователю предлагается ввести количество выбранных единиц
        System.out.println("Введите число:");
        int quantity = scanner.nextInt();

        DecimalFormat df1 = new DecimalFormat("#.###");
        DecimalFormat df2 = new DecimalFormat("#.##");

        System.out.println("> Результат: ");
        if (value == 1) {
            switch (weight) {
                case 1:
                    System.out.println("Килограммы: " + quantity + " кг = " + quantity + " кг");
                    break;
                case 2:
                    System.out.println("Граммы: " + quantity + " кг = " + quantity * 1000 + " г");
                    break;
                case 3:
                    System.out.println("Фунты: " + quantity + " кг = " + df2.format(quantity * 2.205) + " lbs");
                    break;
                case 4:
                    System.out.println("Унции: " + quantity + " кг = " + df2.format(quantity * 35.274) + " oz");
                    break;
                default:
                    System.err.println("Нужно выбрать 1, 2, 3 или 4. Попробуйте ещё раз!");
            }
        } else {
            switch (length) {
                case 1:
                    System.out.println("Метры: " + quantity + " м = " + quantity + " м");
                    break;
                case 2:
                    System.out.println("Мили: " + quantity + " м = " + df1.format(quantity / 1609.00) + " миль");
                    break;
                case 3:
                    System.out.println("Ярды: " + quantity + " м = " + df2.format(quantity * 1.094) + " ярдов");
                    break;
                case 4:
                    System.out.println("Футы: " + quantity + " м = " + df2.format(quantity * 3.281) + " футов");
                    break;
                default:
                    System.err.println("Нужно выбрать 1, 2, 3 или 4. Попробуйте ещё раз!");
            }
        }
        scanner.close();
    }
}
