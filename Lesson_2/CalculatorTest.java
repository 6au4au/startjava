import java.util.Scanner;

public class CalculatorTest {
    private static boolean included = true;
    //ошибка которая связанна обработкой ответа о продолжении/завершении работы: 
    private String err3 = "ERR N3: Поддерживается только ввод: YES или NO";

    public void wantsToContinue(Scanner scanner, Calculator calculator) {
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("no")) {
            System.out.println("Power OFF.");
            included = false;
        } else if (choice.equalsIgnoreCase("yes")) {
            calculator.reset();
            included = true;
        } else {
            System.out.println(err3);
        }
    }

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            if (calculator.showResult() == 0) {
                System.out.print("Введите первое число: ");
                calculator.setA(scanner.nextInt());
                System.out.print("\nУкажите знак математической операции: (+, -, *, /, ^, %): ");
                //очистка сканнера:
                scanner.nextLine();
                calculator.setMatOperation(scanner);
                System.out.print("\nВведите второе число: ");
                calculator.setB(scanner.nextInt());
                System.out.println();
                System.out.print("Результат: ");
                System.out.println(calculator.getA() + " " + calculator.getMatOperation() + " " + calculator.getB() + 
                        " = " + calculator.showResult());
                //очистка сканнера:
                scanner.nextLine();
            } else {
                System.out.print("Желаете продолжить (YES/NO): ");
                calculatorTest.wantsToContinue(scanner, calculator);
            }
        } while (included);
    }
}