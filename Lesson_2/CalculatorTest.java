import java.util.Scanner;

public class CalculatorTest {
    //ошибка которая связанна обработкой ответа о продолжении/завершении работы: 
    private String err3 = "ERR N3: Поддерживается только ввод: YES или NO";
    private String answer = "yes";

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            if (!calculator.getCounted()) {
                System.out.print("Введите первое число: ");
                calculator.setA(scanner.nextInt());
                System.out.print("\nУкажите знак математической операции: (+, -, *, /, ^, %): ");
                //очистка сканнера:
                scanner.nextLine();
                calculator.setMatOperation(scanner);
                System.out.print("\nВведите второе число: ");
                calculator.setB(scanner.nextInt());
                System.out.print("\nРезультат: ");
                System.out.println(calculator.getA() + " " + calculator.getMatOperation() + " " + calculator.getB() + 
                        " = " + calculator.getResult());
                scanner.nextLine();
            } else if (!calculatorTest.switchOff(scanner, calculator)) {
                break;
            }
        } while (true);
    }

    private boolean switchOff(Scanner scanner, Calculator calculator) {
        System.out.print("Желаете продолжить (YES/NO): ");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            calculator.resetCounted();
            return true;
        } else if (answer.equalsIgnoreCase("no")) {
            return false;
        } else {
            System.out.println(err3);
            return true;
        }
    }
}