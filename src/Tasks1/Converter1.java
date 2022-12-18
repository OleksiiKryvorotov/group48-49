package Tasks1;

public class Converter1 {

//Перевод в троичную систему:

    public String to3(int i) {
        String str = "";
        while (i > 0) {
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



