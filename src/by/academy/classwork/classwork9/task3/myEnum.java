package by.academy.classwork.classwork9.task3;

public enum myEnum {
    WINTER (-20.0),
    SUMMER(30.0),
    SPRING(20.0),
    FALL(5.0);
    private double avgTemp;
    myEnum(double avgTemp){
        this.avgTemp=avgTemp;
    }
    public  double getAvgTemp() {
        return avgTemp;
    }
}
