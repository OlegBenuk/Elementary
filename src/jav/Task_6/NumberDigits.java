package jav.Task_6;

public class NumberDigits {
    private int firstNumber;
    private int secondNumber;
    private int numberOfTickets;

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public int[][] getNumberDigits() {
        return numberDigits;
    }

    private int[][] numberDigits;


    public NumberDigits(int firstNumber, int secondNumber) {

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        switchIfNeeds();
      //  fillZero();
        fillDigits();
    }


    private void switchIfNeeds() {
        if (firstNumber > secondNumber) {
            int temp;
            temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }
    }

  /*  private void fillZero() {
        numberOfTickets = secondNumber - firstNumber;
        numberDigits = new int[numberOfTickets+1][6];
        for (int i = 0; i < numberOfTickets; i++) {
            for (int j = 0; j < 6; j++) {
                numberDigits[i][j] = 0;
            }
        }
    }*/

    private void fillDigits() {
        int temp;
        for (int i = 0; i <= numberOfTickets; i++) {
            temp = i + firstNumber;
            for (int j = 5; j >= 0; j--) {
                numberDigits[i][j] = temp % 10;
                temp /= 10;
            }
        }
    }

}
