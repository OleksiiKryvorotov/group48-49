package Lesson5;

public class PersonDemo {

    public static void main(String[] args) {

        Person personOlga = new Person();
        personOlga.name = "Olga";

        Person personPetr = new Person();
        personPetr.name = "Petr";


        System.out.println("----- Olga ------");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        System.out.println("----- Petr ------");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);

        personPetr.town = "Dnepr";

        System.out.println("----- Olga ------");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        System.out.println("----- Petr ------");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);

    }
}
