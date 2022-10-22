import java.util.Scanner;

public class CalculatorTest {
    private static int nextOperand = 0;
    private static boolean didItWork = false;

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            if (!didItWork) {
                //обращаемся к static boolean и переключаем 
                didItWork = true;
                System.out.print("Введите первое число: ");
                enterNumber(scanner, calculator);
                System.out.print("\nУкажите знак математической операции: (+, -, *, /, ^, %): ");
                //очистка сканнера:
                scanner.nextLine();
                enterMatOperation(scanner, calculator);
                System.out.print("\nВведите второе число: ");
                enterNumber(scanner, calculator);
                System.out.print("\nРезультат: ");
                System.out.println(calculator.getA() + " " + calculator.getMatOperation() + " " + calculator.getB() + 
                        " = " + calculator.calculate());
                scanner.nextLine();
            }
            System.out.println("Желаете продолжить? YES / NO");
        } while (calculatorTest.switchOff(scanner.nextLine()));
        System.out.println("Выключение.");
    }

    private boolean switchOff(String answer) {
        switch (answer.trim().toLowerCase()) {
            case "yes":
                didItWork = false;
                return true;
            case "no":
                return false;
            default:
                System.out.println("Ошибка, допустимые варианты только YES или NO!");
                return true;
        }
    }

    private static void enterNumber(Scanner scanner, Calculator calculator) {
        int num = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (nextOperand == 0 && calculator.setA(num)) {
                    nextOperand++;
                    break;
                } else if (nextOperand == 1 && calculator.setB(num)) {
                    nextOperand--;
                    break;
                }
            }
            System.out.println("Ошибка: поддерживаются только целые положительные числа!");
        }
    }

    private static void enterMatOperation(Scanner scanner, Calculator calculator) {
        char matOperation;
        while (true) {
            matOperation = scanner.nextLine().trim().charAt(0);
            if (calculator.setMatOperation(matOperation)) {
                break;
            }
            System.out.println("Поддерживаются только эти математические операции: (+, -, *, /, ^, %)");
        }
    }
}