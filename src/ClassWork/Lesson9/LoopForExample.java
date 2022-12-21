package ClassWork.Lesson9;

import HomeWorks.HW2_1.Calculator;

import java.util.Random;

public class LoopForExample {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
           //Первый Вариант:

           /*int calculationResult = i*i + random.nextInt(100);
           System.out.println("i = " +i+ " random =" + calculationResult);
           */
           //Второй вариант:

            int calculationResult;

            if (i % 2 == 0) {
                calculationResult = i*i+ random.nextInt(100);
            } else {
                calculationResult = i*i*i+ random.nextInt(1000);
            }

            System.out.println("i = " +i+ " random =" + calculationResult);

        }

    }
}
