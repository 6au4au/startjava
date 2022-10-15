import java.util.Scanner;
/* GuessNumber(Отвечает за игровой процесс):
    Игровой процесс?:
1. Генерация числа.
2. Хранение сгенерированного числа.
3. Проверки входящих чисел из класса Player.
4. Подсказки после проверки.
5. Контроль хода игрока!*/
class GuessNumber {
    private int inGameNumber = 2234;
    private boolean includedGame;
    
    public void gameProcess(Player player1, Player player2, Scanner youScanner) {
        do {
            includedGame = true;
            player1.setNumber(youScanner.nextInt());
            System.out.println(checkInGameNumber(player1));
            player2.setNumber(youScanner.nextInt());
            System.out.println(checkInGameNumber(player2));
        } while (includedGame);
    }

    public String checkInGameNumber(Player player) {
        if (player.getNumber() < inGameNumber) {
            return player + ": ваше число меньше!";
        } else if (player.getNumber() > inGameNumber) {
            return player + ": ваше число больше!";
        } else {
            includedGame = false;
            return player + ": ВЫИГРАЛ И УГАДАЛ ВЕРНОЕ ЧИСЛО! = " + inGameNumber;
        }
    }
    //(int) Math.random() * ++max;
}