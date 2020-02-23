package jav.Task_7;

import java.math.BigInteger;

public class NaturalNumbers {
    private StringBuilder sb = new StringBuilder();
    PrintConsole printConsole = new PrintConsole();

    public String createNaturalNumberSeq(String arg) {
        double enteredNumber = Double.parseDouble(arg);
        int maxOutputNumber = calcArgsSqrt(enteredNumber);
        for (int i = 1; i < maxOutputNumber; i++) {
            sb.append(i).append(", ");
            if (i % 30 == 0) {
                sb.append("\n");
            }
        }

        if (sb.length() > 2) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }


    private int calcArgsSqrt(double arg) {
        return (int) Math.ceil(Math.sqrt(arg));
    }
}
