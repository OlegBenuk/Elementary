package jav.Task_3;

public class Triangle implements Shape2D {
    double firstSide;
    double secondSide;
    double thirdSide;
    double square;
    String name;

    public Triangle(String name, double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.name = name;
        setSquare(calcSquare());
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calcSquare() {
        double halfPerimetr;
        halfPerimetr = (firstSide+secondSide+thirdSide)/2;
        double square = Math.sqrt(halfPerimetr*(halfPerimetr-firstSide)*
                                 (halfPerimetr-secondSide)*(halfPerimetr-thirdSide));
        return square;
    }
}
