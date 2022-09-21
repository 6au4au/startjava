public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10, evensNums = 0, oddNums = 0;
        do {
            if (counter % 2 == 0) {
                evensNums += 1;
                if (counter == (-10)) {
                    System.out.print("От: " + counter + " До: ");
                }
            } else {
                oddNums += 1;
            }
            counter++;
        } while (counter != 21);
        System.out.println(counter);
        System.out.println("Количество счетных чисел = " + evensNums + ", количество не счетных чисел = " + 
            oddNums); //Ноль делится на все степени двойки, по канону это самое четное число, отдельно не вывел.



        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10, b = -1, c = 5, x = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            if (a < b) {
                x = b;
                b = a;
                a = x;
                sorted = false;
            } else if (a < c) {
                x = a;
                a = c;
                c = x;
                sorted = false;
            } else if (b < c) {
                x = b;
                b = c;
                c = x;
                sorted = false;
            } else if (a > b & b > c) { //я решил сделать это в цикле чтобы все было сокрыто в одном блоке.
                System.out.println("Output: " + a + " " + b + " " + c);
            }
        }

        System.out.println("\n3. Вывод реверсивного числа и сумму его цифр");
        int num = 1234, reversed = 0, sum = 0;
        while (num != 0) {
            int temp = num % 10;
            reversed = reversed * 10 + temp;
            sum += temp;
            num /= 10;
        }
        System.out.println("Исходное число в обратном порядке = " + reversed + " Сумма всех цифр = " + sum );

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        //[1;24) 24 не вкл.
        for (int i = 1, j = 1; i <= 24; i += 2, j++) { //i - задает шаг итерации, j считает количество чисел.
            System.out.printf("%4d", i);
            if (j % 5 == 0 && j != 1) { // j != 1 т.к: 1 % 5 == 0, без этой конфигу-
                System.out.println(""); // рации перевод строки будет после 1 числа.
            } else if (i == 24 - 1) {
                while (j % 5 != 0) { //while здесь более читабелен
                    System.out.printf("%4d", 0);
                    j++;
                }
                System.out.println("");
            }
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        //(3)_14(1)_59(1) 
        num = 3141591; //используем переменную из старого задания
        int ones = 0;
        double help = (double) num / 1_000_000.0; //3.
        boolean metr = true;
        while (metr) {
            ones += (int) (help % 10);
            if ((double) num == help) {
                metr = false;
            }
            help *= 1000.0;
        }
        if (ones % 2 == 0) {
            System.out.println("В числе " + num + " Ед. во всех разрядах: " + ones + " и это четное число.");
        } else {
            System.out.println("В числе " + num + " Ед. во всех разрядах: " + ones + " и это не четное число.");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        System.out.println("Прямоугольник");
        for(int i = 1; i != 5; i++) {
            System.out.println("**********");
        }
        System.out.println("Треугольник");
        int k = 1;
        while(k <= 5) {
            if (k == 1) {
                System.out.println("#####");
            } else if (k == 2) {
                System.out.println("####");
            } else if (k == 3) {
                System.out.println("###");
            } else if (k == 4) {
                System.out.println("##");
            } else if (k == 5){
                System.out.println("#");
            }
            k++;
        }
        System.out.println("Второй треугольник");
        k = 1;
        do {
            if (k == 1 || k == 5) {
                System.out.println("$");
            } else if (k == 2 || k == 4) {
                System.out.println("$$");
            } else if (k == 3) {
                System.out.println("$$$");
            }
            k++;
        } while (k != 5);

        System.out.println("\n7. Отображение ASCII-символов");
        boolean tableReadines = false; 
        for (char i = 1, j = 98; !tableReadines; i += 2, j += 2) {
            //заменил управляющие символы андерскором '_' также. Лист: (bs,tab,cr)
            //я заполню все пустые ячейки после маленьких букв.
            if (i >= 47 && j >= 122) {
            tableReadines = true;
            } else if (i == 7 || i == 9 || i == 13) { //(bs,tab,cr)
                System.out.printf("%2s %4s %n", '_', j);
            } else if (j >= 'z' && i <= 47) {
                System.out.printf("%2s %4s %n", i, '_');
            } else if (i % 2 != 0 && j % 2 == 0) {
                System.out.printf("%2s %4s %n", i, j);
            }
        }

        System.out.println("\n8. Проверка является ли число палиндромом");
        //используем старые наработки и старые переменные.
        num = 1234321;
        int localNum = num;
        reversed = 0;
        boolean endReverse = false;
        while (!endReverse) {
            int temp = localNum % 10;
            reversed = reversed * 10 + temp;
            localNum /= 10;
            if (reversed >= num) {
                endReverse = true;
            }
        }
        if (num == reversed) {
            System.out.println("Число" + " " + num + " - " + "Является палиндромом");
        } else {
            System.out.println("Число" + " " + num + " - " + "Не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        //старые переменные.
        num = 123123;
        localNum = num;
        int i = 0, j = 0;
        for (k = 0; k <= 6; k++) {
            int temp = localNum % 10;
            if (k < 3) {
                i += temp;
            } else {
                j += temp;
            }
            localNum /= 10;
        }
        if (i == j) {
            System.out.println("Число (" + num + ") - Является счастливым");
        } else {
            System.out.println("Число (" + num + ") - Не является счастливым");
        }

        System.out.println("10. Вывод таблицы умножения Пифагора");
        System.out.println("\nТаблица Пифагора");
        for(i = 1; i <= 9; i++) {
            if ( i == 1) {
                System.out.print(" " + "|");
                for (k = 2; k <= 9; k++) {
                    System.out.printf("%2d", k);
                    System.out.print(" ");
                }
                System.out.println("\n-|-----------------------");
                continue;
            } else {
                System.out.print(i + "|");
                for (j = i, k = 2; k <= 9; k++, j++) {
                    System.out.printf("%2d", k * i);
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }   
}
/*
    TO DO:
    Повторить конспект

*/