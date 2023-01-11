package ClassWork.Lesson12Massiv;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int [] array = new int[3];

        array [0] = 6;
        array [1] = 9;
        array [2] = 15;
        System.out.println(Arrays.toString(array));

        String [] stringArray = new String[3];
        stringArray[0] =" word 1 ";
        stringArray[1] =" word 2c ";
        stringArray[2] =" word 3 ";


        System.out.println(Arrays.toString(stringArray));
        System.out.println(stringArray[0]+stringArray[1]+stringArray[2]);


    }
}
