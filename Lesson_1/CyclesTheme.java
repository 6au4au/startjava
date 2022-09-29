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
        int min = -1, max = 0;
        for (int i = min; i <= 10; i++) {
            if (i >= min) {
                max = i;
            }
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
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

        System.out.print("\n4. Вывод чисел на консоль в несколько строк");
        counter = 0;
        for (int i = 1; i < 24; i += 2) {
            if (counter % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%4d", i);
            counter++;
        }
        for(; counter % 5 != 0; counter++) {
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
        int amountLines = 5;
        System.out.println("\nТреугольник");
        while(amountLines >= 1) {
            int amountCharacters = amountLines--;
            while(amountCharacters >= 1) {
                System.out.print('#');
                amountCharacters--;
            }
            System.out.println();
        }
        System.out.println("\nВторой треугольник");
        //Треугольник равнобедренный. median = a / 2 + a % 2; Число должно быть нечетным.
        amountLines = 5;
        // Находим медиану параллельно которой будет вершина (средина треугольника, дойдя до нее:
        //пойдем на уменьшение)
        int median = amountLines / 2 + amountLines % 2;
        int amountCharacters = 0;
        int selectLine = 1;
        do {
            //пока не дошли до центра увеличиваем количество символов на печать, если дошли - уменьшаем.
            if (selectLine <= median) {
                amountCharacters++;
            } else {
                amountCharacters--;
            }
            int printedCharacters = 0;
            do {
                System.out.print('$');
                printedCharacters++;
            } while (printedCharacters < amountCharacters);
            selectLine++;
            System.out.println();
        } while (selectLine <= amountLines);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("I. Символы идущие до цифр и имеющие не четные коды");
        System.out.println("DEC" + " " + "CHAR");
        for (int i = 0; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2d%5c%n", i, (char) i);
            }
        }
        System.out.println("II. маленькие английские буквы имеющие четные коды");
        System.out.println("DEC" + " " + "CHAR");
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%3d%5c%n", i, (char) i);
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
            System.out.printf("%1d%s", j, "__");
        }
        //II этап: o(n²); 1. Ставим цифру и делаем вертикальную разметку.
        //2. Входим во вложенный цикл и перемножаем цифры [2;9]
        System.out.println();
        for(int i = 2; i <= 9; i++) {
            System.out.print(i + "|");
            for (int j = i, c = 2; c <= 9; c++, j++) {
                System.out.printf("%2d%c", c * i, ' ');
            }
            System.out.println();
        }
    }   
}