import java.util.Scanner;

public class GuessNumberTest {
    private GuessNumber gameModule = new GuessNumber();
    private static boolean includedGame = false;

    private Scanner rematchInput = new Scanner(System.in);
    private void endTheGame(Scanner testScan) {
        do {
            System.out.println("Желаете продолжить игру? Ответы: yes/no!");
            String answer = testScan.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                includedGame = true;
                break;
            } else if (answer.equalsIgnoreCase("no")) {
                includedGame = false;
                break;
            } else {
                System.out.println("Поддерживаются только следующие варианты ответов - yes/no");
                continue;
            }
        } while (true);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        GuessNumber gameModule = new GuessNumber();
        GuessNumberTest userControl = new GuessNumberTest();
        System.out.println("Добро пожаловать\nОкно регистрации");
        System.out.print("Игрок номер 1: ");
        Player player1 = new Player(myScanner.nextLine());
        System.out.println();
        System.out.print("Игрок номер 2: ");
        Player player2 = new Player(myScanner.nextLine());
        //Подчистим сканнер перед вводом интов:
        myScanner.next();
        System.out.println("Начинаем!");
        do {
            includedGame = true;
            gameModule.gameProcess(player1, player2, myScanner);
            userControl.endTheGame(myScanner);
        } while (userControl.includedGame);
    }
}