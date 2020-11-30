package by.academy.classwork.classwork7;
/*
 * Необходимо реализовать программу, которая будет позволять вводить сделки
 * купли-продажи товаров между двумя участниками. В каждой сделке может быть
 * несколько товаров, сумма сделки рассчитывается из суммы всех товаров. Сумма
 * каждого товара рассчитывается из его стоимости и количества. Программа должна
 * позволить ввести информацию о сделках, сохранить ее в памяти и вывести на
 * экран. Ввод информацию осщуествляется с экрана (консоли). Количество
 * дополнительной информацию о сделке, участнике, товаре придумать самому
 * (больше одного поля для класса).
 */

public class Deal {
    String Date;
    Person buyer;
    Person seller;
    Product Products[];

    public void setDate(String date) {
        Date = date;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }

    public void setProducts(Product[] products) {
        Products = products;
    }

    public String getDate() {
        return Date;
    }

    public Person getBuyer() {
        return buyer;
    }

    public Person getSeller() {
        return seller;
    }

    public Product[] getProducts() {
        return Products;
    }

    public Deal(String date, Person buyer, Person seller, Product[] products) {
        Date = date;
        this.buyer = buyer;
        this.seller = seller;
        Products = products;
    }

    public Deal() {
        super();

    }

    public void result() {
        double sum = 0;
        for (Product product : Products) {
            sum += product.getPrice() * product.getQuantity();
        }
        if (sum > buyer.getCash()) {
            System.out.println("Недостаточно средств! ");
        } else {
            printBill();
        }
    }

    private void printBill() {
        double summ = 0;
        System.out.println("Сделка совершена ");
        buyer.setCash(buyer.getCash() - summ);
        seller.setCash(seller.getCash() + summ);
        System.out.println("Деньги покупателя " + buyer.getCash());
        System.out.println("Деньги продавца " + seller.getCash());
        for (Product products : Products) {
            double totalProductPrice = products.getPrice() * products.getQuantity();
            summ += totalProductPrice;


            System.out.println("Имя: " + products.getName() + " " + products.getPrice() + "=" + totalProductPrice);
            buyer.setCash(buyer.getCash() - summ);

        }
        System.out.println("Сумма всей сделки " + summ);
     //   System.out.println(());

    }
}



