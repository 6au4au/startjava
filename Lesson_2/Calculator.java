class Calculator {
    //оператор (+, -, *, /, ^, %)
    private int a, b;
    private char matOperation;
    
    public int getA() {
        return a;
    }

    public boolean setA(int a) {
        if (a < 1) { return false; }
        this.a = a;
        return true;
    }

    public int getB() {
        return b;
    }

    public boolean setB(int b) {
        if (a < 1) { return false; }
       this.b = b;
       return true;
    }

    private boolean validateMatOperation(char matOperation) {
        while (true) {
            switch (matOperation) {
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
    }    

    public boolean setMatOperation(char matOperation) {
        if (!validateMatOperation(matOperation)) { return false; }
        this.matOperation = matOperation;
        return true;
    }

    public char getMatOperation() {
        return matOperation;
    }

    public int calculate() {
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
}