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
    public void start(Scanner scanner) {
        generateSecretNum();
        System.out.println("Генерация...\nЧИСЛО СОЗДАНО! УДАЧИ!");
        
        //кладём сюда первого игрока, в цикле будем переключать.
        Player activePlayer = player1;
        while (!checkWinnings(activePlayer)) {
            System.out.println("\n" + activePlayer.getName() + ": Введите число!");

            if (scanner.hasNextInt() && inputNumber(activePlayer, scanner.nextInt())) {

                //если число не угадано переключаем игроков (если оно угадано и мы переключим игроков, то -
                // - в начале цикла у нас будет новый player и мы не проверим выигрыш старого!
                if(!compareIntroducedNumber(activePlayer))
                    activePlayer = (activePlayer == player1) ? player2 : player1;

                //отловил баг, тут нужна очистка сканнера:
                scanner.nextLine();
                continue;
            }

            //если введено не число или число не входит в диапазон!
            System.out.println("Поддерживаются только целые положительные числа 1 <-> 100");
            scanner.nextLine(); 
        }
    }

    private void generateSecretNum() {
        secretNum = (int) (Math.random() * ((100 - 1) + 1));
    }

    private static boolean inputNumber(Player player, int num) {
        if (!player.setNumber(num)) {
            return false;
        }

        return true;
    }

    private boolean compareIntroducedNumber(Player player) {

        //если числа предоставленные игроком меньше или больше:
        if (player.getNumber() < secretNum && player.getNumber() > 0) {
            System.out.println(player.getName() + ": ваше число меньше!");
            return false;
        }

         if (player.getNumber() > secretNum && player.getNumber() > 0) {
            System.out.println(player.getName() + ": ваше число больше!");
            return false;
        }

        //если число угадано:
        return true;
    }

    private boolean checkWinnings(Player player) {
        if (player.getNumber() == secretNum) {
            System.out.println(player.getName() + ": ВЫИГРАЛ  УГАДАВ ВЕРНОЕ ЧИСЛО = " + secretNum);
            return true;
        } 

        return false;
    }
}