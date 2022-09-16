public class VariableTheme { //здравия желаю

    public static void main(String[] args) {
        System.out.println("No_1. Создание переменных и вывод их значений на консоль.");
        long productKey = 1000_0000_2222_0000L;
        byte winVer = 10;
        short bitDepth = 64;
        float frequency = 2.7f;
        double ram = 7.66;
        char procGen = '5'; 
        int procVer = 4310; 
        boolean networkFlag = true;
        //Пробел в след строке перед "Информация о..." - для красоты аутпута.
        System.out.println(" Информация о системе\n" + "Версия windows: " + winVer + 
                "\nРазрядность системы: x" + bitDepth + "\nКлюч продукта: " + productKey + 
                "FFZH\n" + "Процессор: Intel Core (TM) i" + procGen + "-" + procVer +
                "\nЧастота процессора: " + frequency + "GHz\n" + "ОЗУ: " + ram + "gb\n" +
                "Network connection - " + networkFlag);

        System.out.println("\nNo_2. Расчет стоимости товара.");
        float penPrice = 100F, bookPrice = 200F;
        float discount = (penPrice + bookPrice) * 0.11F; //Скидка 11%
        System.out.println("В вашей корзине 2 товара, сумма скидки: 11%" + 
                "\nВсего товаров на сумму: " + (penPrice + bookPrice) + 
                " РУБ.\nСумма скидки: " + discount + "РУБ.\n К ОПЛАТЕ: " +
                (penPrice + bookPrice - discount) + "РУБ.\n");

        System.out.println("No_3. Вывод в консоль слова JAVA.");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a\n");

        System.out.println("No_4. Отображение min и max значений целочисленных примитивов.");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Byte: " + maxByte + " " + ++maxByte + " " + --maxByte);
        System.out.println("Short: " + maxShort + " " + ++maxShort + " " + --maxShort);
        System.out.println("Int: " + maxInt + " " + ++maxInt + " " + --maxInt);
        System.out.println("Long: " + maxLong + " " + ++maxLong + " " + --maxLong);

        System.out.println("\nNo_5. Перестановка значений переменных.");
        int num1 = 2, num2 = 5, num3;
        System.out.println("Через промежуточную переменную: num1 = " + num1 +
                 " num2 = " + num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Завершено: num1 = " + num1 + " num2 = " + num2);
        System.out.println("\nС помощью арифметических операций: num1 = " +
                num1 + " num2 = " + num2);
        num1 += num2; 
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Завершено: num1 = " + num1 + " num2 = " + num2);
        System.out.println("\nС помощью XOR: num1 = " + num1 + " num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Завершено: num1 = " + num1 + " num2 = " + num2);

        System.out.println("\nNo_6. Вывод символов и их кодов.");
        char ch1 = '#', ch2 = '&', ch3 = '@', ch4 = '^', ch5 = '_';
        System.out.println((int)ch1 + " " + ch1 + "\n" +
                (int)ch2 + " " + ch2 + "\n" + (int)ch3 + 
                " " + ch3 + "\n" + (int)ch4 + " " + 
                ch4 + "\n" + (int)ch5 + " " + ch5);

        System.out.println("\nNo_7. Отображение сотен, десятков и единиц числа."); 
        int num = 123;
        System.out.println("В числе " + num + ":" + "\nСотен: " + (num / 100)  +
                "\nДесятков: " + ((num % 100) / 10) + "\nЕдиниц: " + (num % 10));

        System.out.println("\nNo_8. Вывод на консоль АСКИ-арт Дюка."); 
        char bckSlash = '\\', slash = '/';
        char bktLeft = '(', bktRight = ')';
        char unSc = '_', space = ' ';
        System.out.println("" + space + space + space + space + slash + bckSlash); 
        System.out.println("" + space + space + space + slash +
                space + space + bckSlash); 
        System.out.println("" + space + space + slash + unSc + bktLeft +
                space + bktRight + bckSlash); 
        System.out.println("" + space + slash + space + space + space +
                space + space + space + bckSlash); 
        System.out.println("" + slash + unSc + unSc + unSc + unSc +
                slash + bckSlash + unSc + unSc + bckSlash);

        System.out.println("No_9. Произведение и сумма чисел.");
        num = 345; // используем локальную переменную из старой задачи
        int hundreds = 100, dozens = 10;
        int mult = (num / hundreds) * ((num / dozens) % dozens) * (num % dozens);
        int sum = (num / hundreds) + ((num / dozens) % dozens) + (num % dozens);
        System.out.println("Произведение цифр числа " + num + ": " + mult +
                "\n Сумма цифр числа: " + num + ": " + sum);

        System.out.println("\nNo_10. Преобразование секунд.");
        int inputSec = 86399;
        int hours = inputSec / 3600;
        int minutes = (inputSec % 3600) / 60;
        int seconds = ((inputSec % 3600) / 60) % 60;
        System.out.println("Дано секунд: " + inputSec + "\nЧасов: " + hours + 
                "\nМинут: " + minutes + "\nСекунд: " + seconds);
    }
}