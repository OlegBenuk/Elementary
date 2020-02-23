package test.Task_5;


import jav.Task_5.CheckBigInteger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CheckBigIntegerTest {
    String number;
    boolean isNumber;

    public CheckBigIntegerTest(String number, boolean isNumber) {
        this.isNumber = isNumber;
        this.number = number;
    }

    @Parameterized.Parameters
    public static Collection checkDigits() {
        return Arrays.asList(new Object[][]{
                {"23565", true},
                {"63462y", false},
                {"145623565365878653676535779787567874689", true},
                {"-", false},
                {"+4", true},
                {"-23", true},
                {"zero", false},
                {"0", true}

        });
    }


    private CheckBigInteger c;

    @Before
    public void init() {
        c = new CheckBigInteger();
    }

    @After
    public void destroy() {
        c = null;
    }

    @Test
    public void testArgIsBigInteger() {
        assertEquals(isNumber, c.checkDigits(number));

    }


}
