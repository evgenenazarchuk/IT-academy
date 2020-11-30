package by.academy.classwork.classwork7;

public class Person {
    String name;
    double cash;

    public Person () {
    }

    public Person(String name, double cash){
            this.name = name;
            this.cash = cash;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public void setCash ( double cash){
            this.cash = cash;
        }

        public double getCash () {
            return cash;
        }
    }


