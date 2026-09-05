package leapyear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapyearTest {

    private Leapyear leapyear;

    @BeforeEach
    void setUp() {
        leapyear = new Leapyear();
    }

    @ParameterizedTest(name = "should_return_{1}_for_leap_year_{0}")
    @CsvSource({
            "1996,true",
            "1995,false",
            "2000,true",
    })
    void should_return_for_not_leap_year(int year, boolean expected) {
        boolean result = leapyear.verify(year);
        assertEquals(expected, result);
    }
}
