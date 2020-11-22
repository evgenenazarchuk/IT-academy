package by.academy.homework.homework_4;


public class Person {

    public static final Validator americanPhoneValidator = new AmericanPhoneValidator();
    public  static final Validator belarusPhoneValidator = new BelarusPhoneValidator();
    public static final Validator emailAddres = new EmailValidator();
    //DateOfBirth dateOfBirth = new DateOfBirth();
    String name;
    double cash;

    public Person(String name, double cash) {
        super();
        this.name = name;
        this.cash = cash;
    }

    public Person() {
        super();
    }

    public String getName() {
        return name;
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

}
