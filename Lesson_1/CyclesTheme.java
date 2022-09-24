public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10, sumEven = 0, sumOdd = 0;
        System.out.print("От: " + counter + " До: ");
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter < 21);
        //Возвращаем в print конец отрезка и переносим строку.
        System.out.println(counter);
        System.out.println("Сумма четных чисел = " + sumEven + ", Сумма нечетных чисел = " + sumOdd); 

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        for (int min = -1, max = 10 - 1; max > min; max--) {
            System.out.print(max + " ");
        }
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
        int b = 1;
        //i - задает шаг итерации, b считает количество чисел и задает формат
        //b = 1 для: избежания проверки (b%5==0 && b != 0). А также для более привычной работы с матрицей.
        for (int i = 1; i < 24; i += 2, b++) {
            System.out.printf("%4d", i);
            if (b % 5 == 0) {
                System.out.println();
            }
        }
        //--b количество цифр в матрице = b - 1.
        for(--b; b % 5 != 0; b++) {
            System.out.printf("%4d", 0);
        }
        System.out.println();

        System.out.println("\n5. Проверка количества единиц на четность");
        num = 3141591;
        int copyNum = num;
        int countOnes = 0;
        while (copyNum > 0) {
            if(copyNum % 10 == 1) {
                countOnes++;
            }
            copyNum /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.println("В числе " + num + "; Единиц: " + countOnes + " и это четное число.");
        } else {
            System.out.println("В числе " + num + "; Единиц: " + countOnes + " и это не четное число.");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        System.out.println("Прямоугольник");
        for(int i = 0; i != 5; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        int k = 5;
        System.out.println("Треугольник");
        while(k >= 1) {
            int x = k--;
            while(x >= 1) {
                System.out.print('#');
                x--;
            }
            System.out.println();
        }
        System.out.println("Второй треугольник");
        //возрастание
        k = 0;
        do {
            k++;
            int x = 0;
            do {
                System.out.print('$');
                x++;
            } while (x != k);
            System.out.println();
        } while (k < 3);
        //убывание
        do {
            k--;
            int x = k;
            do {
                System.out.print('$');
                x--;
            } while (x > 0);
            System.out.println();
        } while (k > 1);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("I. Символы идущие до цифр и имеющие не четные коды");
        System.out.println("DEC" + " " + "CHAR");
        for (int i = 0; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2d", i);
                System.out.println("    " + (char) i);
            }
        }
        System.out.println("II. маленькие английские буквы имеющие четные коды");
        System.out.println("DEC" + " " + "CHAR");
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%3d", i);
                System.out.println("   " + (char) i);
            }
        }

        System.out.println("\n8. Проверка является ли число палиндромом");
        //используем старые наработки и старые переменные.
        num = 1234321;
        copyNum = num;
        int reversed = 0;
        while (copyNum > 0) {
            int digit = copyNum % 10;
            reversed = reversed * 10 + digit;
            copyNum /= 10;
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
        int firstHalf = 0, secondHalf = 0;
        for (int c = 0; c <= 6; c++) {
            int digit = copyNum % 10;
            if (c < 3) {
                firstHalf += digit;
            } else {
                secondHalf += digit;
            }
            copyNum /= 10;
        }
        if (firstHalf == secondHalf) {
            System.out.println("Число (" + num + ") - Является счастливым");
        } else {
            System.out.println("Число (" + num + ") - Не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        //I этап: размечаем верхнюю область
        System.out.println("     " + "Таблица Пифагора");
        System.out.print("_" + "|_");
        for (int j = 2; j <= 9; j++) {
            System.out.printf("%1d", j);
            System.out.print("__");
        }
        //II этап: o(n²); 1. Ставим цифру и делаем вертикальную разметку.
        //2. Входим во вложенный цикл и перемножаем цифы [2;9]
        System.out.println();
        for(int i = 2; i <= 9; i++) {
            System.out.print(i + "|");
            for (int j = i, c = 2; c <= 9; c++, j++) {
                System.out.printf("%2d", c * i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }   
}