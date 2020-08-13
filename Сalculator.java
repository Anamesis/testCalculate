public class Сalculator {

    public static double calculator(int x, String op, int y) {

        if (x > 10 || x < 1 || y > 10 || y < 1) {
            throw new NullPointerException("Invalid input");
        }

        double num = 0;
        switch (op) {
            case "+":
                num = x + y;
                break;
            case "-":
                num = x - y;
                break;
            case "/":
                num = x / y;
                break;
            case "*":
                num = x * y;
                break;
            default:
                num = -300;
        }
        return num;
    }
}
