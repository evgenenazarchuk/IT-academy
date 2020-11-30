package by.academy.classwork.classwork7;






public abstract class Product {
   protected double price;
   protected String name;
   protected String type;
    protected int quantity;
    public Product(){
        super();
    }




    public Product(double price, String name, String type, int quantity) {
        this.price = price;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }



    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calcTotalPrice() {
        return quantity * price * discount();

    }

    public abstract double discount();
}
