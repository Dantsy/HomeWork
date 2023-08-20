package Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private Map<Integer, String> numberMap;
    private Map<Integer, String> tensMap;
    private Map<Integer, String> hundredsMap;
    private String[] currency;

    public CurrencyConverter(String[] currency) {
        this.currency = currency;
        numberMap = new HashMap<>();
        tensMap = new HashMap<>();
        hundredsMap = new HashMap<>();
        initializeMaps();
    }

    private void initializeMaps() {
        // Инициализация Map для преобразования чисел в слова
        numberMap.put(0, "ноль");
        numberMap.put(1, "один");
        numberMap.put(2, "два");
        numberMap.put(3, "три");
        numberMap.put(4, "четыре");
        numberMap.put(5, "пять");
        numberMap.put(6, "шесть");
        numberMap.put(7, "семь");
        numberMap.put(8, "восемь");
        numberMap.put(9, "девять");
        numberMap.put(10, "десять");
        numberMap.put(11, "одиннадцать");
        numberMap.put(12, "двенадцать");
        numberMap.put(13, "тринадцать");
        numberMap.put(14, "четырнадцать");
        numberMap.put(15, "пятнадцать");
        numberMap.put(16, "шестнадцать");
        numberMap.put(17, "семнадцать");
        numberMap.put(18, "восемнадцать");
        numberMap.put(19, "девятнадцать");

        tensMap.put(2, "двадцать");
        tensMap.put(3, "тридцать");
        tensMap.put(4, "сорок");
        tensMap.put(5, "пятьдесят");
        tensMap.put(6, "шестьдесят");
        tensMap.put(7, "семьдесят");
        tensMap.put(8, "восемьдесят");
        tensMap.put(9, "девяносто");

        hundredsMap.put(1, "сто");
        hundredsMap.put(2, "двести");
        hundredsMap.put(3, "триста");
        hundredsMap.put(4, "четыреста");
        hundredsMap.put(5, "пятьсот");
        hundredsMap.put(6, "шестьсот");
        hundredsMap.put(7, "семьсот");
        hundredsMap.put(8, "восемьсот");
        hundredsMap.put(9, "девятьсот");
    }

    public String convertToWords(int number) {
        if (number == 0) {
            return numberMap.get(0) + " " + currency[2];
        }

        StringBuilder result = new StringBuilder();

        int hundreds = number / 100;
        if (hundreds > 0) {
            result.append(hundredsMap.get(hundreds)).append(" ");
        }

        int tens = (number % 100) / 10;
        int units = number % 10;

        if (tens == 1) {
            result.append(numberMap.get(tens * 10 + units)).append(" ");
        } else {
            if (tens > 1) {
                result.append(tensMap.get(tens)).append(" ");
            }
            if (units > 0) {
                result.append(numberMap.get(units)).append(" ");
            }
        }

        result.append(getCurrency(number)).append(" ");

        return result.toString().trim();
    }

    private String getCurrency(int number) {
        int lastDigit = number % 10;
        int lastTwoDigits = number % 100;
        if (lastTwoDigits >= 10 && lastTwoDigits <= 20) {
            return currency[2];
        } else if (lastDigit == 1) {
            return currency[0];
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return currency[1];
        } else {
            return currency[2];
        }
    }

    public static void main(String[] args) {
        String[] currency = {"рубль", "рубля", "рублей"};
        CurrencyConverter converter = new CurrencyConverter(currency);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(converter.convertToWords(number));
    }
}