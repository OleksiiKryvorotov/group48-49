package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {

        int a1 = 10;
        int b1 = 15;

        int a2 = 100;
        int b2 = 150;



        /*int result = a1 + b1;
        System.out.println("resultt - " + result);*/

        int result1 = sum(a1,b1);

        printText( 1, result1);

        printText( 2, sum(a2,b2));
    }

        public static int sum (int x, int y){
            int sum = x + y;
            return sum;
        }
        public static int mult (int x, int y){
            int mult = x * y;
            return mult;

    }

        public static void printText (int i,int text){
             System.out.println("Result sum " + i + " = " + text);

        }

    }

