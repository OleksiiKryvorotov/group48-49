package ClassWork.Lesson7;

import java.util.Scanner;

public class LessonCode4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int userInput = scanner.nextInt();

        //System.out.println("Use if/else satement")
        if (userInput % 2 == 0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is not even");
        }



    }
}
