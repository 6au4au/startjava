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
        while (true) {
            System.out.println("\n" + activePlayer.getName() + ": Введите число!");

            if (scanner.hasNextInt() && inputNumber(activePlayer, scanner)) {

                //если метод вернул true игрок выиграл:
                if(compareNums(activePlayer)) break;

                //если число не угадано, меняем игроков местами:
                activePlayer = (activePlayer == player1) ? player2 : player1;
                continue;
            }

            //если введено не число или число не входит в диапазон!
            System.out.println("Поддерживаются только целые положительные числа 1 <-> 100");
            scanner.nextLine();
        }
    }

    private void generateSecretNum() {
        secretNum = (int) (Math.random() * 100) + 1;
    }

    private static boolean inputNumber(Player player, Scanner scanner) {
        int num = scanner.nextInt();
        return (player.setNumber(num));
    }

    private boolean compareNums(Player player) {
        //если число не угадано, определяем больше оно либо же меньше :
        if (player.getNumber() != secretNum) {
            String compare = (player.getNumber() < secretNum) ? "Ваше число меньше!" : "Ваше число больше!";
            System.out.println(compare);
            return false;
        }

        System.out.println("\n" + player.getName() + ": ВЫИГРАЛ УГАДАВ ВЕРНОЕ ЧИСЛО = " + secretNum);
        return true;
    }
}