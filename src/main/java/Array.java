public class Array {
    public static void main(String[] args) {
        // 1. Задайте массив из 5 любых целых чисел
        int[] myArr = {2, 5, 7, 11, 3};
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();

        // 2. Поменяйте местами первый и последний элемент в массиве
        int temp = myArr[0];
        myArr[0] = myArr[myArr.length - 1];
        myArr[myArr.length - 1] = temp;
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();

        // 3. Вывести в консоль результат суммы первого и среднего элемента
        int sum = myArr[0] + myArr[myArr.length / 2];
        System.out.println(sum);
    }
}
