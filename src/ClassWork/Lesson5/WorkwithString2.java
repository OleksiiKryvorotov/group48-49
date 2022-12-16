package Lesson5;

import java.util.Set;

public class WorkwithString2 {

    public static void main(String[] args) {

        String text = "Это текст проверки метод работы методов типа String";
        StringMethodsTest(text);

        //System.out.println(text.contains("мето"));

    }

    public static void StringMethodsTest(String text) {
        String testString1 = "рабо";

        boolean resultContains = text.contains(testString1);

        System.out.println(resultContains);

        System.out.println(text.contains("petr"));

        System.out.println(text.toUpperCase());

        System.out.println(text.toLowerCase());

        int catAge = 7;
        //String catAgeStringType = String.valueOf(catAge);
        String catAgeStringType2 = "" +catAge;

        System.out.println(catAgeStringType2);
        //----------------------превод String переменной в примитивные int double------------------------------------

        String inputFromKeyboard = "125";
        Integer resultInt = Integer.parseInt(inputFromKeyboard);
        Double resultDouble = Double.parseDouble("12.65");
        System.out.println(resultInt + resultDouble);


        System.out.println(text.indexOf("метод"));

        System.out.println(text.lastIndexOf("метод"));








    }
}
