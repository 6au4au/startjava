import java.util.Scanner;

public class GuessNumberTest {
    private static boolean isNext = true;

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        GuessNumberTest guessNumberTest = new GuessNumberTest();
        System.out.println("Добро пожаловать\nОкно регистрации");
        System.out.print("Игрок номер 1: ");
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.nextLine());
        System.out.println();
        System.out.print("Игрок номер 2: ");
        Player player2 = new Player(scanner.nextLine());
        System.out.println();
        do {
            if (isNext) {
                System.out.println("Начинаем!\nЧИСЛО СОЗДАНО УДАЧИ!");
                isNext = false;
                guessNumber.startGame(player1, player2, scanner);
                scanner.nextLine();
            }
            System.out.println("Желаете продолжить игру? Ответы: yes/no!");
        } while (guessNumberTest.wantMore(scanner.nextLine()));
        System.out.println("Завершение!");
    }

    private boolean wantMore(String answer) {
        switch (answer.trim().toLowerCase()) {
            case "yes":
                isNext = true;
                return true;
            case "no":
                isNext = false;
                return false;
            default:
                System.out.println("Допустимые варианты ответов: YES/NO");
                return true; 
        }
    }
}