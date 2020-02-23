package test.Task_5;

import jav.Task_5.FillWord;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FillWordTest {

    FillWord fillWord;
    String numberInWords;
    String numberInDigits;

    public FillWordTest(String numberInDigits, String  numberInWords)  {
        this.numberInWords = numberInWords;
        this.numberInDigits = numberInDigits;
    }

    @Before
    public void init() {
        fillWord = new FillWord();
    }

    @After
    public void destroy() {
        fillWord = null;
    }

    @Test
    public void methodMustReturnSameNumberInWords(){
        assertEquals(numberInWords, fillWord.sendRightDigit(numberInDigits).trim());
    }


    @Parameterized.Parameters
    public static Collection checkDigit() {
        return Arrays.asList(new Object[][]{
                {"23565","двадцать три тысячи пятьсот шестьдесят пять"},
                {"1","один"},
                {"+4","четыре"},
                {"23", "двадцать три"},
                {"-13000","минус тринадцать тысяч"},
                {"0","ноль"}
        });
    }
}
