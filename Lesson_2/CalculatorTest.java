import java.util.Scanner;

public class CalculatorTest {
    //ошибка которая связанна обработкой ответа о продолжении/завершении работы: 
    private static String err3 = "ERR N3: Поддерживается только ввод: YES или NO";
    private String included = "yes";
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        do {
            if (counter == 0) {
                counter++;
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
                //очистка сканнера:
                scanner.nextLine();
            } else {
                boolean answer = calculatorTest.wantToContinue(scanner, calculator);
                if (answer == false) {
                    break;
                } else if (answer == true && calculatorTest.included.equalsIgnoreCase("yes")) {
                    counter--;
                } else {
                    System.out.println(err3); 
                }
            }
        } while (counter <= 1);
    }

    private boolean wantToContinue(Scanner scanner, Calculator calculator) {
        System.out.print("Желаете продолжить (YES/NO): ");
        included = scanner.nextLine();
        if (included.equalsIgnoreCase("no")) {
            System.out.println("Power OFF.");
            return false;
        }
        return true;
    }
}