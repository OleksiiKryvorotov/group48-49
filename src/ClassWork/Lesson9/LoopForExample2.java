package ClassWork.Lesson9;

public class LoopForExample2 {
    public static void main(String[] args) {

        String workString = "For Loop Example.";

        for (int i = 0; i < workString.length(); i++) {

            char simbolFromOurString = workString.charAt(i);
            System.out.println(i + "simbol from our string -" +simbolFromOurString);

        }
    }
}
