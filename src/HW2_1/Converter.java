package HW2_1;

public class Converter {

//Перевод в троичную систему:

    public String to3(int i) {
        String str = "";
        while (i > 0) {  // Цикл - оператор, который позволяет многократно выполнять действия
        str += i%3;
        i = i/3;
        }
        return reverse (str);
    }
//Метод переворота строки
    public String reverse(String str) {
        String rev ="";
        for (int i = str.length() -1;  i>0 ; i--) {
            rev += str.charAt(i);
        }
        return  rev;
    }
}



