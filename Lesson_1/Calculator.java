public class Calculator {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator Prototype");
        //операнды
        int a = 3, b = 3;
        //оператор (+, -, *, /, ^, %)
        char sign = '^';
        //результат
        int result = 0;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= b;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Поддерживаются только следующее символы: " + "+; -; *; /; ^; %");
        }
        
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else {
            System.out.println("sign expn");
        }
    }
}