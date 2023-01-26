package ClassWork.Lesson16Buble;

import java.util.Arrays;

public class InsertArraySort {
    public static void main(String[] args) {

        int[] arrayForSort = {8,3,5,2,1,4,7,6};
        /*
        {8,3,5,2,1,4,7,6}  - исходный массив
        {8,|| 3,5,2,1,4,7,6}
        {8,3,|| 5,2,1,4,7,6}
        {3,8,|| 5,2,1,4,7,6}
        {3,8,5,||2,1,4,7,6}
        {3,5,8,||2,1,4,7,6}
        {3,5,8,2,||1,4,7,6}
        {2,3,5,8,||1,4,7,6}
        {1,2,3,5,8,||4,7,6}
        {1,2,3,4,5,8,||7,6}
        {1,2,3,4,5,7,8,||6}
        {1,2,3,4,5,6,7,8}

        ----------------

         */


        System.out.println("Array before sort:");
        System.out.println(Arrays.toString(arrayForSort));
        insertSort(arrayForSort);
        System.out.println("Array after sort:");
        System.out.println(Arrays.toString(arrayForSort));

    }

    public static void insertSort(int[] workingArray){
        boolean notSorted = true;
        int temp;


        while (notSorted) {
            System.out.println(notSorted);
            System.out.println(Arrays.toString(workingArray));
            notSorted = false;
            for (int i = 0; i < workingArray.length-1; i++) {
                if(workingArray[i]>workingArray[i+1]){
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i+1];
                    workingArray[i+1] = temp;
                    notSorted = true;
                }
            }
        }
    }
}