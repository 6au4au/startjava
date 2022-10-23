import java.util.Scanner;

public class GuessNumberTest {
    private static String answer = "yes";

    public static void main(String[] args) {
        GuessNumberTest guessNumberTest = new GuessNumberTest();
        System.out.println("Добро пожаловать\nОкно регистрации");
        System.out.print("Игрок номер 1: ");
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.nextLine());
        System.out.print("\nИгрок номер 2: ");
        Player player2 = new Player(scanner.nextLine());
        System.out.println();
        GuessNumber guessNumber = new GuessNumber(player1, player2);

        do {
            if (answer.equals("yes")) {
                System.out.println("Начинаем!\nЧИСЛО СОЗДАНО УДАЧИ!");
                guessNumber.startGame(scanner);
                scanner.nextLine();
            } else {

                //Если цикл отработал, а ответ != YES.
                System.out.println("Ошибка: допустимые варианты ответов: YES/NO");
            }

            System.out.println("Желаете продолжить игру? Ответы: yes/no!");
        } while (guessNumberTest.isNext(scanner.nextLine()));
        System.out.println("Завершение!");
    }

    private boolean isNext(String answer) {
        if (answer.equalsIgnoreCase("no")) 
            return false;

        if (answer.equalsIgnoreCase("yes")) {
            this.answer = answer.trim().toLowerCase();
            return true;
        }

        answer = "WRONG ANSWER!";
        return true;
    }
}