package jav.Task_8;

public class Controller {
    int argLenght;
    String[] args;
    CalcFibonacci calcFibonacci;
    PrintConsole printConsole = new PrintConsole();

    public Controller(String[] args) {
        this.args = args;
        printConsole.welcome();
        checkMethod();
    }

    void checkMethod(){
        argLenght = args.length;
        switch (argLenght){
            case 2:
                new CalcFibonacci(Long.parseLong(args[0]),Long.parseLong(args[1]));
                break;
            case 1:
                new CalcFibonacci(Integer.parseInt(args[0]));
                break;
//            case 0:
//                printConsole.welcome();
        }
    }
}
