package by.academy.homework.homework_4;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class Application {
    public static void main(String[] args) {
        Person seller = new Person("Peter", 1000.22);
        Person buyer = new Person("Michael", 900.00);

        Deal deal = new Deal("21-11-2020", seller, buyer);
        deal.addProduct(new Meat(15.00, "1", "Minsk", 7));
        deal.addProduct(new Vine(7.00, "2", "peach", 7));
        deal.addProduct(new Milk(9.00, "3", "banana", 15, "black"));
        deal.addProduct(new Cheese(30.00, "4", "Russia", 34));
        deal.printProducts();
        //deal.deleteProduct(2);
        System.out.println("--------------------------------");
        deal.printProducts();

        Person number1 = new Person();

        Person.americanPhoneValidator.isValid("+178523145");
        Person.belarusPhoneValidator.isValid("+375259394024");
        Person.emailAddres.isValid("e.nazarchuk96@gmail.com");
        Person birth = new Person();
        birth.dateOfBirth();
        deal.deadLinedate();




    }
}



