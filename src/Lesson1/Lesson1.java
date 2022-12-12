package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {

        int a1 = 10;
        int b1 = 15;

        int a2 = 100;
        int b2 = 150;

        int a3 = 10;
        int b3 = 15;

        int a4 = 10;
        int b4 = 15;

        int a5 = 10;
        int b5 = 15;

        /*int result = a1 + b1;

        System.out.println("resultt - " + result);*/

        int result = sum(a1, b1);
    }

        public static int sum (int x, int y){
            int sum = x + y;
            return sum;
        }


    }

