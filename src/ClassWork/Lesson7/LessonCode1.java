package ClassWork.Lesson7;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователся
целое число и выводит на консоль полож. оно, отриц. или равно нулю
 */

public class LessonCode1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-ый вариант: Input your figure - ");
        int userInput = scanner.nextInt();

        if (userInput < 0) {
            System.out.println("Yout figure is negative!");
        } else if (userInput > 0) {
            System.out.println("Your figure is positive!");
        } else if (userInput == 0) {
        System.out.println("Your figure is 0");

        } else {
            System.out.println("How is it possible");
        }
    }
}
