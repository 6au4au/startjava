public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 22;
        char gender = 'M';
        double height = 1.86;
        if (age > 20) {
            System.out.println("Можете покупать алкоголь");
        } else {
            System.out.println("Алкоголь продается лицам исключительно старше 21 года");
        }
        if (!(Character.toLowerCase(gender) == 'm')) {
            System.out.println("Хватит бухать начни вязать");
        } else {
            System.out.println("Хватит бухать займись спортом");
        }
        if (height < 1.80) {
            System.out.println("Бросишь пить подрастёшь");
        } else {
            System.out.println("Куда тебе расти то, начни пить");
        }

        char firstCharName = "Ivan".charAt(0);
        if (firstCharName == 'M') {
            System.out.println("Тебя зовут не Иван");
        } else if (firstCharName == 'I') {
            System.out.println("Тебя могут звать Иван");
        } else {
                System.out.println("Может быть ты Ваня? Вантеллион?");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 282, num2 = 280;
        if (num1<num2) {
            System.out.println("Min numbers = " + num1 + "; " + "Max numbers = " + num2);
        } else if (num1>num2) {
            System.out.println("Min numbers = " + num2 + "; " + "Max numbers = " + num1);
        } else {
            System.out.println(num1 + " = " + num2 );
        }

        System.out.println("\n3. Работа с числом");
        //Возьмем переменную из задания No2. p.s. Не усложнял логику намеренно.
        num1 = 282;
        if (num1 == 0) {
            System.out.println("\n");
        } else {
            if (num1 % 2 == 0) {
                System.out.print("Число " + num1 + " четное ");
            } else {
                System.out.print("Число " + num1 + " нечетное ");
            }
            if (num1 > 0) {
                System.out.println("и это положительное число!\n");
            } else {
                System.out.println("и это отрицательное число!\n");
            }
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        //Используем две существующие переменные добавим флаги для удобства
        num1 = 324;
        num2 = 124;
        boolean onesFlag = (num1 % 10) == (num2 % 10);
        boolean dozensFlag = ((num1 % 100) / 10) == ((num2 % 100) / 10);
        boolean hundredsFlag = (num1 / 100) == (num2 / 100);
        System.out.println("Исходные числа: No1 = " + num1 + " No2 = " + num2);
        // конкретно в данной ситуации просто комбинируя условия через && || кода получится больше тк нужно составить табл истинности 3х3
        if (num1 != num2) { 
            if (hundredsFlag) {
                System.out.println("I разрядные цифры одинаковы и = " + (num1 / 100));
            } else {
                System.out.println("I разрядные цифры не равны!");
            }
            if (dozensFlag) {
                System.out.println("II разрядные цифры одинаковы и = " + ((num1 % 100) / 10));
            } else {
                System.out.println("II разрядные цифры не равны!");
            }
            if (onesFlag) {
                System.out.println("III разрядные цифры одинаковы и = " + (num1 % 10));
            } else {
                System.out.println("III разрядные цифры не равны!");
            }
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char ch = '\u0057';
        int decCode = (int) ch; 
        /*
         *как по мне методы Integer и методы для проверки char стоило бы использовать, т.к. :
         *они не выходят за тему примитивные типы данных.
         */
        System.out.println("Преобразование HEX в DEC завершено, код: " + decCode);
        if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' ||
                ch == '8' || ch == '9' || ch == '0') {
            System.out.println("Код " + decCode + " - " + "Является цифрой " + ch);
        } else {
            if (ch == 'Q' || ch == 'W' || ch == 'E' || ch == 'R' || ch == 'T' || ch == 'Y' || ch == 'U' ||
                    ch == 'I' || ch == 'O' || ch == 'P' || ch == 'A' || ch == 'S' || ch == 'D' || 
                    ch == 'F' || ch == 'G' || ch == 'H' || ch == 'J' || ch == 'K' || ch == 'L' ||
                    ch == 'Z' ||ch == 'X' || ch == 'C' || ch == 'V' || ch == 'B' || ch == 'N' ||
                    ch == 'M') {
                System.out.println("Код " + decCode + ", соответствует большой литере - " + ch); 
            } else if (ch == 'q' || ch == 'w' || ch == 'e' || ch == 'r' || ch == 't' || ch == 'y' ||
                    ch == 'u' || ch == 'i' || ch == 'o' || ch == 'p' || ch == 'a' || ch == 's' || ch == 'd' || 
                    ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'z' ||
                    ch == 'x' || ch == 'c' || ch == 'v' || ch == 'b' || ch == 'n' || ch == 'm') {
                System.out.println("Код " + decCode + ", соответствует малой литере - " + ch); 
            } else {
                System.out.println("Код " + decCode + ", - не является литерой либо цифрой, это символ " + ch);
            }
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300_000, depositDays = 365; //в depDays можно указать любое количество дней вклада.
        int procentPerYear;
        if (deposit < 100_000) {
            procentPerYear = 5;
        } else if ((deposit >= 100_000) && (deposit <= 300_000)) { //соответственно мы попадаем в категорию 7% а не 10%
            procentPerYear = 7;
        } else {
            procentPerYear = 10;
        }
        int annualRate = ((deposit * procentPerYear) * (depositDays / 365)) / 100;
        System.out.print("Годовая ставка: " + procentPerYear + "% ");
        System.out.println("cумма вклада = " + deposit + "Руб.\nНачисленный процент = " + annualRate +
                "Руб.\nИтоговая сумма = " + (deposit + annualRate) + "Руб.");

        System.out.println("\n7. Определение оценки по предметам");
        int historyScore = 59, historyGrade = 0;
        int progScore = 91, progGrade = 0;
        if (historyScore < 60) {
            historyGrade = 2;
        } else if (historyScore > 60 && historyScore <= 73) {
            historyGrade = 3;
        } else if (historyScore > 73 && historyScore <= 91) {
            historyGrade = 4;
        } else if (historyScore > 91) {
            historyGrade = 5;
        }//Не навижу дублирование кода 
        if (progScore < 60) {
            progGrade = 2;
        } else if (progScore > 60 && progScore <= 73) {
            progGrade = 3;
        } else if (progScore > 73 && progScore <= 91) {
            progGrade = 4;
        } else if (progScore > 91) {
            progGrade = 5;
        }
        System.out.println(historyGrade + " история\n" + progGrade + " программирование\n" + 
                "Средний бал по предметам: " + ((progGrade + historyGrade) / 2) + "\nСредний % " +
                ((progScore + historyGrade) / 2));
                

        System.out.println("\n8. Расчет прибыли");
        int rent = 5000, eargins = 13000, primeCost = 9000;
        int totalIncome = (eargins - primeCost + rent) * 12;
        if (totalIncome > 0) {
            System.out.println("Прибыль за год: +" + totalIncome);
        } else if (totalIncome < 0) {
            System.out.println("Прибыль за год: " + totalIncome);
        } else {
            System.out.println("Точка безубыточности (нулевая прибыль)");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int requiredPay = 567;
        int $1billLimit = 929, $10billLimit = 5, $100billLimit = 340;
        int $1cash = 0, $10cash = 0, $100cash = 0;
        System.out.println("Добро пожаловать!\nВ наличии купюры номиналом" + "\n100$ 10$ 1$\n" + 
                $100billLimit + " " + $10billLimit + " " + $1billLimit + "\n Требуемая сумма = " + requiredPay); 
        if ((requiredPay > 0)) { 
            if ($1billLimit > (requiredPay % 10)) {
                $1cash += (requiredPay % 10);
                $1billLimit -= $1cash;
                if ($10billLimit > ((requiredPay % 100) / 10)) {
                    $10cash += ((requiredPay % 100) / 10);
                    $10billLimit -= $10cash;
                } else {
                    int add$1 = ((requiredPay % 100) / 10) - $10billLimit; //Локальная удобна, т.к. когда нибудь ее заберет gc
                    $1cash += add$1;
                    $10cash = ((requiredPay % 100) / 10) - add$1;
                    $1billLimit -= add$1;
                    $10billLimit -= $10cash;
                }
                if ((requiredPay / 100) < $100billLimit) {
                    $100cash += requiredPay / 100;
                    $100billLimit -= $100cash;
                }
            }
        }
        System.out.println("Итоговая сумма: " + requiredPay + "\nКупюр номиналом выдано\n" + 
                "100$" + " - " + $100cash + " шт. " +
                "10$" + " - " + $10cash + " шт. " +
                "1$" + " - " + $1cash + " шт. " + "\nХорошего дня");
        requiredPay = 0;
        System.out.println("\nДобро пожаловать!\nВ наличии купюры номиналом" + "\n100$ 10$ 1$\n" + 
                $100billLimit + " " + $10billLimit + " " + " " +$1billLimit);
    }
}