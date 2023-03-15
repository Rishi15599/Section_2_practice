//Write Program to pass three double value and return int value and dont print the value ?

public class Test2 {
    public static double test2(double d1, double d2, double d3){
        System.out.println("In this method have three double value");
        double d=d1+d2+d3;
        return d;
    }
    public static void main(String[] args) {
        System.out.print(test2(20.5d, 30.5d, 40.5d));
    }
}
