package jav.Task_1;

//Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        Программа запускается через вызов главного класса с параметрами.

public class MainChessBoard {
    public static void main(String[] args) throws IllegalArgumentException{
        CheckArgs checkArgs = new CheckArgs(args);
        Print print = new Print();

        if(!checkArgs.isFlag()) {
           print.print(checkArgs.getException());
            return;
        }

        Board board = new Board(args);
        GenerateBoard generateBoard = new GenerateBoard(board);
        print.print(generateBoard.returnsString());


    }
}
