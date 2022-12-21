package ClassWork.Lesson9;

/* Разработать класс - продукт с характеристиками:

Свойства:
 - Название (String name)
 - Станд. цена (double regularPrice)
 - Скидка в проц. (double discount)

 Методы:
 1. Расчет актуальной стоимости c учетом скидки (double actualPrice())
 Вывод инф. о продукте в консоль (void printlnInformation())1P
 2. Название продукта задать через конструктор,
 а стоимость через оператор ","
 Класс с объявлением продукта должен назыв. "Product"
 Класс с демонстрацией работы должен назыв. "ProductDemo
 */

public class ProductDemo {

    public static void main(String[] args) {

        Product productMilk = new Product("Milk");
        productMilk.standartPrice = 1.5;
        productMilk.discount = 0.1;

        double actualPriceCalculate = productMilk.actualPriceCalculate();
        productMilk.printInformation(productMilk.actualPriceCalculate());

        System.out.println("-----------------------------------");


        Product productBread = new Product("Bread");
        productBread.standartPrice = 0.25;
        productBread.discount = 0.15;


        productBread.printInformation(productBread.actualPriceCalculate());

    }
}
