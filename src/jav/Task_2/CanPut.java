    package jav.Task_2;

public class CanPut {
    private double a, b, c, d;

    public CanPut(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        canPut();
    }

    private void canPut() {
        if (a < c && b < d || a < d && b < c || a > c && b > d || a > d && b > c) {
            System.out.println("You can put one letter into another");
        } else
            System.out.println("You can't put one letter into another");
    }


}
