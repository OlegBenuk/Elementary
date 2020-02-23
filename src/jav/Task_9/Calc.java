package jav.Task_9;

class Calc {
    private double number;
    private int exponent;
    private double result = 1;

    Calc(String [] args) {
        this.number = Double.parseDouble(args[0]);
        this.exponent = Integer.parseInt(args[1]);
    }

     String pow() {
        if (exponent <= -1) {
            number = 1 / number;
            exponent = -exponent;
        }
        while (exponent > 1 || exponent < -1) {
            if (exponent % 2 == 1) {
                result *= number;
            }
            number *= number;
            exponent /= 2;
        }
        return String.valueOf(result * number);
    }
}
