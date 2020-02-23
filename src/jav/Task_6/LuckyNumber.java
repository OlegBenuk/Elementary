package jav.Task_6;
//Счастливые билеты.
//        Есть 2 способа подсчёта счастливых билетов:
//        1. Московский — если tuickeна автобусном билете напечатано шестизначное число, и сумма первых
//        трёх цифр равна сумме последних трёх, то этот билет считается счастливым.
//        2. Ленинградский, или Питерский — если сумма чётных цифр билета равна сумме нечётных цифр
//        билета, то билет считается счастливым.
//        Задача:
//        Номер билета - шестизначное число. Нужно написать консольное приложение, которое может
//        посчитать количество счастливых билетов. Для выбора алгоритма подсчёта читается текстовый файл. Путь
//        к текстовому файлу задаётся в консоли после запуска программы. Индикаторы алгоритмов:
//        1 - слово 'Moskow'
//        2 - слово 'Piter'
//        После задания всех необходимых параметров, программа в консоль должна вывести количество
//        счастливых билетов для указанного способа подсчёта.

public class LuckyNumber {



    public static void main(String[] args) throws NoSuchMethodException {
        Console console = new Console();
        console.scan();
        NumberDigits numberDigits = new NumberDigits(console.getFirstNumber(), console.getSecondNumber());
        Lucky lucky = new Lucky(numberDigits.getNumberDigits(),numberDigits.getNumberOfTickets());

      //  lucky.chooseLuckyMethod(console.pickLuckyMethod());
    }


}



