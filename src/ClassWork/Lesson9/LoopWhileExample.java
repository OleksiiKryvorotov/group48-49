package ClassWork.Lesson9;

import java.util.Scanner;

public class LoopWhileExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int x =-1;
        int y =-1;

        while ((x!= 0)&&(y!=0)) {

            System.out.println("Enter x number -");
            x = scanner.nextInt();

            System.out.println("Enter y number -");
            y = scanner.nextInt();

            System.out.println("Add result - " +(x+y));
        }*/

        //Другой пример:

        int x;
        int y;

        boolean condition = true;

        while (condition) {

            System.out.println("Please two numbers. If you will enter first number - exit");

            System.out.println("Enter x number -");
            x = scanner.nextInt();

            System.out.println("Enter y number -");
            y = scanner.nextInt();

            System.out.println("Add result - " + (x+y));

            if (x==100) {condition = false;}
        }
    }
}
