package by.academy.classwork.classwork7;

public class Choko extends Product {
    String size;

    public Choko(double price, String name, String type, int quantity, String color) {
        super(price, name, type, quantity);
        this.size = size;

    }

    protected double calcDiscount() {
        if (name.contains("black")){
            return 0.4;

        }
        return 1;
    }

    @Override
    public double discount() {
        if (quantity>10) {
            return 0.2;
        }
        return 1;
    }
}
