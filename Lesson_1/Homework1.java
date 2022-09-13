public class Homework1 {

    public static void main(String[] args) {
        System.out.println("Создание переменных и вывод их значений на консоль. No_1");
        String cpuModel = "Intel(R) Core(TM) i5", pcName = "DESKTOP";
        int cpuCores = 2, ram = 8, bit = 64;
        float frequency = 2.7F;
        System.out.println("Информация о сисистеме\n" + "Имя системы: " + pcName 
            + "\nМодель процессора: " + cpuModel + "\nКоличество ядер: " + cpuCores
            + "\nТактовая частота процессора: " + frequency + "GHZ" + "\nТип системы: " 
            + bit + "-разрядная операционная система.\n");

        System.out.println("Расчет стоимости товара. No_2");
        float penPrice = 100F, bookPrice = 200F;
        float discount = (penPrice + bookPrice) * 0.11F; //Скидка 11%
        System.out.println("В вашей корзине 2 товара, сумма скидки: 11%\nВсего товаров на сумму: "
            + (penPrice + bookPrice) + " РУБ.\nСумма скидки: " + discount + "РУБ.\n К ОПЛАТЕ: " +
            (penPrice + bookPrice - discount) + "РУБ.\n");

        System.out.println("Вывод в консоль слова JAVA. No_3");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a\n");

        System.out.println("Отображение min и max значений целочисленных примитивов. No_4");
        byte maxByte = 127, incByte = maxByte++, decByte = maxByte--; 
        short maxShort = 32767, incShort = maxShort++, decShort = maxShort--;
        int maxInt = 2147483647, incInt = maxInt++, decInt = maxInt--;
        long maxLong = 9_223_372_036_854_775_807L, incLong = maxLong++, decLong = maxLong--;
        System.out.println("Byte: " + maxByte + " " + incByte + " " + decByte);
        System.out.println("Short: " + maxShort + " " + incShort + " " + decShort);
        System.out.println("Int: " + maxInt + " " + incInt + " " + decInt);
        System.out.println("Long: " + maxLong + " " + incLong + " " + decLong);

        System.out.println("\nПерестановка значений переменных. No_5");
        int num1 = 2, num2 = 5, num3;
        System.out.println("Через промежуточную переменную: num1 = " + num1 + " num2 = " + num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Завершено: num1 = " + num1 + " num2 = " + num2);
        System.out.println("\nС помощью арифметических операций: num1 = " 
            + num1 + " num2 = " + num2);
        num1 += num2; //n1: 7;2 n2: -5; 
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Завершено: num1 = " + num1 + " num2 = " + num2);
        System.out.println("\nС помощью XOR: num1 = " + num1 + " num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2;
        System.out.println("Завершено: num1 = " + num1 + " num2 = " + num2);

        System.out.println("\nВывод символов и их кодов. No_6");
        char ch1 = (char)35, ch2 = (char)38, ch3 = (char)64, ch4 = (char)94, ch5 = (char)95;
        System.out.println("35 is " + ch1 + "\n38 is " + ch2 + "\n64 is " 
            + ch3 +"\n94 is " + ch4 + "\n95 is " + ch5);

        System.out.println("\nОтображение сотен, десятков и единиц числа. No_7"); 
        int num = 123;
        System.out.println("В числе " + num + ":" + "\nСотен: " + (num / 100) 
            + "\nДесятков: " + (num / 10) + "\nЕдиниц: " + (num % 10));

        System.out.println("\nВывод на консоль АСКИ-арт Дюка. No_8"); 
        char rSl = '\\', lSl = '/';
        char bktLeft = '(', bktRight = ')';
        char unSc = '_', space = ' ';
        System.out.println("" + space + space + space + space + lSl + rSl); 
        System.out.println("" + space + space + space + lSl + space + space + rSl); 
        System.out.println("" + space + space + lSl + unSc + bktLeft + space + bktRight + rSl); 
        System.out.println("" + space + lSl + space + space + space + space + space + space + rSl); 
        System.out.println("" + lSl + unSc + unSc + unSc + unSc + lSl + rSl + unSc + unSc + rSl);

        System.out.println("Произведение и сумма чисел. No_9");
        num = 345; // используем локальную переменную из старой задачи
        int mult = (num / 100) * ((num / 10) % 10) * (num % 10);
        int sum = (num / 100) + ((num / 10) % 10) + (num % 10);
        System.out.println("Произведение цифр числа " + num + ": " + mult 
            + "\n Сумма цифр числа: " + num + ": " + sum);

        System.out.println("\nПреобразование секунд. No_10");
        int inputSec = 86399;
        int hours = inputSec / 3600;
        int minutes = (inputSec % 3600) / 60;
        int seconds = inputSec - hours * 3600 - minutes * 60;
        System.out.println("Дано секунд: " + inputSec + "\nЧасов: " + hours 
            + "\nМинут: " + minutes + "\nСекунд: " + seconds);
    }
}