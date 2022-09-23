public class CyclesTheme {

    public static void main(String[] args) {
        // Так как занятие связаны с циклами, я перенес основные счетчики которые повторяются сюда:
        int i = 0, k = 0, j = 0;
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10, sumEven = 0, sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
                if (counter == (-10)) {
                    System.out.print("От: " + counter + " До: ");
                }
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter != 21);
        System.out.println(counter);
        System.out.println("Сумма четных чисел = " + sumEven + ", Сумма не четных чисел = " + sumOdd); 

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int max = 10, min = -1;
        do {
            System.out.print(max-- + " ");
        } while (max >= min);
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и сумму его цифр");
        int num = 1234, sum = 0;
        while (num != 0) {
            int digit = num % 10;
            System.out.print(digit);
            sum += digit;
            num /= 10;
        }
        System.out.print("; sum = " + sum + "\n");

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        //[1;24) 24 не вкл.
        j = 1;
        //i - задает шаг итерации, j считает количество чисел.
        for (i = 1; i <= 24; i += 2, j++) {
            System.out.printf("%4d", i);
            // j != 1 т.к: 1 % 5 == 0, дабы избежать переноса при первой итерации.
            if (j % 5 == 0 && j != 1) {
                System.out.println();
            }
        }
        for(j -= 1; j % 5 != 0; j++) {
            System.out.printf("%4d", 0);
        }
        System.out.println();

        System.out.println("\n5. Проверка количества единиц на четность");
        num = 3141591; //используем переменную из старого задания
        int copyNum = num;
        int countOnes = 0;
        while (copyNum > 0) {
            if(copyNum % 10 == 1) {
                countOnes += 1;
            }
            copyNum /= 10;
        }
        if (countOnes
         % 2 == 0) {
            System.out.println("В числе " + num + "; Единиц: " + countOnes + " и это четное число.");
        } else {
            System.out.println("В числе " + num + "; Единиц: " + countOnes + " и это не четное число.");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        System.out.println("Прямоугольник");
        for(i = 1; i != 5; i++) {
            System.out.println("**********");
        }
        System.out.println("Треугольник");
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
        } while (k <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        boolean tableReadines = false; 
        for (char ch1 = 1, ch2 = 98; !tableReadines; ch1 += 2, ch2 += 2) {
            //заменил управляющие символы андерскором '_' также. Лист: (bs,tab,cr)
            //я заполню все пустые ячейки после маленьких букв.
            if (ch1 >= 47 && ch2 >= 122) {
            tableReadines = true;
            } else if (ch1 == 7 || ch1 == 9 || ch1 == 13) { //(bs,tab,cr)
                System.out.printf("%2s %4s %n", '_', ch2);
            } else if (ch1 >= 'z' && ch1 <= 47) {
                System.out.printf("%2s %4s %n", ch1, '_');
            } else if (ch1 % 2 != 0 && ch2 % 2 == 0) {
                System.out.printf("%2s %4s %n", ch1, ch2);
            }
        }

        System.out.println("\n8. Проверка является ли число палиндромом");
        //используем старые наработки и старые переменные.
        num = 1234321;
        copyNum = num;
        int reversed = 0;
        boolean endReverse = false;
        while (!endReverse) {
            int digit = copyNum % 10;
            reversed = reversed * 10 + digit;
            copyNum /= 10;
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
        copyNum = num;
        i = 0;
        j = 0;
        for (k = 0; k <= 6; k++) {
            int digit = copyNum % 10;
            if (k < 3) {
                i += digit;
            } else {
                j += digit;
            }
            copyNum /= 10;
        }
        if (i == j) {
            System.out.println("Число (" + num + ") - Является счастливым");
        } else {
            System.out.println("Число (" + num + ") - Не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        //I этап: размечаем верхнюю область
        System.out.println("     " + "Таблица Пифагора");
        System.out.print("_" + "|_");
        for (k = 2; k <= 9; k++) {
            System.out.printf("%1d", k);
            System.out.print("__");
        }
        //II этап: o(n²) 1. Ставим цифру и делаем вертикальную разметку.
        //2. Входим во вложенный цикл и перемножаем цифы [2;9]
        System.out.println();
        for(i = 2; i <= 9; i++) {
            System.out.print(i + "|");
            for (j = i, k = 2; k <= 9; k++, j++) {
                System.out.printf("%2d", k * i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }   
}