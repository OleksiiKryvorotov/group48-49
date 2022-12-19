package ClassWork.Lesson7;

import java.util.Scanner;

/* 2-ой вариант:
Написать программу, которая запрашивает у пользователся
целое число и выводит на консоль полож. оно, отриц. или равно нулю
 */

public class LessonCode2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("2-ой вариант: Input your figure - ");
        String userInput = scanner.nextLine();

        //if (userInput включает в себя символы только цифры или знак "-", то:

        if (Integer.parseInt(userInput) < 0) {
            System.out.println("Yout figure is negative!");
        } else if (Integer.parseInt(userInput) > 0) {
            System.out.println("Your figure is positive!");
        } else if (Integer.parseInt(userInput) == 0) {
            System.out.println("Your figure is 0");
        } else {
            System.out.println("How is it possible");
        }
    }
}


