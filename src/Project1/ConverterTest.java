package Project1;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.Before;

public class ConverterTest {
    private Converter priceConverter;
    @Before
    public void setup() {
        priceConverter = new Converter();
    }
    @Test
    public void testConvertNumberToWords() {
        Assert.assertEquals("ноль", priceConverter.convertNumberToWords(0));
        Assert.assertEquals("один", priceConverter.convertNumberToWords(1));
        Assert.assertEquals("два", priceConverter.convertNumberToWords(2));
        Assert.assertEquals("пять", priceConverter.convertNumberToWords(5));
        Assert.assertEquals("десять", priceConverter.convertNumberToWords(10));
        Assert.assertEquals("двенадцать", priceConverter.convertNumberToWords(12));
        Assert.assertEquals("двадцать", priceConverter.convertNumberToWords(20));
        Assert.assertEquals("тридцать один", priceConverter.convertNumberToWords(31));
        Assert.assertEquals("сорок пять", priceConverter.convertNumberToWords(45));
        Assert.assertEquals("девяносто", priceConverter.convertNumberToWords(90));
        Assert.assertEquals("девяносто девять", priceConverter.convertNumberToWords(99));
    }

    @Test
    public void testGetRublesSuffix() {
        Assert.assertEquals("рублей", priceConverter.getRublesSuffix(0));
        Assert.assertEquals("рубль", priceConverter.getRublesSuffix(1));
        Assert.assertEquals("рубля", priceConverter.getRublesSuffix(2));
        Assert.assertEquals("рубля", priceConverter.getRublesSuffix(3));
        Assert.assertEquals("рубля", priceConverter.getRublesSuffix(4));
        Assert.assertEquals("рублей", priceConverter.getRublesSuffix(5));
        Assert.assertEquals("рублей", priceConverter.getRublesSuffix(10));
        Assert.assertEquals("рубль", priceConverter.getRublesSuffix(21));
        Assert.assertEquals("рублей", priceConverter.getRublesSuffix(55));
        Assert.assertEquals("рубль", priceConverter.getRublesSuffix(71));
        Assert.assertEquals("рубля", priceConverter.getRublesSuffix(82));
        Assert.assertEquals("рубля", priceConverter.getRublesSuffix(84));
    }
    @Test
    public void testConvertNumberToWordsWithInvalidNumber() {
        Assert.assertEquals("Число превышает максимальное значение", priceConverter.convertNumberToWords(101));
    }
    @Test
    public void testGetRublesSuffixWithInvalidNumber() {
        Assert.assertEquals("рублей", priceConverter.getRublesSuffix(110));
    }
}
