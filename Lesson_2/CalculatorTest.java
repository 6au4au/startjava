import java.util.Scanner;

public class CalculatorTest {
    private static boolean included = true;
    private static boolean questionWindowsOperation = false;
    //ошибка которая связанна обработкой ответа о продолжении/завершении работы: 
    private String err3 = "ERR N3: Поддерживается только ввод: YES или NO";

    public void userWantsToContinue(String choice) {
        if (choice.equalsIgnoreCase("no")) {
            System.out.println("Power OFF.");
            questionWindowsOperation = true;
            included = false;
        } else if (choice.equalsIgnoreCase("yes")) {
            questionWindowsOperation = true;
        } else {
            System.out.println(err3);
        }
    }

    public static void main(String[] args) {
        CalculatorTest userModule = new CalculatorTest();
        Calculator calculate = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            questionWindowsOperation = false;
            System.out.print("Введите первое число: ");
            calculate.setA(scanner.nextInt());
            System.out.print("\nУкажите знак математической операции: (+, -, *, /, ^, %): ");
            scanner.nextLine();
            calculate.setCh(scanner.nextLine());
            System.out.print("\nВведите второе число: ");
            calculate.setB(scanner.nextInt());
            System.out.println();
            System.out.print("Результат: ");
            calculate.setResult();
            System.out.println(calculate.getA() + " " + calculate.getCh() + " " + calculate.getB() + " = " + calculate.getResult());
            //Очистка сканнера перед формой:
            scanner.nextLine();
            do {
                System.out.print("Желаете продолжить (YES/NO): ");
                String choice = scanner.nextLine().trim();
                userModule.userWantsToContinue(choice);
            } while (!questionWindowsOperation);
        } while (included);
    }
}