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
 */

public class Product {
    String product;

    double standartPrice;

    double discount;
    public Product(String product) {
        this.product = product;
    }

    public double actualPriceCalculate(){
        double priceWithDiscount = standartPrice* (1 - discount);//1 - 100%

        return priceWithDiscount;
    }

    public void printInformation(double priceWithDiscount){
        System.out.println("Product name - " + product);
        System.out.println("Standart price - " + standartPrice);
        System.out.println("Discount - " + discount);
        System.out.println("Price with discount - " + priceWithDiscount);

    }

}
