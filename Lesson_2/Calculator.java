class Calculator {
    //оператор (+, -, *, /, ^, %)
    private int a, b;
    private char matOperation;
    
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

    public void setMatOperation(char matOperation) {
        this.matOperation = matOperation;
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