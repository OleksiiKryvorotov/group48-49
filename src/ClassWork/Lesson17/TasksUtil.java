package ClassWork.Lesson17;

import java.util.Arrays;
import java.util.Scanner;

public class TasksUtil {
    public  String[] reverseWithAddArray(String[] workingArray){

        String[] arrayAfterRevers = new String[workingArray.length];

        for (int i = 0; i < workingArray.length; i++) {
            arrayAfterRevers[arrayAfterRevers.length-1-i] = workingArray[i];
            // линна массива =10  -> индексы в диапазоне от 0 до 9
            // i=0 до 9
            //i=0      первый индекс:[10 - 1 -0] =9   второй индекс = 0
            //i=1      первый индекс:[10 - 1 -1] =8   второй индекс = 1
            //i=2      первый индекс:[10 - 1 -2] =7   второй индекс = 2
            //......
            //i=9      первый индекс:[10 - 1 -9] =0   второй индекс = 9

        }

        return arrayAfterRevers;

    }

    public void reverseWithoutAddArray(String[] workingArray){

        String temp = "";

        for (int i = 0; i < workingArray.length/2; i++) {
            temp = workingArray[i];
            workingArray[i] = workingArray[workingArray.length-1-i];
            workingArray[workingArray.length-1-i] = temp;

            System.out.println(Arrays.toString(workingArray));
        }

    }


    public void printStringArr(String[] workingArray, String message){
        System.out.println(message);
        System.out.println(Arrays.toString(workingArray));
    }

    public void printIntArr(int[] workingArray, String message){
        System.out.println(message);
        System.out.println(Arrays.toString(workingArray));
    }

    public String stringUserInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    public int intUserInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public int wordsCounter(String workingSting){
        String[] workingStringArray = workingSting.split("/|\\.");

        System.out.println(Arrays.toString(workingStringArray));

        int wordsCounter=0;

        // берем первый элемент массива - word1
        // сравниваем это значение с пустой  строкой ЭЭ
        //и спрашиваем метод equals - это пустая строка или нет???
        // equals нам возвращает false потому что строки не равны
        // выражение в круглых скобках будет true - потому что !fasle
        // так как выражение будет иметь значение true то оператор if выполнится
        // и счетчик слов увеличится на 1


        for (int i = 0; i < workingStringArray.length; i++) {
           if (!workingStringArray[i].equals("")) {
               wordsCounter++;
           }
        }

        return wordsCounter;
    }

    public int[] createAndFillArrayByRandom(int sizeArray){
        int[] createdArray = new int[sizeArray];

        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = (int) (Math.random()*sizeArray);
        }

        return createdArray;

    }

    public int[] createEvenElementsArray(int[] workingArray){

        int sizeArray =0;

        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] % 2 ==0) {
                sizeArray++;
            }
        }


        int[] evenElement = new int[sizeArray];

        int indexForEvenArray=0;


        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] % 2 ==0) {
                evenElement[indexForEvenArray] = workingArray[i];
                indexForEvenArray++;
            }

        }

        return evenElement;
    }

}