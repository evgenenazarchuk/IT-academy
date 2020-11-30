package by.academy.classwork.classwork_10;

public class Calculator {

    public static <K extends Number,V extends Number> double sum(K a, V b){
        if (a==null && b==null) {
            System.out.println("Не можем умножать null");
            return  0;


        }
       return a.doubleValue()+b.doubleValue();
    }

    public static <K extends Number,V extends Number> double multiply(K a, V b){
        if (a==null && b==null) {
            System.out.println("Не можем умножать null");
            return  0;

        }
        return a.doubleValue()*b.doubleValue();
    }
    public static <K extends Number,V extends Number> double divide(K a, V b){
        if (a==null && b==null) {
            System.out.println("Не можем делить null");
            return  0;

        }
        return a.doubleValue()/b.doubleValue();
    }
    public static <K extends Number,V extends Number> double subtraction(K a, V b){
        if (a==null && b==null) {
            System.out.println("Не можем отнимать null");
            return  0;

        }
        return a.doubleValue()-b.doubleValue();
    }
}
