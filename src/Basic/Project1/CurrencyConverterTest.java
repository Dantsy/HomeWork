package Basic.Project1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyConverterTest {
    @Test
    public void testConvertToTextRUBLES() {
        assertEquals("ноль рублей", CurrencyConverter.convertToText(0, CurrencyConverter.RUBLES));
        assertEquals("один рубль", CurrencyConverter.convertToText(1, CurrencyConverter.RUBLES));
        assertEquals("два рубля", CurrencyConverter.convertToText(2, CurrencyConverter.RUBLES));
        assertEquals("пять рублей", CurrencyConverter.convertToText(5, CurrencyConverter.RUBLES));
        assertEquals("одиннадцать рублей", CurrencyConverter.convertToText(11, CurrencyConverter.RUBLES));
        assertEquals("двенадцать рублей", CurrencyConverter.convertToText(12, CurrencyConverter.RUBLES));
        assertEquals("пятнадцать рублей", CurrencyConverter.convertToText(15, CurrencyConverter.RUBLES));
        assertEquals("двадцать рублей", CurrencyConverter.convertToText(20, CurrencyConverter.RUBLES));
        assertEquals("двадцать один рубль", CurrencyConverter.convertToText(21, CurrencyConverter.RUBLES));
        assertEquals("двадцать три рубля", CurrencyConverter.convertToText(23, CurrencyConverter.RUBLES));
        assertEquals("двадцать пять рублей", CurrencyConverter.convertToText(25, CurrencyConverter.RUBLES));
        assertEquals("тридцать рублей", CurrencyConverter.convertToText(30, CurrencyConverter.RUBLES));
        assertEquals("сто рублей", CurrencyConverter.convertToText(100, CurrencyConverter.RUBLES));
        assertEquals("сто один рубль", CurrencyConverter.convertToText(101, CurrencyConverter.RUBLES));
        assertEquals("сто два рубля", CurrencyConverter.convertToText(102, CurrencyConverter.RUBLES));
        assertEquals("сто пять рублей", CurrencyConverter.convertToText(105, CurrencyConverter.RUBLES));
        assertEquals("сто десять рублей", CurrencyConverter.convertToText(110, CurrencyConverter.RUBLES));
        assertEquals("сто одиннадцать рублей", CurrencyConverter.convertToText(111, CurrencyConverter.RUBLES));
        assertEquals("сто двенадцать рублей", CurrencyConverter.convertToText(112, CurrencyConverter.RUBLES));
        assertEquals("сто пятнадцать рублей", CurrencyConverter.convertToText(115, CurrencyConverter.RUBLES));
        assertEquals("сто двадцать рублей", CurrencyConverter.convertToText(120, CurrencyConverter.RUBLES));
        assertEquals("сто двадцать один рубль", CurrencyConverter.convertToText(121, CurrencyConverter.RUBLES));
        assertEquals("сто ддвадцать два рубля", CurrencyConverter.convertToText(122, CurrencyConverter.RUBLES));
        assertEquals("сто двадцать пять рублей", CurrencyConverter.convertToText(125, CurrencyConverter.RUBLES));
        assertEquals("сто тридцать рублей", CurrencyConverter.convertToText(130, CurrencyConverter.RUBLES));
    }
    // Тесты для различных валют если будет необходимость в их добавлении
    // На примере доллара
    @Test
    public void testConvertToTextDOLLARS() {
        assertEquals("двадцать один доллар", CurrencyConverter.convertToText(21, CurrencyConverter.DOLLARS));
        assertEquals("пятьдесят девять долларов", CurrencyConverter.convertToText(59, CurrencyConverter.DOLLARS));
        assertEquals("двести десять долларов", CurrencyConverter.convertToText(210, CurrencyConverter.DOLLARS));
    }
}
