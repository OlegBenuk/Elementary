package jav.Task_5;

import java.math.BigInteger;
import java.util.regex.Pattern;

public class CheckBigInteger {


    public static boolean checkDigits(String arg) {
        if (Pattern.matches("[-+]?\\d+", arg)) {
            return true;
        } else {
            return false;
        }
    }
}
