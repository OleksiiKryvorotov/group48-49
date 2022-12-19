package TASKS.Tasks1;

public class Tasks1 {

   public static void main(String[] args) {

      Cat myCat = new Cat("Barsik", 5, 7.5);

      System.out.println(myCat);

      Cat myCat2 = new Cat("Thomas", 3, 3.5);

      System.out.println(myCat2);

      myCat.className(); //Вызываем метод объекта


                          //  КОНВЕРТЕР!!!

      Converter1 converter = new Converter1(); //Создаю с констр. по умолчанию

      System.out.println("Число в троичной системе - " + converter.to3(637));

   }
}
