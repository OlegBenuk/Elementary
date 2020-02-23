package jav.Task_9;



public class MainPow {

    public static void main(String[] args) {
        CheckArgs checkArgs = new CheckArgs(args);
        Print print = new Print();
        if(checkArgs.isFlag()) {
            print.print(checkArgs.getException());
            return;
        }
        Calc calc = new Calc(args);
        print.print(calc.pow());
    }

    }



