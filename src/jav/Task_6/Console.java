package jav.Task_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    private int firstNumber;
    private int secondNumber;
    private Scanner scanner = new Scanner(System.in);


    public void scan() {

        try {
            System.out.println("Enter first ticket number");
            firstNumber = scanner.nextInt();
            if (firstNumber < 1 || firstNumber > 999999) {
                System.out.println("Enter number from 1 to 999999");
                scan();
            }
            System.out.println("Enter second ticket number");
            secondNumber = scanner.nextInt();
            if (secondNumber < 1 || secondNumber > 999999) {
                System.out.println("Enter number from 1 to 999999");
                scan();
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter correct ticket number! It ranges from 1 to 999999");
            scan();
        }
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public String pickLuckyMethod() {
        System.out.println("Which lucky method you choose? \"Moscow\", \"Piter\" or \"PiterAdditional\"?");
        String method = scanner.next().toLowerCase();
       /* if (method == "moscow" || method == "m" || method == "piter" || method == "p" || method == "piteraddition" || method == "pa") {
            return method;
        } else {
            pickLuckyMethod();
        }**/
        return method;
    }
}


