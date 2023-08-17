package Project1;

import java.util.Scanner;

public class CurrencyConverter {

    private static final String[] NUMBERS = {
            "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
            "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
            "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
    };
    private static final String[] TENS = {
            "", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
            "семьдесят", "восемьдесят", "девяносто"
    };
    private static final String[] HUNDREDS = {
            "", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
            "семьсот", "восемьсот", "девятьсот"
    };

    public static final String[] RUBLES = {"рубль", "рубля", "рублей"};
    //Добавление доллара если будет нужно
    public static final String[] DOLLARS = {"доллар", "доллара", "долларов"};


    public static String convertToText(int number, String[] currency) {
        if (number == 0) {
            return "ноль " + currency[2];
        }
        return convert(number) + " " + currency[getCurrencyIndex(number)];
    }

    private static int getCurrencyIndex(int number) {
        number = Math.abs(number);
        number %= 100;
        if (number >= 11 && number <= 19) {
            return 2;
        }
        number %= 10;
        if (number == 1) {
            return 0;
        }
        if (number >= 2 && number <= 4) {
            return 1;
        }
        return 2;
    }

    private static String convert(int number) {
        if (number < 20) {
            return NUMBERS[number];
        }
        if (number < 100) {
            return TENS[number / 10] + " " + convert(number % 10);
        }
        return HUNDREDS[number / 100] + " " + convert(number % 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(convertToText(number, RUBLES));
        scanner.close();
    }
}
