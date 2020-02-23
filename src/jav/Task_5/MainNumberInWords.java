package jav.Task_5;

//        Число в пропись
//        Нужно преобразовать целое число в прописной вариант: 12 – двенадцать. Программа запускается
//        через вызов главного класса с параметрами.

public class MainNumberInWords {
    public static void main(String[] args) {
        String numberInWords;
        PrintConsole printConsole = new PrintConsole();

        if (args.length != 0 && CheckBigInteger.checkDigits(args[0])) {
            printConsole.printNumberWithDigits(args[0]);
            numberInWords = new FillWord().sendRightDigit(args[0]);
            printConsole.printNumberWithWords(numberInWords);
        } else {
            printConsole.notANumber();
        }


    }
}
