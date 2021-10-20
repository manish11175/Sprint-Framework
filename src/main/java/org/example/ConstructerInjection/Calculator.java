package org.example.ConstructerInjection;

public class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Int int");

    }
    public Calculator(double x,double y){
        this.x=(int)x;
        this.y=(int)y;
        System.out.println("double double");
    }
    public Calculator(String x,String y){
        this.x=Integer.parseInt(x);
        this.y=Integer.parseInt(y);
        System.out.println("String String");
    }

    public void add(){
        System.out.println("Sum of :"+(this.x+this.y));
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
