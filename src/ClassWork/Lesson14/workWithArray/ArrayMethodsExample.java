package ClassWork.Lesson14.workWithArray;


import java.util.Arrays;

public class ArrayMethodsExample {

    //CLONE!!!!

    public static void main(String[] args) {

        int[] workingArrage = new int[3];

        workingArrage[0] = 1;
        workingArrage[1] = 2;
        workingArrage[2] = 3;

        System.out.println(Arrays.toString(workingArrage));



        int []  cloneArray = workingArrage.clone();

        workingArrage[2] = 5;

        System.out.println(Arrays.toString(workingArrage));

        System.out.println(Arrays.toString(cloneArray));

        System.out.println("---------------------------");

        String[] stringArray = new String[3];

        stringArray[0] = "1";
        stringArray[1] = "2";
        stringArray[2] = "3";

        System.out.println(Arrays.toString(stringArray));


        String [] cloneStringArray = stringArray.clone();

        stringArray[2] = "5";

        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(cloneStringArray));

        //-------------------------------------------------------
        // COPY!!!!
        System.out.println("--------------------");

        String[] newArrayForCopy = new String[2];

        newArrayForCopy = Arrays.copyOf(stringArray, 8);

        System.out.println(Arrays.toString(newArrayForCopy));

        String [] newArrayForRangeCopy = Arrays.copyOfRange(stringArray, 3, 5);

        System.out.println(Arrays.toString(newArrayForRangeCopy));




    }
}
