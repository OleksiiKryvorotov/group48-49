package ClassWork.Lesson17;

public class Task3 {

    /*
    Напишите программу, которая определит, сколько слов Вы ввели с консоли.
     */

    public static void main(String[] args) {
        TasksUtil tu = new TasksUtil();

        //.
        // String testString = "word1,word2,    word3 word4,word5";


        String testString = "c:/tmp/java.doc.part1";

                System.out.println("Words number in the our string is - "+tu.wordsCounter(testString));

    }

}