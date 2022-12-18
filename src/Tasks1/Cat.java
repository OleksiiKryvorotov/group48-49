package Tasks1;
/*      Задачи:
   1) реализовать возм. создания кота с именем, возрастом, весом,
   id (генерируемым автоматически) и возм. вывода всех его полей на консоль
 */
public class Cat {
    String name;
    int age;
    double weight;
    static  int id; //Переменная принадл. классу
    int ident;      //Переменная принадл. объекту

    //создаем конструтор (ALT insert) чтобы создать экземпляр класса:


    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        ident = id;  //автомат. генерирую идентификаторы
        id ++; // добавляем 1
    }

    public void className() {
        System.out.println("Создан в классе Cat");
    }

    //toString() - метод, который есть у всех классов JAVA.
    //       В JAVA есть гарантии, что у каждого класса будет набор
    //       опред. методов(неявное наследование от класса Object)
    @Override
    public String toString() {   //
        return "Cat{" +
                "name='" + name + '\'' +
                ", aga=" + age +
                ", weight=" + weight +
                ", ident=" + ident +
                '}';
    }
}
