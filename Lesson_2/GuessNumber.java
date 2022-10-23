import java.util.Scanner;

class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // игровой процесс:
    public void startGame(Scanner scanner) {
        generateSecretNum();

        //переменная которая определяет какой игрок ходит по остатку от деления.
        int firstMove = 0;
        Player player;
        do {
            firstMove++;
            player = (firstMove % 2 != 0) ? player1 : player2;

            System.out.println(player.getName() + ": Введите число!");

            if (scanner.hasNextInt() && validatePlayerNum(player, scanner.nextInt())) {

                //отловил баг, тут нужна очистка сканнера:
                scanner.nextLine();
                continue;
            }

            //если введено не число, а символ, нужно очистить строку и обнулить ход, отобразить ошибку:
            firstMove--;
            System.out.println("Поддерживаются только целые положительные числа 1 <-> 100");
            scanner.nextLine();
        } while (checkSecretNum(player));
    }

    private void generateSecretNum() {
        secretNum = (int) (Math.random() * ((100 - 1) + 1));
    }

    private static boolean validatePlayerNum(Player player, int num) {
        if (!player.setNumber(num)) {
            return false;
        }

        return true;
    }

    private boolean checkSecretNum(Player player) {
        if (player.getNumber() == secretNum) {
            System.out.println(": ВЫИГРАЛ И УГАДАЛ ВЕРНОЕ ЧИСЛО! = " + secretNum);
            return false;
        } 

        //если число корректное то оно >0 и мы проверим его с сообщением, если не корректное, то:
        //player.getNumber() останется == 0 и сообщение проигнорируется, наприм. при вводе символа, а не int.
        if (player.getNumber() < secretNum && player.getNumber() > 0) {
            System.out.println(player.getName() + ": ваше число меньше!");
        } else if (player.getNumber() > secretNum && player.getNumber() > 0) {
            System.out.println(player.getName() + ": ваше число больше!");
        }

        return true;
    }
}