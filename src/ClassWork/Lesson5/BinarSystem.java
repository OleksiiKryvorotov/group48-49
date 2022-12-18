package Lesson5;

import java.util.Scanner;

public class BinarSystem {
    /*

    Поскольку у нас десятичная система счисления,
    мы имеем 10 символов (цифр) для построения чисел.
    Начинаем порядковый счет: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Цифры закончились.
    Мы увеличиваем разрядность числа и обнуляем младший разряд: 10.
    Затем опять увеличиваем младший разряд,
    пока не закончатся все цифры: 11, 12, 13, 14, 15, 16, 17, 18, 19.
    Увеличиваем старший разряд на 1 и обнуляем младший: 20.
    Когда мы используем все цифры для обоих разрядов (получим число 99),
    опять увеличиваем разрядность числа и обнуляем имеющиеся разряды: 100.
    И так далее.


     */

    public static void main(String[] args) {
        String str;
        int i;
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Введите любое целочисленное число, 0 для выхода");
        str = scanner.nextLine();

        i = Integer.parseInt(str);

        System.out.println("Число " + i + " в двоичной форме: " +
                Integer.toBinaryString(i));
        System.out.println("Число " + i + " в восьмеричной форме: " +
                Integer.toOctalString(i));
        System.out.println("Число " + i + " в шестнадцатеричной форме: " +
                Integer.toHexString(i));
        System.out.println();
    }
/*
в восьмеричной основание 8
8->10
333 = 3*8^2+3*8^1+3*8^0 = 3*64+3*8+3*1 = 192+24+3 = 219

10->8
219 = 219/8 = 27 и 219%8 = 3, 27/8 = 3 27%8 = 3 -> (3*8+3)*8+3
219 = 219/64 = 3 отс 27/8 = 3 ост 3/1 = 3 сот 0

16->10
333 = 3*16^2+3*16^1+3*16^0 = 3*256+3*16+3*1 = 768+48+3 = 819

10->16
819 = 819/16=51 (819-816) ост 3, 51/16=3 (51-48) ост 3

10->16

2->10
отличается от десятичной тем, что в ней вместо 10 в степень возводится двойка,
например, число двоичное число 101101 можно прочитать так:

101101= 1*2^5 + 0*2^4 + 1*2^3 + 1*2^2 + 0*2^1 + 1*2^0

= 32 + 0 + 8 + 4 + 0 + 1 = 45 (это уже в десятичной системе)

10->2
124 и поделим его на основание двоичной системы, то есть число 2.
 */
}