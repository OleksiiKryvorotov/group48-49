package Lesson4;

import java.util.Set;

public class WorkWithString {
    public static void main(String[] args) {

        String text = "Это текст проверки работы методов типа String";

        String text1 = "";


        System.out.println(text);

        System.out.println(text.length());
        System.out.println(text1.length());

        System.out.println(text.isEmpty());
        System.out.println(text1.isEmpty());

        //Метод chart - возвращает индекс буквы

        char simbol = text.charAt(0);

        System.out.println(text.charAt(0));
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(14));
        System.out.println(text.charAt(44));

        //Метод

        String sunText = text.substring(0, 10);

        System.out.println(sunText + " " + sunText.length());

        System.out.println(text.substring(40));


    }
}
