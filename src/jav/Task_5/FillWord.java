package jav.Task_5;


import java.util.Arrays;

public class FillWord {

    private StringBuilder appendingNumber = new StringBuilder();
    private String[][] zeroToNine = {{""}, {"один ", "одна "}, {"два ", "две "}, {"три "}, {"четыре "}, {"пять "}, {"шесть "}, {"семь "}, {"восемь "}, {"девять "}};
    private String[] tenToNineteen = {"десять ", "одиннадцать ", "двенадцать ", "тринадцать ", "четырнадцать ", "пятнадцать ", "шестнадцать ", "семнадцать ", "восемнадцать ", "девятнадцать "};
    private String[] twentyToNinety = {"", "", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "};
    private String[] oneHundredToNineHundred = {"", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "};
    private String[][] thousandsM = {{"", "", ""}, {"тысяча ", "тысячи ", "тысяч "}, {"миллион ", "миллиона ", "миллионов "}, {"миллиард ", "миллиарда ", "миллиардов "}, {"триллион ", "триллиона ", "триллионов "}, {"квадрильон ", "квадрильона ", "квадрильонов "}};






    public String sendRightDigit(String numberStr) {
        int numberLength = numberStr.length();
        int i = checkSign(numberStr.charAt(0));
        if (isZero(numberStr.charAt(i), numberLength - i)) {
            return appendingNumber.toString();
        }
        int[] numberIntArray = new int[numberLength];
        int thousands = (int) Math.ceil((double) numberLength / 3);

        for (; i < numberLength; i++) {
            numberIntArray[numberLength - i - 1] = numberStr.charAt(i) - 48; //48 - location of '1' in char sequence
        }
        int[] numberIntArrayWithZeros = Arrays.copyOf(numberIntArray, thousands * 3);
        for (int j = thousands * 3 - 1; j > -1; j -= 3) {
            insideThreeDigits(numberIntArrayWithZeros[j], numberIntArrayWithZeros[j - 1], numberIntArrayWithZeros[j - 2], thousands - 1);
            thousands--;
        }
        return appendingNumber.toString();
    }

    private int checkSign(char firstSymbol) {
        String minus = "минус ";
        if (firstSymbol == '-') {
            appendingNumber.append(minus);
            return 1;
        } else if (firstSymbol == '+') {
            return 1;
        }
        return 0;
    }

    private boolean isZero(char digitIsZero, int length) {
        String zero = "ноль";
        if (digitIsZero == '0' && length == 1) {
            appendingNumber.append(zero);
            return true;
        }
        return false;
    }

    private void insideThreeDigits(int hundreds, int tens, int digits, int thousands) {
        appendingNumber.append(hundreds(hundreds));
        if (tens != 1) {
            appendingNumber.append(twentyToNinety(tens));
            appendingNumber.append(onesAndThousands(digits, thousands));
        } else {
            appendingNumber.append(tenToNineteenAndThousands(digits, thousands));
        }
    }

    private String onesAndThousands(int ones, int thousands) {
        if (thousands == 1 && ones == 1) {
            return zeroToNine[ones][1] + thousandsM[thousands][0];
        } else if (thousands == 1 && ones == 2) {
            return zeroToNine[ones][1] + thousandsM[thousands][1];
        } else {
            String returns = zeroToNine[ones][0];
            switch (ones) {
                case 1:
                    return returns + thousandsM[thousands][0];
                case 2:
                case 3:
                case 4:
                    return returns + thousandsM[thousands][1];
                default:
                    return returns + thousandsM[thousands][2];
            }
        }
    }

    private String hundreds(int hundreds) {
        return oneHundredToNineHundred[hundreds];
    }

    private String twentyToNinety(int tens) {
        return twentyToNinety[tens];
    }

    private String tenToNineteenAndThousands(int ones, int thousands) {
        return tenToNineteen[ones].concat(thousandsM[thousands][2]);
    }
}
