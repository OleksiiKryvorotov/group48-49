package HomeWorks.HW2_1;

import java.util.Scanner;

public class hw2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 0) 333 из шестн. в десят.:
        int a = 0x333;
        System.out.println("0) 333 из шестн. в десят. системе - " + a);

        // 1) разложить число 200345 на разряды в десятичной системе:




        // 2) 637 из десят. в шестн. и обратно:
        String str1 = Integer.toString(637, 16);
        System.out.println("2) 637 из десят. в шестн. системе - " + str1);

        int b = 0x27d;
        System.out.println("2) 27d из шестн. в десят. системе - " + b);

        // 3) 637 из десят. в двоич.:
        String str2 = Integer.toString(637, 2);
        System.out.println("3) 637 из десят. в двоич. системе - " + str2);

        // 4) 11100111 из двоич. в десят.:
        int c = 0b11100111;
        System.out.println("4) 11100111 из двоич. в десят. системе - " + c);

        // 5) 637 из десят. в троич.:
        String str = Integer.toString(637, 3); //Перевод из десят. сист.
        // сначала значение потом система
        System.out.println("5) 637 из десят. в троич. системе - " + str);

    }
}
