package Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyConverterTest {
    @Test
    public void testConvertToWords() {
        String[] currency = {"рубль", "рубля", "рублей"};
        CurrencyConverter currencyConverter = new CurrencyConverter(currency);
        assertEquals("один рубль", currencyConverter.convertToWords(1));
        assertEquals("два рубля", currencyConverter.convertToWords(2));
        assertEquals("три рубля", currencyConverter.convertToWords(3));
        assertEquals("пять рублей", currencyConverter.convertToWords(5));
        assertEquals("одиннадцать рублей", currencyConverter.convertToWords(11));
        assertEquals("двенадцать рублей", currencyConverter.convertToWords(12));
        assertEquals("пятнадцать рублей", currencyConverter.convertToWords(15));
        assertEquals("двадцать рублей", currencyConverter.convertToWords(20));
        assertEquals("двадцать один рубль", currencyConverter.convertToWords(21));
        assertEquals("двадцать три рубля", currencyConverter.convertToWords(23));
        assertEquals("двадцать пять рублей", currencyConverter.convertToWords(25));
        assertEquals("тридцать рублей", currencyConverter.convertToWords(30));
        assertEquals("сто рублей", currencyConverter.convertToWords(100));
        assertEquals("сто один рубль", currencyConverter.convertToWords(101));
        assertEquals("сто два рубля", currencyConverter.convertToWords(102));
        assertEquals("сто пять рублей", currencyConverter.convertToWords(105));
        assertEquals("сто десять рублей", currencyConverter.convertToWords(110));
        assertEquals("сто одиннадцать рублей", currencyConverter.convertToWords(111));
        assertEquals("сто двенадцать рублей", currencyConverter.convertToWords(112));
        assertEquals("сто пятнадцать рублей", currencyConverter.convertToWords(115));
        assertEquals("сто двадцать рублей", currencyConverter.convertToWords(120));
        assertEquals("сто двадцать один рубль", currencyConverter.convertToWords(121));
        assertEquals("сто двадцать  два рубля", currencyConverter.convertToWords(122));
        assertEquals("сто двадцать пять рублей", currencyConverter.convertToWords(125));
        assertEquals("сто тридцать рублей", currencyConverter.convertToWords(130));
    }
}
