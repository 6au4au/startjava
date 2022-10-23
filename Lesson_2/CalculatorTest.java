import java.util.Scanner;

public class CalculatorTest {
    private static int nextOperand = 0;

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Result: " + enterNumber(scanner, calculator) + " "
                    + enterMathOperation(scanner, calculator) + " " + enterNumber(scanner, calculator)
                    + " = " + calculator.calculate());
            scanner.nextLine();
            System.out.println("Желаете продолжить? YES / NO");
        } while (calculatorTest.switchOff(scanner));
        System.out.println("Выключение.");
    }

    private boolean switchOff(Scanner scanner) {
        while (true) {
         switch (scanner.nextLine().trim().toLowerCase()) {
                case "yes":
                    return true;
                case "no":
                    return false;
                default:
                    System.out.println("Ошибка: допустимые варианты только YES или NO!");
            }
        }
    }

    private static int enterNumber(Scanner scanner, Calculator calculator) {
        int num = -1;

        String message = (nextOperand < 1) ? "\nВведите первое число" : "\nВведите второе число";
        while (true) {
            System.out.println(message);

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: вы вводите не число!");
                scanner.nextLine();
                continue;
            }

            num = scanner.nextInt();

            if (nextOperand == 0 && calculator.setA(num)) {
                nextOperand++;
                break;
            } else if (nextOperand == 1 && calculator.setB(num)) {
                nextOperand--;
                break;
            }
            System.out.println("Ошибка: поддерживаются только целые положительные числа!");
            scanner.nextLine();
        }
        return num;
    }

    private static char enterMathOperation(Scanner scanner, Calculator calculator) {
        char mathOperation;

        scanner.nextLine();
        while (true) {
            System.out.print("\nУкажите знак математической операции: (+, -, *, /, ^, %): ");
            mathOperation = scanner.nextLine().trim().charAt(0);

            if (calculator.setMathOperation(mathOperation))
                break;

            System.out.println("Поддерживаются только эти математические операции: (+, -, *, /, ^, %)");
        }
        return mathOperation;
    }
}