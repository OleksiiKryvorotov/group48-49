package ClassWork;

public class Lesson1 {
    public static void main(String[] args) {
        int a = 1000;
        int b = 500;
        double sum = a + b;
        double discount = sum * (10.0 / 100);
        System.out.println(discount);

        String textResultInfo = "Result with discount - ";
        System.out.println(textResultInfo + discount);

    }
}
