package by.academy.classwork.classwork7;

public class Applicate {
    private String Date;
    private boolean Buyer;
    private String seller;
    private boolean result;

    public static void main (String [] args) {
        Person seller =new Person("Carl",200.00);
        Person Buyer =new Person("Micha", 300.00);





        Product [] products=new Product[2];
        //products[0]= new Milk(10.00,"apply","fruits",5);
       // products [1] = new Choko(7.00, "peach", "fruits",7);
        //products [2]=new Product(3.00, "bananas", "fruits",15);



        Deal firstDeal=new Deal("1 October",Buyer,seller,products);
        firstDeal.result();

        Product Milk = new Milk(10.0,"apple", "test",5, "black");

        Product Choko = new Choko(7.0,"apple", "test",5, "black");





    }

}
