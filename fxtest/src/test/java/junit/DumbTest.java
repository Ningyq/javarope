package junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@RunWith(JUnitPlatform.class)
public class DumbTest {
    private static Dumb dumb;

    @BeforeAll
    static void init() {
        dumb = new Dumb();
    }

    @Test
    void shouldGetSumForNumbers() {
        assertTrue(dumb.getSum(1, 2, 3) == 6, () -> "getSum should return correct calculation");
    }

    @Test
    void shouldGetNumbers() {
        int[] numbers = dumb.getNumbers();
        assertAll("numbers",
                () -> assertEquals(numbers[0], 0),
                () -> assertEquals(numbers[1], 1),
                () -> assertEquals(numbers[2], 2),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 4)
        );
    }

    @Test
    void shouldOnePlusOneEqualsFour() {
        assertEquals(dumb.specialAdd(1, 1), 4);
    }

    @Test
    void shouldTrueAssumption() {
        assumeTrue(true);
        assertEquals(5 + 2, 7);
    }

    @Test
    void shouldAssumptionThatOne() {
        String someString = "Just a string".concat("!");
        assumingThat(
                someString.equals("Just a string"),
                () -> assertEquals(2 + 2, 2)
        );
    }
}
