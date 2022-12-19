package ClassWork.Lesson7;

public class IfElseConditionExample {
    public static void main(String[] args) {

        /*int x=100;
        int y=0;

        if (x<100) {
             y = x*25;
        } else if (x>100) {
             y = x/5;
        } else {
             y = x*x;
        }
        System.out.println(y);*/
        int x = 100;
        int z;
        int a;

        if (x < 100 && (x % 2 == 0))
        //вычисляем знач. выражения (x<100) - результат или true или false
        //вычисляем знач. выражения (x % 2 ==0) - результат или true или false
        //для этого выражения сперва вычмсл. остаток от деления x % 2
        // и далее сравнивается этот результат с 0
        //
        //
        //
        //
        {
            int y = x * 25;
            z = y * y;
            a = z * 10;

        } else if (x > 100) {
            int y = x / 5;
            z = y * y;
            a = z * 10;

        }
    }
}