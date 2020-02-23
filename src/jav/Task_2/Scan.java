package jav.Task_2;

import java.util.Scanner;

public class Scan {
private double a,b,c,d;
    public Scan() {
        scan();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    Scanner scanner = new Scanner(System.in);
    private void scan() {
        System.out.println("Please enter first letter size");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println("Please enter second letter size");
        c = scanner.nextDouble();
        d = scanner.nextDouble();
    }


    public boolean toContinue() {
        System.out.println("Do you want to continue?");
        String yesOrNo = scanner.next().toLowerCase();
        if(yesOrNo.equals("y") || yesOrNo.equals("yes")) return true;
        else return false;
    }
}
