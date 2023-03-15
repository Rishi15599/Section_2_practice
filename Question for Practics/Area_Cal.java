import java.util.Scanner;
public class Area_Cal {
    public static void rectangle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height of rectangle : ");
        int h=sc.nextInt();
        System.out.print("Enter the width of rectangle : ");
        int b=sc.nextInt();
        int a=h*b;
        System.out.println("-----------------------------------");
        System.out.println("Area of rectangle : "+a);
    }
    public static void triangle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height of triangle : ");
        int h=sc.nextInt();
        System.out.print("Enter the base of triangle : ");
        int b=sc.nextInt();
        double a=0.5*h*b;
        System.out.println("-----------------------------------");
        System.out.println("Area of triangle : "+a);
    }
    public static void circle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        int r=sc.nextInt();
        double pi=3.14;
        double a=pi*r*r;
        System.out.println("-----------------------------------");
        System.out.println("Area of circle : "+a);
    }
    public static void cylinder(){
        Scanner sc=new Scanner(System.in);
        //curved surface area = 2*pi*r*h
        double pi=3.14;
        System.out.print("Enter thr radius of cylinder : ");
        int r=sc.nextInt();
        System.out.print("Enter the height of cylinder : ");
        int h=sc.nextInt();
        double a1=2*pi*r*h;
        System.out.println("-----------------------------------");
        System.out.println("curved surface area of cylinder : "+a1);

        //total surface area = 2*pi*r*(r+h)
        double a2=2*pi*r*(r+h);
        System.out.println("-----------------------------------");
        System.out.println("total surface area of cylinder : "+a2);

        //volume of cylinder = pi*r*r*h
        double v=pi*r*r*h;
        System.out.println("-----------------------------------");
        System.out.println("volume of cylinder : "+v);
    }

    public static void main(String[] args) {
        rectangle();
        System.out.println("==================================");
        triangle();
        System.out.println("==================================");
        circle();
        System.out.println("==================================");
        cylinder();
    }
}
