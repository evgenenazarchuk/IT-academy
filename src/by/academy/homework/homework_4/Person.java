package by.academy.homework.homework_4;
import java.util.*;

public class Person {

    public static final Validator americanPhoneValidator = new AmericanPhoneValidator();
    public  static final Validator belarusPhoneValidator = new BelarusPhoneValidator();
    public static final Validator emailAddres = new EmailValidator();

    String name;
    double cash;
    String dateOfBirth;



    public Person(String name, double cash) {
        super();
        this.name = name;
        this.cash = cash;
    }

    public Person() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void dateOfBirth() {
        Scanner scannerBirth = new Scanner(System.in);
        System.out.println("Для завершения сделки \n введите вашу дату рождения  : ");
        String enterBirth = scannerBirth.next();

        Date checkBirth = new Date();
        System.out.println("dd/MM/yyyy - " + checkBirth.Date1(enterBirth));
        System.out.println("dd.MM.yyyy - " + checkBirth.Date2(enterBirth));
        System.out.println("Super!");
    }


}
