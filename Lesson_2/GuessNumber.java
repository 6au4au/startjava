import java.util.Scanner;

class GuessNumber {
    private int secretNum;
    Player player1;
    Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // игровой процесс:
    public void startGame(Scanner scanner) {
        generateNumber();
        int whoseMove = 0;
        Player player;
        do {
            whoseMove++;
            player = (whoseMove % 2 != 0) ? player1 : player2;
            System.out.println(player.getName() + ": Введите число!");
            if (scanner.hasNextInt() && validatePlayerNum(player, scanner.nextInt())) {
                continue;
            } else {
                //Чистим сканнер!
                whoseMove--;
                System.out.println("Поддерживаются только целые положительные числа 1 <-> 100");
            }
        } while (checkSecretNum(player));
    }

    private void generateNumber() {
        secretNum = (int) (Math.random() * ((100 - 1) + 1));
    }

    private static boolean validatePlayerNum(Player player, int num) {
        if (!player.setNumber(num)) {
            System.out.println("Поддерживаются только целые положительные числа 1 <-> 100");
            return false;
        }
        return true;
    }

    private boolean checkSecretNum(Player player) {
        if (player.getNumber() < secretNum) {
            System.out.println(player.getName() + ": ваше число меньше!");
        } else if (player.getNumber() > secretNum) {
            System.out.println(player.getName() + ": ваше число больше!");
            //выигрыш!
        } else {
            System.out.println(": ВЫИГРАЛ И УГАДАЛ ВЕРНОЕ ЧИСЛО! = " + secretNum);
            return false;
        }
        return true;
    }
}