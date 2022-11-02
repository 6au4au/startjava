package com.startjava.lesson_1.finish;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 22;
        boolean maleGender = true; //1 муж; 0 жен.
        double height = 1.86;
        if (age > 20) {
            System.out.println("Можете покупать алкоголь");
        } else {
            System.out.println("Алкоголь продается лицам исключительно старше 21 года");
        }
        if (!maleGender) {
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
        if (num1 < num2) {
            System.out.println("Min numbers = " + num1 + "; " + "Max numbers = " + num2);
        } else if (num1 > num2) {
            System.out.println("Min numbers = " + num2 + "; " + "Max numbers = " + num1);
        } else {
            System.out.println(num1 + " = " + num2 );
        }

        System.out.println("\n3. Работа с числом");
        //Возьмем переменную из задания No2. p.s. Не усложнял логику намеренно.
        num1 = 282;
        if (num1 == 0) {
            System.out.println("\nЧисло" + num1 + "равно нулю!\n");
        } else {
            if (num1 % 2 == 0) {
                System.out.print("Число " + num1 + " четное ");
            } else {
                System.out.print("Число " + num1 + " нечетное ");
            }
            if (num1 > 0) {
                System.out.println("и это положительное число!\n");
            } else if (num1 < 0) {
                System.out.println("и это отрицательное число!\n");
            } else {
                System.out.println("число равно нулю!\n");
            }
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        //Используем две существующие переменные добавим флаги для удобства
        num1 = 324;
        num2 = 124;
        boolean equalsOnes = (num1 % 10) == (num2 % 10);
        boolean equalsDozens = ((num1 % 100) / 10) == ((num2 % 100) / 10);
        boolean equalsHundreds = (num1 / 100) == (num2 / 100);
        System.out.println("Исходные числа: No1 = " + num1 + " No2 = " + num2);
        /* конкретно в данной ситуации просто комбинируя условия через && ||
        * кода получится больше тк нужно составить табл истинности 3х3 */
        if (num1 != num2) { 
            if (equalsHundreds) {
                System.out.println("I разрядные цифры одинаковы и = " + (num1 / 100));
            } else {
                System.out.println("I разрядные цифры не равны!");
            }
            if (equalsDozens) {
                System.out.println("II разрядные цифры одинаковы и = " + ((num1 % 100) / 10));
            } else {
                System.out.println("II разрядные цифры не равны!");
            }
            if (equalsOnes) {
                System.out.println("III разрядные цифры одинаковы и = " + (num1 % 10));
            } else {
                System.out.println("III разрядные цифры не равны!");
            }
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char ch = '\u0057'; 
        /*
         *как по мне методы Integer и методы для проверки char стоило бы использовать, т.к. :
         *они не выходят за тему примитивные типы данных.
         */
        System.out.println("Преобразование HEX в DEC завершено, код: " + (int) ch);
        if (ch >= '0' && ch <= '9') {
            System.out.println("Код " + ch + " - " + "Является цифрой " + ch);
        } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println("Код " + ch + ", соответствует большой литере - " + ch); 
        } else if ( ch >= 'a' && ch <= 'z' ) {
                System.out.println("Код " + (int) ch + ", соответствует малой литере - " + ch); 
        } else {
                System.out.println("Код " + (int) ch + ", - не является литерой либо цифрой, это символ " + ch);
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
        int billLimit1 = 929, billLimit10 = 5, billLimit100 = 340;
        int dollarCash1sh = 0, dollarCash10 = 0, dollarCash100 = 0;
        int requiredDozens = (requiredPay % 100) / 10;
        System.out.println("Добро пожаловать!\nВ наличии купюры номиналом" + "\n100$ 10$ 1$\n" + 
                billLimit100 + " " + billLimit10 + " " + billLimit1 + "\n Требуемая сумма = " + requiredPay);
        if ((requiredPay > 0)) { 
            if (billLimit1 > (requiredPay % 10)) {
                dollarCash1sh += (requiredPay % 10);
                billLimit1 -= dollarCash1sh;
                if (billLimit10 > requiredDozens) {
                    dollarCash10 += requiredDozens;
                    billLimit10 -= dollarCash10;
                } else {
                    int reservedDollar = requiredDozens - billLimit10; //Локальная удобна, т.к. когда нибудь ее заберет gc
                    dollarCash1sh += reservedDollar;
                    dollarCash10 = requiredDozens - reservedDollar;
                    billLimit1 -= reservedDollar;
                    billLimit10 -= dollarCash10;
                }
                if ((requiredPay / 100) < billLimit100) {
                    dollarCash100 += requiredPay / 100;
                    billLimit100 -= dollarCash100;
                }
            }
        }
        System.out.println("Итоговая сумма: " + requiredPay + "\nКупюр номиналом выдано\n" + 
                "100$" + " - " + dollarCash100 + " шт. " +
                "10$" + " - " + dollarCash10 + " шт. " +
                "1$" + " - " + dollarCash1sh + " шт. " + "\nХорошего дня");
        requiredPay = 0;
        System.out.println("\nДобро пожаловать!\nВ наличии купюры номиналом" + "\n100$ 10$ 1$\n" + 
                billLimit100 + " " + billLimit10 + " " + " " +billLimit1);
    }
}