package by.academy.homework.homework_1;

public class Application {
    public static void main(String[] args) {

        Cat cat = new Cat("Black");
        Cat cat1 = new Cat("White", 3);
        cat.eat();
        cat.sleep();
        cat.walk();
        cat.printAge();
        cat.grow(1);
        cat.printAge();
        cat.grow(3);
        cat.printAge();
        cat1.printAge();

        int catAge = cat.getAge();
        //System.out.println(catAge);
        cat.getMoney();
        cat.setMoney();
        cat.getInitials();
        cat.setInitials();
        cat.isHomeAnimal();
    }
}

