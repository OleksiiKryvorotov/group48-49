package HW2_2;

public class hm2_2 {

    public static void main(String[] args) {
        //1 Создайте строку через new - I study Basic Java!:
        String oldString = "I study Basic Java!";
        System.out.println(oldString);

        //3 Распечатать последний символ строки.
        // Используем метод String.charAt():
       System.out.println(oldString.charAt(18));

        //4 Проверить, содержит ли ваша строка подстроку “Java”.
        // Используем метод String.contains():
        oldString.contains("Java");
        System.out.println(oldString.contains("Java"));

        //5 Заменить все символы “а” на “о”:
        String newString = oldString.replace('a', 'o');
        System.out.println(newString);

        //6 Преобразуйте строку к верхнему регистру:
        System.out.println(oldString.toUpperCase());

        //7 Преобразуйте строку к нижнему регистру:
        System.out.println(oldString.toLowerCase());

        //8 Вырезать строку Java c помощью метода String.substring():
        System.out.println(oldString.substring(14,18));
    }
}
