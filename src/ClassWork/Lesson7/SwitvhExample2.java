package ClassWork.Lesson7;

import java.util.Scanner;

public class SwitvhExample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input you choose :");
        int userInput = scanner.nextLine();

        switch (userInput) {
            case 1:
                System.out.println("You want add smth...");
                break;
            case 2:
                System.out.println("You want delete");
                break;
            case 3:
                System.out.println("You want replace");
                break;
            default:
                System.out.println("What do you want?");
        }
    }
}
