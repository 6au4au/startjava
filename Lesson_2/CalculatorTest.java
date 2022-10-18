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
                calculator.setA(scanner);
                System.out.print("\nУкажите знак математической операции: (+, -, *, /, ^, %): ");
                //очистка сканнера:
                scanner.nextLine();
                calculator.setMatOperation(scanner);
                System.out.print("\nВведите второе число: ");
                calculator.setB(scanner);
                System.out.print("\nРезультат: ");
                System.out.println(calculator.getA() + " " + calculator.getMatOperation() + " " + calculator.getB() + 
                        " = " + calculator.getResult());
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
}