package ClassWork.Lesson8;

public class TernarOperatorExampe {
    public static void main(String[] args) {

       System.out.println(absolut(10));
       System.out.println(absolut(-10));


    }

    public static int absolut (int number){
        if (number>=0){
            return number;
        } else {
            return -number;
        }
    }

    public static int absolut2 (int number) {
        int result = number >=0 ? number : -number;
        return result;
    }
}
