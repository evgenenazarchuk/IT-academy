package by.academy.classwork.classwork_10;

public class PrintDemo {
    public static void main (String[] args){
        Pritable pritable = new Pritable() {

            @Override
            public void calc (){
                System.out.println("Я вычисляю");
            }
            @Override
            public void print() {
                System.out.println("Я печатаю");
            }
        };
        pritable.print();

    }
}
