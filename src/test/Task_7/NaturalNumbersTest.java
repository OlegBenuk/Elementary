package test.Task_7;






import jav.Task_5.CheckBigInteger;
import jav.Task_7.NaturalNumbers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

    @RunWith(Parameterized.class)
    public class NaturalNumbersTest {
        String naturalNumberSeq;
        String enteredNumber;

        public NaturalNumbersTest(String enteredNumber, String naturalNumberSeq) {
            this.enteredNumber = enteredNumber;
            this.naturalNumberSeq = naturalNumberSeq;
        }

        @Parameterized.Parameters
        public static Collection checkDigits() {
            return Arrays.asList(new Object[][]{
                    {"0", ""},
                    {"1", ""},
                    {"2", "1"},
                    {"5", "1, 2"},
                    {"10", "1, 2, 3"},
                    {"25", "1, 2, 3, 4"},
                    {"100", "1, 2, 3, 4, 5, 6, 7, 8, 9"},
                    {"4.1", "1, 2"}
            });
        }

        private NaturalNumbers naturalNumbers;
        @Before
        public void init() {
            naturalNumbers = new NaturalNumbers();
        }

        @After
        public void destroy() {
            naturalNumbers = null;
        }

        @Test
        public void testArgIsBigInteger() {
            assertEquals(naturalNumberSeq, naturalNumbers.createNaturalNumberSeq(enteredNumber));
        }

    }


