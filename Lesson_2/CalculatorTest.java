import java.util.Scanner;

public class CalculatorTest {
    //Чтобы уменьшить количество вызываемых методов из класса Calculator эта переменная отвечает за проверку
    //цикла программы, если она отработает то пока мы не сделаем её false - мы будем считывать ввод.
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
                calculator.setA(calculatorTest.validateNumber(scanner));
                System.out.print("\nУкажите знак математической операции: (+, -, *, /, ^, %): ");
                //очистка сканнера:
                scanner.nextLine();
                calculator.setMatOperation(calculatorTest.validateMatOperation(scanner));
                System.out.print("\nВведите второе число: ");
                calculator.setB(calculatorTest.validateNumber(scanner));
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

    private int validateNumber(Scanner scanner) {
        int result;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Недопустимый формат ввода, поддерживаются только целые положительные числа!");
                scanner.next();
                continue;
            }
            result = scanner.nextInt();
            if (result == 0) {
                System.out.println("Операции с 0 бессмысленны!");
                continue;
            }
            break;
        }
        return result;
    }

    private char validateMatOperation(Scanner scanner) {
        while (true) {
            char matOperation = scanner.nextLine().trim().charAt(0);
            switch (matOperation) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                case '%':
                    return matOperation;
                default:
                    System.out.println("Поддерживаются только эти математические операции: (+, -, *, /, ^, %)");
            }
        }
    }
}