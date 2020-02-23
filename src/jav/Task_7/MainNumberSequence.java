package jav.Task_7;

//Программа выводит ряд натуральных чисел через запятую, квадрат которых меньше заданного n.
//        Программа запускается через вызов главного класса с параметрами.

public class MainNumberSequence {
    public static void main(String[] args) {
       // if(CheckArg.checkDigits(args[0])) {
           String numberSeq = new NaturalNumbers().createNaturalNumberSeq(args[0]);
           PrintConsole.printNumbers(numberSeq);
      //  }else {
     //       PrintConsole.printWrongArgs();
        }
    }
//}
