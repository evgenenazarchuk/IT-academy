package by.academy.classwork.classwork7;


//@Producer (country = "New Zeland", founderFullName = "NewZelander", startYear = 1600)


public class Milk extends Product {
    public static final double MILK_DISCOUNT=0.7;
    String color;


    public Milk(double price, String name, String type, int quantity, String color) {
        super(price, name, type, quantity);
        this.color=color;
    }

    protected double calcDiscount() {
        if (name.contains("а")){
            return 0.9;

        }
        return 1;
    }

    @Override
    public double discount() {
       if (quantity>10) {
           return MILK_DISCOUNT;
       }
       return 1;
    }
}
