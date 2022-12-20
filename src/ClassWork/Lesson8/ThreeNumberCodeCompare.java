package ClassWork.Lesson8;

public class ThreeNumberCodeCompare {
    public static void main(String[] args) {

        ThreeNumberCompare threeNumberCompare = new ThreeNumberCompare();

        double parametr1 = threeNumberCompare.userNumberInput("Please enter your first number");
        double parametr2 = threeNumberCompare.userNumberInput("Please enter your second number");
        double parametr3 = threeNumberCompare.userNumberInput("Please enter your third number");
        double checkResult = threeNumberCompare.compare(parametr1,parametr2,parametr3);

        threeNumberCompare.printMsg("Maximum from your numners is : " +checkResult);
    }
}
