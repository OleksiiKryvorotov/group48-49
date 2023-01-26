package ClassWork.Lesson17;

public class Task1 {

    /*
    Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
Не используйте дополнительный массив для хранения результатов.
     */


    public static void main(String[] args) {

        TasksUtil tu = new TasksUtil();

        String[] calendar = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        String[] reversArrayResult = tu.reverseWithAddArray(calendar);

        tu.printStringArr(calendar,"Our original array");
        tu.printStringArr(reversArrayResult,"Our array  after reverse (version 1)");

        tu.printStringArr(calendar,"Our original array");
        tu.reverseWithoutAddArray(calendar);
        tu.printStringArr(calendar,"Our array  after reverse (version 2)");

    }


}