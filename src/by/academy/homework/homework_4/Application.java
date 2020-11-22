package by.academy.homework.homework_4;

public class Application {
    public static void main(String[] args) {
        Person seller = new Person("Peter", 1000.22);
        Person buyer = new Person("Michael", 900.00);



        Product[]  products=new Product[4];

        products[0]=new Meat(15.00, "1", "Academy Bel", 7);
        products[1]=new Vine(7.00, "2", "peach", 7);
        products[2]=new Milk(3.00, "3", "banana", 15, "black");
        products[3]=new Milk(3.00, "milk", "banana", 15, "black");


        for (Product p : products) {
            System.out.println("Name: " + p.getProducerName());
            System.out.println("Type: " + p.getType());
            System.out.println("Total Price: " + p.calcTotalPrice());
            System.out.println("-----------------");
        }

		Person.americanPhoneValidator.isValid("+187456985");
        Person.belarusPhoneValidator.isValid("+375291000000");
         Person.emailAddres.isValid("e.nazarchuk@mail.com");



        System.out.println(((Milk) products[3]).getNonStaticMilkCount());
        System.out.println(Milk.getMilkCount());

        Product pTest = new Milk(3.00, "fruits", "banana", 15, "black");
        Milk mtest = new Milk(10.00, "fruits", "apple", 5, "white");
        Deal firstDeal = new Deal("1 January", buyer, seller, products);
        firstDeal.result();


    }

}



