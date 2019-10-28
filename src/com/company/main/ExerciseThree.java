package com.company.main;

import javax.print.attribute.standard.Finishings;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class ExerciseThree {

    public static void executeTasks() {
        solveTask1();
        solveTask2();
        System.out.println("-------------");
        solveTask3();
        solveTask4();
        solveTask5();
        solveTask6();
        solveTask9();
        solveTask10();
        solveTask11();
        solveTask12();
        solveTask13();
        solveTask14();
        solveTask15();
        solveTask16();
        solveTask17();
        solveTask18();
        solveTask19();
        solveTask20();
        solveTask21();
        solveTask22();
        solveTask23();
        //solveTask24();
        //solveTask25();
        //solveTask26();
        //solveTask27();
        //solveTask28();
        //solveTask29();
        //solveTask31();
        //solveTask32();
        solveTask33();
        solveTask34();
        solveTask35();
        solveTask36();
        solveTask37();
        solveTask38();
        solveTask39();
        solveTask40();

    }

    //1. Необходимо вывести на экран числа от 1 до 5.
    public static void solveTask1() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }

    //2. Необходимо вывести на экран числа от 5 до 1.
    public static void solveTask2() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }

    //3. Необходимо вывести на экран таблицу умножения на 3:
    public static void solveTask3() {
        for (int i = 1; i < 11; i++) {
            int m = 3 * i;
            System.out.println(m);
        }
    }

    //4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне
    // от 2 до 100 включительно.
    public static void solveTask4() {
        int x;
        x = 2;
        while (x <= 100) {
            System.out.println(x);
            x = x + 2;
        }
    }

    // 5. С помощью оператора while напишите программу определения суммы всех нечетных
    // чисел в диапазоне от 1 до 99 включительно.
    public static void solveTask5() {
        int x;
        int s;
        s = 0;
        x = 1;
        while (x <= 99) {
            s = s + x;
            x = x + 2;
        }

        System.out.println(s);
    }

    // 6. Напишите программу, где пользователь вводит любое целое положительное число. программа суммирует все числа от 1 до введенного пользователем числа.
    public static void solveTask6() {
        int x;
        int s;
        s = 0;
        x = 5;
        while (x > 0) {
            s = s + x;
            x--;
        }

        System.out.println(s);
    }
    //7. Вычислить значения функции на отрезке [а,b] c шагом h:

    //8. Вычислить значения функции на отрезке [а,b] c шагом h:
    //9. Найти сумму квадратов первых ста чисел.
    public static void solveTask9() {
        int x;
        double s;
        x = 1;
        s = 0;
        while (x <= 100) {
            s = s + Math.pow(x, 2);
            x++;
        }

        System.out.println(s);
    }

    //10. Составить программу нахождения произведения квадратов первых двухсот чисел.
    public static void solveTask10() {
        BigInteger res = BigInteger.valueOf(1);
        int x = 1;
        while (x <= 200) {
            long y = x * x;
            res = res.multiply(BigInteger.valueOf(y));
            x++;
        }

        System.out.println("10. " + res);
    }

    //11. Составить программу нахождения разности кубов первых двухсот чисел
    public static void solveTask11() {
        double res = 0;
        int x = 1;
        while (x <= 200) {
            double y = Math.pow(x, 3);
            res = res - y;
            x++;
        }

        System.out.println("11. " + res);
    }

    //12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1
    // Составьте программу нахождения произведения первых 10 членов этой последовательности.
    public static void solveTask12() {
        int num = 1;
        long res = 1;
        for (int n = 2; n <= 10; n++) {
            num += 6;
            res *= num;
        }

        System.out.println("12. result = " + res);
    }

    //13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
    public static void solveTask13() {
        for (double x = -5; x <= 5; x += 0.5) {
            double y = 5 - x * x / 2;
            System.out.printf("13. x = %s; y = %s", x, y);
            System.out.println();
        }

    }

    //14. Дано натуральное n. вычислить: 1/1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
    public static void solveTask14() {
        int n = 10;
        double res = 0;
        for (double i = 1; i <= n; i = i + 1) {
            res = res + 1 / i;
        }

        System.out.println("14. result = " + res);
    }

    // 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.
    public static void solveTask15() {
        double x = 2;
        double res = 0;
        for (int i = 0; i <= 10; i++) {
            res = res + Math.pow(x, i);
        }

        System.out.println("15. result = " + res);
    }

    //16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
    public static void solveTask16() {
        int x = 0;
        double res = 1;

        for (int i = 1; i <= 10; i = i + 1) {
            x = x + i;
            res = res * x;
        }

        System.out.println("16. result = " + res);

    }

    //17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
    public static void solveTask17() {
        double a = 1.5;
        double res = 1;
        double b;

        for (int n = 3; n >= 0; n--) {
            b = a + n;
            res = res * b;
        }
        System.out.println("17. result = " + res);
    }

    //18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
    //an = (−1)n−1 n
    public static void solveTask18() {
        double e = 0.05;
        double a;
        double res = 0;

        for (int i = 1; i <= 10; i++) {
            a = Math.pow(-1, i - 1) / i;
            if (Math.abs(a) >= e) {
                res = res + a;
            }
        }

        System.out.println("18. result = " + res);
    }

    //  19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
    //a=1+1 n 2n 3n
    //an= 1 (3n−2)(3n+1)
    public static void solveTask19() {
        double e = 0.005;
        double a;
        double res = 0;

        for (int i = 1; i <= 10; i++) {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e) {
                res = res + a;
            }
        }

        System.out.println("19. result = " + res);
    }

    //  20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
    public static void solveTask20() {
        double e = 0.0005;
        double a;
        double res = 0;

        for (int i = 1; i <= 10; i++) {
            a = (double) 1 / ((3 * i - 2) * (3 * i + 1));
            if (Math.abs(a) >= e) {
                res = res + a;
            }
        }

        System.out.println("20. result = " + res);
    }

    //  21. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:
    //  F ( x) = x − sin( x)
    public static void solveTask21() {
        double a;
        double b;
        double h;
        double y;


        a = -3.4;
        b = 5;
        h = 0.3;
        y = 0;

        for (double x = a; x <= b; x += h) {
            y = x - Math.sin(x);
            System.out.printf("21. x = %s; y = %s", x, y);
            System.out.println();
        }

    }

    //22. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:
    //  F(x) = sin2 (x)
    public static void solveTask22() {
        double a;
        double b;
        double h;
        double y;


        a = -3.4;
        b = 5;
        h = 0.3;
        y = 0;

        for (double x = a; x <= b; x += h) {
            y = Math.pow(Math.sin(x), 2);
            System.out.printf("22. x = %s; y = %s", x, y);
            System.out.println();
        }

    }

    // 23. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:
    //x 1
    //F ( x ) = c t g  3  + 2 s i n ( x )
    public static void solveTask23() {
        double a;
        double b;
        double h;
        double y;

        a = -3.4;
        b = 5;
        h = 0.3;
        y = 0;

        for (double x = a; x <= b; x += h) {
            y = 1 / Math.tan(x / 3) + 1 / 2 * Math.sin(x);
            System.out.printf("23. x = %s; y = %s", x, y);
            System.out.println();
        }
    }

    //  24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
    // Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по
    // сравнению с введенным числом.
    public static void solveTask24() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        double x;
        double res = 0;
        int counter = -1;
        int z;
        int res2 = 0;
        int num1 = num;
        int x1;

        while (num > 0) {
            x = num % 10;
            if (x % 2 == 0) {
                res = res + x;
            }

            num = num / 10;
            counter += 1;

        }
        System.out.println("24. sum of numbers is " + res);

        while (counter >= 0) {
            x1 = (num1 % 10);
            int s = (int) (Math.pow(10, counter));
            z = s * x1;
            res2 = res2 + z;
            counter--;
            num1 = num1 / 10;
        }
        System.out.println(res2);
    }

    //25. Требуется определить факториал числа, которое ввел пользователь.
    public static void solveTask25() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = in.nextLong();

        double res = 1;
        while (num > 0) {
            res = res * num;
            num--;
        }
        System.out.println("25. the result is = " + res);
    }

    //  26. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).
    public static void solveTask26() {

        for (int x = 0; x <= 256; x++) {
            char ch;
            ch = (char) x;
            System.out.printf("26. number %d symbol %c ", x, ch);
            System.out.println();
        }
    }

    // 27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
    public static void solveTask27() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number m: ");
        int m = in.nextInt();

        System.out.print("Enter a number n: ");
        int n = in.nextInt();

        double y;

        while (m <= n) {
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    System.out.println("dividers " + i + " for number " + m);
                }
            }
            m++;
        }
    }

    // 28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *).
    // Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0 при делении.
    // Организовать возможность многократных вычислений без перезагрузки программа (т.е. построить цикл). В качестве
    // символа прекращения вычислений принять ‘0’.
    public static void solveTask28() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number X: ");
            int x = in.nextInt();

            System.out.print("Enter a number Y: ");
            int y = in.nextInt();

            System.out.print("Enter operation (+, -, /, *): ");
            String oper = in.next();

            int z;

            if (oper.equals("0")) {
                break;
            }
            switch (oper) {
                case "+":
                    z = x + y;
                    break;
                case "-":
                    z = x - y;
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("can't divide by 0");
                        continue;
                    }
                    z = x / y;
                    break;
                case "*":
                    z = x * y;
                    break;
                default:
                    System.out.println("wrong type of operation");
                    continue;
            }

            System.out.println("28. z = " + z);

        }
    }

    // 29.
    public static void solveTask29() {
        int x;
        int y;
        String x1;
        String y1;

        x = 61;
        y = 641;

        x1 = String.valueOf(x);
        y1 = String.valueOf(y);

        for (int i = 0; i < x1.length(); i++) {
            if (y1.contains(String.valueOf(x1.charAt(i)))) {
                System.out.println("29. " + x1.charAt(i));
            }
        }
    }

    //30. Написать программу, переводящую римские цифры в арабские.
    //31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек
    //пытается их угадать. Программа должна выводить угаданные и неугаданные числа из тех,
    //что сгенерировала программа, а также ошибочные числа пользователя.
    public static void solveTask31() {
        int min = 1;
        int max = 15;
        Scanner in = new Scanner(System.in);

        Random rand = new Random();
        int[] mas = {rand.nextInt((max - min) + 1) + min, rand.nextInt((max - min) + 1) + min, rand.nextInt((max - min) + 1) + min, rand.nextInt((max - min) + 1) + min, rand.nextInt((max - min) + 1) + min};
        for (int i = 0; i < 5; i++) {
            System.out.print("Guess the number : ");
            int x = in.nextInt();

            int[] mas1 = new int[5];
            mas1[i] = x;

            for (int p = 0; p <= 4; p++) {
                if (x == mas[p]) {
                    System.out.println("number was " + mas[p]);
                    System.out.println("right");
                } else if (x != mas[p]) {
                    System.out.println("no match");
                }
                System.out.println();
            }
        }
    }

    //32. Проверить введенную пользователем строку на наличие недопустимых символов.
    // В качестве первого символа допустимы только буквы и знак подчеркивания. Остальные
    //символы могут быть буквами, цифрами и знаком подчеркивания.
    public static void solveTask32() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String x = in.nextLine();


        String b = "_";

        if (x.startsWith(b) || Character.isLetter(x.charAt(0))) {
            System.out.println("1st symbol is correct");
        }
        for (int i = 1; i < x.length(); i++) {
            if (b.contains(String.valueOf(x.charAt(i))) || Character.isLetter(x.charAt(i)) || Character.isDigit(x.charAt(i))) {
                System.out.println("letter is correct " + x.charAt(i));
            }
        }
    }

    //33. Найдите наибольшую цифру данного натурального числа.
    public static void solveTask33() {
        int number = 465782;
        int maxDigit = 0;
        while (number > 0) {
            maxDigit = Math.max(number % 10, maxDigit);
            number /= 10;
        }
        System.out.println("max digit is " + maxDigit);
    }

    //34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
    public static void solveTask34() {
        int n;

        for (int number = 1000; number <= 9999; number++) {
            n = number;
            int res = 0;
            while (n > 0) {
                res = res + (n % 10);
                n /= 10;
            }
            if (res == 15) {
                System.out.println("34. " + number);
            }
        }
    }

    //35. Найдите количество четных цифр данного натурального числа.
    public static void solveTask35() {
        int number = 2345;
        int counter = 0;

        while (number > 0) {
            int n = number % 10;
            if (n % 2 == 0) {
                counter++;
            }
            number /= 10;
        }
        System.out.println("35. " + counter);
    }

    //36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число,
    // которое делится на их произведение. Найти эти числа.
    public static void solveTask36() {
        for (int a = 10; a <= 99; a++) {
            for (int b = 10; b <= 99; b++) {
                int c = a * 100 + b;
                int m = a * b;
                if (c % m == 0) {
                    System.out.println("36. a = " + a + " b = " + b);
                }
            }
        }
    }

    // 37. Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число получили путем написания сначала числа А,
    // затем В. Для получения второго числа сначала записали число В, затем А. Найти числа А и В если известно , что первое
    //четырехзначное число нацело делится на 99, а второе на 49.
    public static void solveTask37() {
        for (int a = 10; a <= 99; a++) {
            for (int b = 10; b <= 99; b++) {
                int c = a * 100 + b;
                int d = b * 100 + a;

                if (c % 99 == 0 && d % 49 == 0) {
                    System.out.println("37. a = " + a + " b = " + b);
                }
            }
        }
    }

    //38. Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию.
    // Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
    public static void solveTask38() {
        int number = 1357;
        int d = 0;

        d = number % 10 - number / 10 % 10;

        while (number > 9) {

            int n1 = number % 10;
            int n2 = number / 10 % 10;
            if (n1 - n2 != d) {
                System.out.println("38. wrong");
                return;
            }

            number /= 10;

        }
        System.out.println("арифметическая прогрессия");
    }

    //39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили исходное число. Найти это число.
    public static void solveTask39() {
        for (int a = 10; a <= 99; a++) {
            int b = a * 7;
            int c = (b / 100) % 10;
            int res = c * 100 + a;
            if (res == b) {
                System.out.println("39. " + res);
            }
        }
    }

    //40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.
    //101
    public static void solveTask40() {
        int n = 130;

        for (int a = 1; a < n; a++) {
            boolean f = true;
            int check_a = a;

            while (check_a > 0) {
                int b = check_a % 10;

                if (b == 0 || a % b != 0) {
                    f = false;
                    break;
                }
                check_a /= 10;
            }
            if(f){
                System.out.println("40. " + a);
            }
        }
    }
}

