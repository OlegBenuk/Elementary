package jav.Task_6;

public class Lucky {

    private int[][] numberDigits;
    private int numberOfTickets;
    private int count = 0;
    private int sumFirst;
    private int sumSecond;
    Print print = new Print();

    Lucky(int[][] numberDigits, int numberOfTickets) {
        this.numberDigits = numberDigits;
        this.numberOfTickets = numberOfTickets;
        lucky();
    }

   /* public void chooseLuckyMethod(String method) {
        switch (method) {
            case "piter":
            case "p":
                luckyPiter();
                break;
            case "moscow":
            case "m":
                luckyMoscow();
                break;
            case "piteradditional":
            case "pa":
                luckyPiterAdditional();
                break;


        }
    }*/

    private void checkLucky(int i) {
        if (sumFirst == sumSecond) {
            count++;
            for (int j = 0; j < 6; j++) {
                System.out.print(numberDigits[i][j]);
            }
            System.out.println();
        }
    }

    private void zeroSums() {
        sumFirst = 0;
        sumSecond = 0;
    }

    private void calcMoscow(int i, int j) {
        zeroSums();
        sumFirst += numberDigits[i][j];
        sumSecond += numberDigits[i][j + 3];
    }

    private void piter(int i, int j) {
        zeroSums();
        sumFirst += numberDigits[i][j * 2];
        sumSecond += numberDigits[i][j * 2 + 1];
    }

    private void piterAdd(int i, int j) {
        zeroSums();
        if ((numberDigits[i][j] & 1) == 0) {
            sumFirst += numberDigits[i][j];
        } else {
            sumSecond += numberDigits[i][j];
        }
    }

    private void lucky() {
        count = 0;
        for (int i = 0; i < numberOfTickets; i++) {
            for (int j = 0; j < 3; j++) {
                calcMoscow(i, j);
                piter(i, j);
                piterAdd(i, j);
                piterAdd(i, j + 3);
            }
            checkLucky(i);
        }
        System.out.println("In this range " + count + " Moscow lucky numbers");
    }


}