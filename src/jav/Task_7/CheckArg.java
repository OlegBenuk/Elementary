package jav.Task_7;

import java.math.BigInteger;
import java.util.regex.Pattern;

public class CheckArg {


    public static boolean checkDigits(String arg) {
        if (Pattern.matches("\\d+.\\d+", arg)&&  arg.length()<19) {
            return true;
        } else {
            return false;
        }
    }
}
