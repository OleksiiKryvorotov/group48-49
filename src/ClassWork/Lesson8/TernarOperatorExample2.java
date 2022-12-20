package ClassWork.Lesson8;

public class TernarOperatorExample2 {
    /* Реализовать метод, котрый принимает число и проверяет его.
        Если число целое, то возвр. квадрат этого числа,
        иначе - возвр. 0.
        */
    public static void main(String[] args) {
    //первый способ:
       System.out.println(checkNumber(20.555));
       System.out.println(checkNumber(10.0));
    //второй способ:
        System.out.println(checkNumber2(20.555));
        System.out.println(checkNumber2(10.0));

    }
    //первый способ:
    public static int checkNumber (double number) {

        int checkMainPart = (int) (number); //результат в первом примере - 20

        double ostatok = number - checkMainPart; // остаток 20.555 - 20
        System.out.println("ostatok = "+ostatok); //это можно не выводить!

        if (ostatok==0) {
            return  checkMainPart*checkMainPart;
        } else {
            return 0;
        }
    }
    //второй способ:
    public static int checkNumber2 (double number) {

        int checkMainPart = (int) (number);

        double ostatok = number - checkMainPart;

        int resultForReturn = ostatok == 0 ? checkMainPart * checkMainPart : 0;

        return resultForReturn;

    }

}
