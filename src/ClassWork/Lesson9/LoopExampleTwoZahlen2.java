package ClassWork.Lesson9;

//Написать программу, которая запрашивает у польз. два целых числа
//и выводит наименьшее из них:

public class LoopExampleTwoZahlen2 {

    double number1;
    double number2;

    public double compare() {
        if (number1<number2)  {return number1;}
          else {return number2;}

    }

    public void printInfo(double compareResult) {
        System.out.println("------------------------");
        System.out.println("Lesser number is" +compareResult);
    }
}
