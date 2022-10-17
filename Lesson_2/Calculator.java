import java.util.Scanner;

class Calculator {
    //оператор (+, -, *, /, ^, %)
    private int a, b;
    private char matOperation;
    private boolean counted = false;
    private String err1 = "ERR N1: Поддерживаются только целые положительные числа!";
    private String err2 = "ERR N2: Поддерживаются только эти математические операции: (+, -, *, /, ^, %)";
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setMatOperation(Scanner scanner) {
        do {
            matOperation = scanner.nextLine().trim().charAt(0);
            switch (matOperation) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                case '%':
                    break;
                default:
                    System.out.println(err2);
                    continue;
            }
            break;
        } while (true);
    }

    public char getMatOperation() {
        return matOperation;
    }

    public int getResult() {
        counted = true;
        switch (matOperation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '^':
                int result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                return result;
            case '%':
                return a % b;
        }
        return 0;
    }

    public boolean getCounted() {
        return counted;
    }

    public void resetCounted() {
        counted = false;
    }
}