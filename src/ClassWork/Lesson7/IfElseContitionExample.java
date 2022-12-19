package ClassWork.Lesson7;

public class IfElseContitionExample {
    public static void main(String[] args) {

        int x=100;
        int y=0;

        if (x<100) {
             y = x*25;
        } else if (x>100) {
             y = x/5;
        } else {
             y = x*x;
        }
        System.out.println(y);
    }
}
