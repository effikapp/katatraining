package leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Leapyear2Test {

    @Test
    void should_return_true_when_year_is_divisible_by_4() {
        Leapyear2 leapyear2 = new Leapyear2();

        boolean isLeapYear = leapyear2.isLeapYear(1996);

        assertTrue(isLeapYear);
    }

    @Test
    void should_return_false_when_year_is_not_divisible_by_4() {
        Leapyear2 leapyear2 = new Leapyear2();

        boolean isLeapYear = leapyear2.isLeapYear(1997);

        assertFalse(isLeapYear);
    }

    @Test
    void should_return_false_when_year_is_divisible_by_4_and_divisible_by_100() {
        Leapyear2 leapyear2 = new Leapyear2();

        boolean isLeapYear = leapyear2.isLeapYear(1900);

        assertFalse(isLeapYear);
    }

    @Test
    void should_return_true_when_year_is_divisible_by_4_and_divisible_by_100_and_divisible_by_400() {
        Leapyear2 leapyear2 = new Leapyear2();

        boolean isLeapYear = leapyear2.isLeapYear(2000);

        assertTrue(isLeapYear);
    }
}
