package jav.Task_3;

public class ParseLine {
    String line;

    public ParseLine(String line) {
        this.line = line;
    }

    Triangle createTriangle(){
        String [] split = line.split(",");
        String name = split[0];
        double firstSide = Double.parseDouble(split[1]);
        double secondSide = Double.parseDouble(split[2]);
        double thirdSide = Double.parseDouble(split[3]);

        Triangle triangle = new Triangle(name, firstSide,secondSide,thirdSide);
        return triangle;
    }
}
