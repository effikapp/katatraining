package romannumerals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @ParameterizedTest(name = "should_convert_{0}_to_roman_numerals")
    @CsvSource({
            "1,I",
            "2,II",
            "3,III",
            "4,IV",
            "5,V",
            "6,VI",
            "7,VII",
            "8,VIII",
            "9,IX",
            "10,X",
            "11,XI",
            "12,XII",
            "13,XIII",
            "14,XIV",
            "15,XV",
            "16,XVI",
            "17,XVII",
            "18,XVIII",
            "19,XIX",
    })
    void should_convert_to_roman_numerals(int number, String expected)  {

        //Arrange
        RomanNumerals romanNumerals = new RomanNumerals();

        //Act
        String roman = romanNumerals.convert(number);

        //Assert
        assertEquals(expected, roman);
    }
}
