package TASKS.Tasks4Massiv;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(180, "Мерседес", 10000);

        Car car1 = new Car();
        car1.setSpeed(140);

        Car car2 = new Car(200, "BMW");
        
        System.out.println(car.getBrand());
        car.setSpeed(200);
        System.out.println(car.getSpeed());


        System.out.println(car);



    }
}
