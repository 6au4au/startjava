class Calculator {
    //оператор (+, -, *, /, ^, %)
    private int a, b;
    private char mathOperation;

    public boolean setA(int a) {
        if (a < 1) return false;
        this.a = a;
        return true;
    }

    public boolean setB(int b) {
        if (a < 1) return false;
       this.b = b;
       return true;
    }

    private boolean validateMathOperation(char mathOperation) {
            switch (mathOperation) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                case '%':
                    return true;
                default:
                    return false;
            }
    }    

    public boolean setMathOperation(char mathOperation) {
        if (!validateMathOperation(mathOperation)) return false;
        this.mathOperation = mathOperation;
        return true;
    }

    public int calculate() {
        switch (mathOperation) {
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
}