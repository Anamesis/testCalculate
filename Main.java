import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        String temp = scanner.nextLine();

        String x = temp.split(" ")[0];
        String op = temp.split(" ")[1];
        String y = temp.split(" ")[2];


        if (TranslateNum.checkNum(x) && TranslateNum.checkNum(y)) {
            double finalNum = Сalculator.calculator(Integer.parseInt(x), op, Integer.parseInt(y));

            if(finalNum == -300) {
                throw  new NullPointerException("Invalid input");
            }

            System.out.println(finalNum);
        } else if (!TranslateNum.checkNum(x) && !TranslateNum.checkNum(y)) {
            int xInt = TranslateNum.romanToArabic(x);
            int yInt = TranslateNum.romanToArabic(y);

            double finalNum = Сalculator.calculator(xInt, op, yInt);

            if(finalNum == -300) {
                throw  new NullPointerException("Invalid input");
            }

            String num = TranslateNum.arabicToRoman((int) finalNum);

            System.out.println(num);
        } else {
            //error
            throw  new NullPointerException("Invalid input");
        }
    }
}
