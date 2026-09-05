package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {

    private Fizzbuzz fizzbuzz;

    @BeforeEach
    void setUp() {
        fizzbuzz = new Fizzbuzz();
    }

    @ParameterizedTest(name = "should_convert_{0}_to_string")
    @CsvSource({
            "1,1",
            "2,2"
    })
    void should_convert_to_string(int number, String expected) {
        String result = fizzbuzz.convert(number);
        assertEquals(expected, result);
    }

    @Test
    void should_number_multiple_three() {
        String result = fizzbuzz.convert(3);
        assertEquals("Fizz", result);
    }

    @Test
    void should_number_multiple_five() {
        String result = fizzbuzz.convert(5);
        assertEquals("Buzz", result);
    }

    @Test
    void should_number_multiple_three_and_five() {
        String result = fizzbuzz.convert(15);
        assertEquals("FizzBuzz", result);
    }

}
