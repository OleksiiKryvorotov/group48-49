package ClassWork.Lesson9;

//Написать программу, которая запрашивает у польз. два целых числа
//и выводит наименьшее из них:

import java.util.Scanner;

public class LoopExampleTwoZahlen1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x number");
        int x = scanner.nextInt();

        System.out.println("Enter y number");
        int y = scanner.nextInt();

        if (x < y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

    }
}
