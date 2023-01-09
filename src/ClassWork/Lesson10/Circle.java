package ClassWork.Lesson10;

public class Circle {


                    //Площадь круга:

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.pow(radius,2)*Math.PI;

    }

}
