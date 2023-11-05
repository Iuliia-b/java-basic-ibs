public class likeJava {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        //1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        boolean b1 = str.contains("Java");
        System.out.println(b1);

        //2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        boolean b2 = str.startsWith("I like");
        System.out.println(b2);

        //3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        boolean b3 = str.endsWith("!!!");
        System.out.println(b3);

        //4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (b1 && b2 && b3) {
            System.out.println(str.toUpperCase());
        }

        //5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        System.out.println((str.replace('a', 'o')).substring(7,11));
    }
}
