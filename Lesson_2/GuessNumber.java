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
        int whoseMove = 1;
        Player player;
        do {
            whoseMove++;
            player = (whoseMove % 2 != 0) ? player1 : player2;
            System.out.println(player.getName() + ": Введите число!");
            if (scanner.hasNextInt()) {
                player.setNumber(scanner.nextInt());
            } else if (!scanner.hasNextInt() || player.getNumber() <= 0 || player.getNumber() > 100) {
                System.out.println(player.getName() + " Поддерживаются только целые положительные числа 1 <-> 100");
                //Чистим сканнер!
                scanner.next();
                whoseMove--;
                continue;
            }
        } while (checkSecretNum(player));
    }

    private void generateNumber() {
        secretNum = (int) (Math.random() * ((100 - 1) + 1));
    }

    private boolean checkSecretNum(Player player) {
        if (player.getNumber() < secretNum) {
            System.out.println(player.getName() + ": ваше число меньше!");
        } else if (player.getNumber() > secretNum) {
            System.out.println(player.getName() + ": ваше число меньше!");
            //выигрыш!
        } else {
            System.out.println(": ВЫИГРАЛ И УГАДАЛ ВЕРНОЕ ЧИСЛО! = " + secretNum);
            return false;
        }
        return true;
    }
}