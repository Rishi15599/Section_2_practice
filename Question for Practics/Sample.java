public class Sample {
    public static void m1() {
        System.out.println("m1 method");
        m2();
    }
    public static void m2(){
        System.out.println("m2 method");
        m3();
    }
    public static void m3() {
        System.out.println("m3 method");
        
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        m1();
        System.out.println("Main Ends");
    }
}
