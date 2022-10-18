import java.util.Scanner;

class GuessNumber {
    private int inGameNumber;
    private boolean includedGame;

    // игровой процесс:
    public void startGame(Player player1, Player player2, Scanner youScanner) {
        generateNumber();
        int whoseMove = 0;
        do {
            whoseMove++;
            includedGame = true;
            Player player = whoseMove % 2 != 0 ? player1 : player2;
            System.out.println(player.getName() + ": Введите число!");
            if (youScanner.hasNextInt()) {
                player.setNumber(youScanner.nextInt());
                if (player.getNumber() <= 0 || player.getNumber() > 100) {
                    whoseMove--;
                    continue;
                }
            } else {
                System.out.println(player.getName() + " Поддерживаются только целые положительные числа 1 <-> 100");
                //Чистим сканнер!
                youScanner.next();
                whoseMove--;
                continue;
            }
            System.out.println(checkInGameNumber(player));
        } while (includedGame);
    }

    private void generateNumber() {
        inGameNumber = (int) (Math.random() * ((100 - 1) + 1));
    }

    private String checkInGameNumber(Player player) {
        if (player.getNumber() < inGameNumber) {
            return player.getName() + ": ваше число меньше!";
        } else if (player.getNumber() > inGameNumber) {
            return player.getName() + ": ваше число больше!";
            //выигрыш!
        } else {
            includedGame = false;
            return player.getName() + ": ВЫИГРАЛ И УГАДАЛ ВЕРНОЕ ЧИСЛО! = " + inGameNumber;
        }
    }
}