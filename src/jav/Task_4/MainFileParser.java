package jav.Task_4;

//Нужно написать программу, которая будет иметь два режима:
//        1. Считать количество вхождений строки в текстовом файле.
//        2. Делать замену строки на другую в указанном файле
//        Программа должна принимать аргументы на вход при запуске:
//        1. <путь к файлу> <строка для подсчёта>
//        2. <путь к файлу> <строка для поиска> <строка для замены>

import java.io.IOException;

public class MainFileParser {
    public static void main(String[] args) throws IOException {
        CheckArgs checkArgs = new CheckArgs();
        if(checkArgs.argsLenBiggerTwo(args)) {
            ReadFile readFile = new ReadFile(args);
            if(args.length==2){
            FindEntriesOrReplaceWord feocw = new FindEntriesOrReplaceWord
                    (args[0],args[1],args[2]);
            }
            else{
            FindEntriesOrReplaceWord feocw = new FindEntriesOrReplaceWord
                    (readFile.getFilePath(), readFile.getWordToFind(), readFile.getChangeTo());}
        }
    }

}
