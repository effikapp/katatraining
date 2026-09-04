package romannumerals;

import java.util.List;

public class RomanNumerals {
    private record RomanNumeral(int value, String romanNumeral) {}

    private static final List<RomanNumeral> romanNumerals = List.of(
        new RomanNumeral(1000, "M"),
        new RomanNumeral(900, "CM"),
        new RomanNumeral(500, "D"),
        new RomanNumeral(400, "CD"),
        new RomanNumeral(100, "C"),
        new RomanNumeral(90, "XC"),
        new RomanNumeral(50, "L"),
        new RomanNumeral(40, "XL"),
        new RomanNumeral(10, "X"),
        new RomanNumeral(9, "IX"),
        new RomanNumeral(5, "V"),
        new RomanNumeral(4, "IV"),
        new RomanNumeral(1, "I")
    );

     String convert(int number) {

        StringBuilder romanNumeral = new StringBuilder();
        int reste = number;

        for(RomanNumeral romanNumeralRecord : romanNumerals) {
            while(reste >= romanNumeralRecord.value) {
                romanNumeral.append(romanNumeralRecord.romanNumeral);
                reste -= romanNumeralRecord.value;
            }
        }

        return romanNumeral.toString();
    }
}
