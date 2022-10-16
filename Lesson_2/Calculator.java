class Calculator {
    //оператор (+, -, *, /, ^, %)
    private int a, b, result;
    private char ch;
    private String err1 = "ERR N1: Поддерживаются только целые положительные числа!";
    private String err2 = "ERR N2: Поддерживаются только эти математические операции: (+, -, *, /, ^, %)";
    public int getA() {
        return a;
    }

    public void setA(int youVariables) {
        a = youVariables;
    }

    public int getB() {
        return b;
    }

    public void setB(int youVariables) {
        b = youVariables;
    }

    public void setCh(String youChar) {
        do {
            ch = youChar.trim().charAt(0);
            switch (ch) {
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

    public void setResult() {
        switch (ch) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                break;
            case '%':
                result = a % b;
                break;
        }
    }

    public int getResult() {
        return result;
    }

    public char getCh() {
        return ch;
    }
}