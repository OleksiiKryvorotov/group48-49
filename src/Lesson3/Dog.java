package Lesson3;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String n1,String b1, int a1) {
        this.name = n1;
        this.breed = b1;
        this.age = a1;

    }

    public void voice (String voice) {
        System.out.println(voice);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
