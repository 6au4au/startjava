import java.util.Scanner;

public class NumericGame {

    public static void main(String[] args) {
        System.out.println("          Numeric GAME\n   Добро пожаловать, КРУТИМ!");
        //принцип работы моего алгоритма изложен в коде:
        //1. сюда будем помещать рандомное число которое нам даст занятая RAM из Runtime проинициализируем его max.
        Long guess = 100L;
        for (int i = 0; i < 10; i++) {
            //2. Цепочку этих методов выучил на хекслете:
            guess = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) % 100;
            //3. Дабы usedMemory менялась быстрее завершения программы здесь требуется задержка:
            try {
                Thread.sleep(500);
            } catch(InterruptedException ex) { }
            System.out.println("Гадание на кофейной гуще: " + (i * 10) + "%");
            //4. 
        }
        //Очень простой блок ввода числ
        System.out.println("\nЧисло выпало, сломай клавиатуру " + guess);
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do {
            input = sc.nextInt();
            if ((long) input < guess) {
                System.out.println("Число " + input + " меньше того что загадал компьютер.");
            } else {
                System.out.println("Число " + input + " больше того что загадал компьютер.");
            }
        } while ((long) input != guess);
        System.out.println("\nПОЗДРАВЛЯЮ ВЫ ВЫИГРАЛИ, ЧИСЛО " + input);

        sc.close();
    }
}