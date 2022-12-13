package Lesson3;

public class DogDemo {
    public static void main(String[] args) {

        Dog myDog = new Dog("Lessy", "Kolli", 3);

        //Dog.myDog = "Lessy";
        //Dog.breed  = "Kolli";
        //Dog.age  = 3;



        myDog.voice("Gav! Gav! Gav1");

        myDog.age = myDog.age + 1;

        System.out.println(myDog);
    }
}
