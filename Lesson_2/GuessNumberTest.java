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
        GuessNumber game = new GuessNumber(player1, player2);

        do {
            if (answer.equals("yes")) {
                answer = "no answer";
                game.start(scanner);
            }

            System.out.println("Желаете продолжить игру? Ответы: yes/no!");
            answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes")) {
                answer = "no answer";
                System.out.println("Ошибка: допустимые варианты ответов: YES/NO");
            }
            
        } while (!answer.equalsIgnoreCase("no"));
        
        System.out.println("Завершение!");
    }
}