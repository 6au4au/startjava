import java.util.Scanner;

class Calculator {
    //оператор (+, -, *, /, ^, %)
    private int a, b, result;
    private char ch;
    private String choice;
    private boolean included;
    private Scanner sc = new Scanner(System.in);
    private String err1 = "ERR N1: Поддерживаются только целые положительные числа!";
    private String err2 = "ERR N2: Поддерживаются только эти математические операции: (+, -, *, /, ^, %)";
    private String err3 = "ERR N3: Поддерживается только ввод: YES или NO";

    public int getA() {
        return a;
    }

    public void setA() {
        System.out.print("\nВведите первое число: ");
        a = setDimens();
    }

    public int getB() {
        return b;
    }

    public void setB() {
        System.out.print("\nВведите второе число: "); 
        b = setDimens();
    }

    public void setCh() {
        do {
            System.out.print("\nУкажите знак математической операции: (+, -, *, /, ^, %): "); 
            ch = sc.next().trim().charAt(0);
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

    public char getCh(char ch) {
        return ch;
    }

    public int setDimens() {
        int numb;
        do {
            if (sc.hasNextInt()) {
                numb = sc.nextInt();
                if (numb > 0) {
                    break;
                } else {
                    System.out.println(err1);
                }
            } else {
                System.out.println(err1);
            }
        } while (true);
        return numb;
    }

    public void on() {
        included = true;
        System.out.println("Power ON");
        do {
            setA();
            setCh();
            setB();
            setResult();
            System.out.println(a + " " + ch + " " + b + " = " + result);
            off();
        } while (included);
    }

    public void off() {
        System.out.print("Желаете продолжить (YES/NO): ");
        while (true) {
            //120 строка очистка сканнера от Enter:
            sc.nextLine();
            choice = sc.nextLine().trim();
            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Power OFF.");
                included = false;
                sc.close();
                break;
            } else if (choice.equalsIgnoreCase("yes")) {
                break;
            } else {
                System.out.println(err3);
            }
        }
    }
}