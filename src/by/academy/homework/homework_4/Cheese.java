package by.academy.homework.homework_4;

public final class Cheese extends Product {
    public Cheese(double price, String type, String producerName, int quantity) {
        super(price, type, producerName, quantity);
    }

    @Override
    public double discount() {
        if (quantity > 6) {
            return 0.6;

        }
        return 1;
    }

}
