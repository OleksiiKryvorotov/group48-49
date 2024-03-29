package ClassWork.Lesson17;

public class Task8 {
    /*
    Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
 Введенное пользователем число сохраняется в переменную n.
 Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
 Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
     */
    public static void main(String[] args) {

        TasksUtil tu = new TasksUtil();

        int arraySize = 0;
        boolean NotCorrectInput = true;

        while (NotCorrectInput) {
            arraySize = tu.intUserInput("Please enter array size (> 3) :");
            if (arraySize>3){
                NotCorrectInput = false;
            }
        }

        int[] randomArray = tu.createAndFillArrayByRandom(arraySize);

        tu.printIntArr(randomArray,"Created array is: ");

        int[] evenElementsArray = tu.createEvenElementsArray(randomArray);
        tu.printIntArr(evenElementsArray,"Array events elements");



    }
}