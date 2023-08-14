package Project1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Converter {
    private static final Map<Integer, String> russianOnes;
    private static final Map<Integer, String> russianTens;

    static {
        russianOnes = new HashMap<>();
        russianOnes.put(0, "ноль");
        russianOnes.put(1, "один");
        russianOnes.put(2, "два");
        russianOnes.put(3, "три");
        russianOnes.put(4, "четыре");
        russianOnes.put(5, "пять");
        russianOnes.put(6, "шесть");
        russianOnes.put(7, "семь");
        russianOnes.put(8, "восемь");
        russianOnes.put(9, "девять");

        russianTens = new HashMap<>();
        russianTens.put(10, "десять");
        russianTens.put(11, "одиннадцать");
        russianTens.put(12, "двенадцать");
        russianTens.put(13, "тринадцать");
        russianTens.put(14, "четырнадцать");
        russianTens.put(15, "пятнадцать");
        russianTens.put(16, "шестнадцать");
        russianTens.put(17, "семнадцать");
        russianTens.put(18, "восемнадцать");
        russianTens.put(19, "девятнадцать");

        russianTens.put(20, "двадцать");
        russianTens.put(30, "тридцать");
        russianTens.put(40, "сорок");
        russianTens.put(50, "пятьдесят");
        russianTens.put(60, "шестьдесят");
        russianTens.put(70, "семьдесят");
        russianTens.put(80, "восемьдесят");
        russianTens.put(90, "девяносто");
        russianTens.put(100, "сто");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        String priceInWords = convertNumberToWords(number);
        String rublesSuffix = getRublesSuffix(number);
        System.out.println(priceInWords + " " + rublesSuffix);
    }

    public static String convertNumberToWords(int number) {
        if (number < 10) {
            return russianOnes.get(number);
        } else if (number < 20) {
            return russianTens.get(number);
        } else if (number < 100) {
            int tens = number / 10 * 10;
            int ones = number % 10;
            if (ones == 0) {
                return russianTens.get(tens);
            } else {
                return russianTens.get(tens) + " " + russianOnes.get(ones);
            }
        } else {
            return "Число превышает максимальное значение";
        }
    }

    public static String getRublesSuffix(int number) {
        int lastDigit = number % 10;
        int penultimateDigit = (number / 10) % 10;

        if (penultimateDigit == 1) {
            return "рублей";
        } else {
            if (lastDigit == 1) {
                return "рубль";
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                return "рубля";
            } else {
                return "рублей";
            }
        }
    }
}
