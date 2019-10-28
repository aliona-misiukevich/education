package com.company.main;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class ExerciseTwo {
    public static void executeTasks() {
        solveTask1();
        solveTask2();
        solveTask3();
        solveTask4();
        solveTask5();
        solveTask6();
        solveTask7();
        solveTask8();
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
        //solveTask21();
        solveTask22();
        //solveTask23();
        //solveTask24();
        //solveTask25();
        solveTask26();
        solveTask27();
        solveTask28();
        solveTask29();
        solveTask30();
        solveTask31();
        solveTask32();
        //solveTask33();
        //solveTask34();
        solveTask35();
        solveTask36();
        solveTask37();
        solveTask38();
        solveTask39();
        solveTask40();

    }

    //1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.
    public static void solveTask1() {
        double a;
        double b;
        a = 5;
        b = 3;
        if (a < b) {
            System.out.println("7");
        } else {
            System.out.println("8");
        }
    }

    //2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no»
    public static void solveTask2() {
        double a;
        double b;
        a = 5;
        b = 3;
        if (a < b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    //3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
    public static void solveTask3() {
        double a;
        a = 5;
        if (a > 3) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }

    //4. Составить программу: равны ли два числа а и b?
    public static void solveTask4() {
        double a;
        double b;
        a = 4;
        b = 4;
        if (a == b) {
            System.out.println("a and b values are equal");
        } else {
            System.out.println("a and b values are different");
        }
    }

    //5. Составить программу: определения наименьшего из двух чисел а и b.
    public static void solveTask5() {
        double a;
        double b;
        a = 3;
        b = 7;
        if (a > b) {
            System.out.println("a is more than b");
        } else {
            System.out.println("b is more than a");
        }
    }

    //6. Составить программу: определения наибольшего из двух чисел а и b.
    public static void solveTask6() {
        double a;
        double b;
        a = 3;
        b = 7;
        if (a > b) {
            System.out.println("b is less than a");
        } else {
            System.out.println("a is less than b");
        }
    }

    //7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
    public static void solveTask7() {
        double a;
        double b;
        double c;
        double x;
        double res;
        a = -3;
        b = -5;
        c = 2;
        x = 3.5;
        res = a * x * x + (b * x) + c;
        if (res < 0) {
            res = -res;
        }
        System.out.println("the result is " + res);
    }

    //8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
    public static void solveTask8() {
        double a;
        double b;
        a = 5.4;
        b = 5;
        double powA = Math.pow(a, 2);
        double powB = Math.pow(b, 2);
        if (powA > powB) {
            System.out.println("b is less");
        } else if (powA == powB) {
            System.out.println("values are equal");
        } else {
            System.out.println("a is less");
        }
    }

    //9. Составить программу, которая определит по трем введенным сторонам, является ли
    //данный треугольник равносторонним.
    public static void solveTask9() {
        double a;
        double b;
        double c;
        a = 3;
        b = 3;
        c = 3;
        if (a == b && b == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //10. Составить программу, которая определит площадь какого круга меньше.
    public static void solveTask10() {
        double r1;
        double r2;
        r1 = 506.2;
        r2 = 506.25;
        double s1 = Math.PI * Math.pow(r1, 2);
        double s2 = Math.PI * Math.pow(r2, 2);
        if (s1 > s2) {
            System.out.println("s2 is less");
        } else if (s1 < s2) {
            System.out.println("s1 is less");
        } else {
            System.out.println("values are equal");
        }
    }

    //11. Составить программу, которая определит площадь какого треугольника больше.
    public static void solveTask11() {
        double a1;
        double a2;
        double h1;
        double h2;

        a1 = 3.5;
        a2 = 5.5;
        h1 = 5;
        h2 = 10;

        double s1 = 0.5 * a1 * h1;
        double s2 = 0.5 * a2 * h2;
        if (s1 > s2) {
            System.out.println("s2 is less");
        } else if (s1 < s2) {
            System.out.println("s1 is less");
        } else {
            System.out.println("values are equal");
        }
    }

    //12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
    public static void solveTask12() {
        double x1;
        double x2;
        double x3;
        double x1Res;
        double x2Res;
        double x3Res;

        x1 = 3;
        x2 = -5;
        x3 = 4.6;

        if (x1 > 0) {
            x1Res = Math.pow(x1, 2);
        } else if (x1 < 0) {
            x1Res = Math.pow(x1, 4);
        } else {
            System.out.println("it's 0");
        }

        if (x2 > 0) {
            x2Res = Math.pow(x1, 2);
        } else if (x2 < 0) {
            x2Res = Math.pow(x1, 4);
        } else {
            System.out.println("it's 0");
        }

        if (x3 > 0) {
            x3Res = Math.pow(x1, 2);
        } else if (x3 < 0) {
            x3Res = Math.pow(x1, 4);
        } else {
            System.out.println("it's 0");
        }
    }

    //13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
    public static void solveTask13() {
        double x1;
        double y1;
        double x2;
        double y2;

        x1 = 5;
        x2 = -3;
        y1 = 2;
        y2 = 5;

        double A = x1 * x1 + y1 * y1;
        double B = x2 * x2 + y2 * y2;

        if (A < B) {
            System.out.println("A is closer");
        } else if (A > B) {
            System.out.println("B is closer");
        } else {
            System.out.println("values are same");
        }
    }

    //14. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
    public static void solveTask14() {
        int a;
        int b;
        a = 45;
        b = 180;

        if (a + b > 180) {
            System.out.println("14. not exist");
        } else if (a == 90 || b == 90 || a + b == 90) {
            System.out.println("rectangular");
        } else {
            System.out.println("exist");
        }
    }

    //15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы,
    // а большее — их удвоенным произведением.
    public static void solveTask15() {
        double x;
        double y;

        x = 1;
        y = 2;

        if (x == y) {
            System.out.println("they are equal");
        }
        if (x > y) {
            y = (x + y) / 2;
            x = 2 * x * y;
            System.out.println("15 x = " + x + " y = " + y);
        } else {
            x = (x + y) / 2;
            y = 2 * x * y;
        }
    }

    //16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).
    public static void solveTask16() {
        double x;
        double y;

        x = 1.5;
        y = -4.5;

        if (x == 0 && y == 0) {
            System.out.println("A at the 0.0");
        } else if (x == 0 && y != 0) {
            System.out.println("A on the Y");
        } else if (y == 0 && x != 0) {
            System.out.println("A on the X");
        } else if (x > 0 && y > 0) {
            System.out.println("A on the I");
        } else if (x > 0 && y < 0) {
            System.out.println("A on the IV");
        } else if (x < 0 && y > 0) {
            System.out.println("A on the II");
        } else if (x < 0 && y < 0) {
            System.out.println("A on the III");
        }
    }

    //17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом,
    // равным большему из исходных, а если равны, то заменить числа нулями.
    public static void solveTask17() {
        double m;
        double n;

        Random rand = new Random();
        m = rand.nextDouble();
        n = rand.nextDouble();

        if (m != n) {
            if (m > n) {
                n = m;
            } else {
                n = m;
            }
        } else {
            m = 0;
            n = 0;
        }
        System.out.println("17. m = " + m + " n = " + n);
    }

    //18. Подсчитать ко`личество отрицательных среди чисел а, b, с.
    public static void solveTask18() {
        double a;
        double b;
        double c;
        int counter = 0;

        a = -5;
        b = 4;
        c = 10;

        if (a < 0) {
            counter++;
        }
        if (b < 0) {
            counter++;
        }
        if (c < 0) {
            counter++;
        }
        System.out.println(counter);
    }

    // 19. Подсчитать количество положительных среди чисел а, b, с.
    public static void solveTask19() {
        double a;
        double b;
        double c;
        int counter = 0;

        a = -5;
        b = 4;
        c = 10;

        if (a > 0) {
            counter++;
        }
        if (b > 0) {
            counter++;
        }
        if (c > 0) {
            counter++;
        }
        System.out.println("19 " + counter);
    }

    // 20. Определить, делителем каких чисел а, b, с является число k.
    public static void solveTask20() {
        int a;
        int b;
        int c;
        int k;

        a = 10;
        b = 33;
        c = 14;
        k = 2;

        if (a % k == 0) {
            System.out.println("20. " + k + " is divider of " + a);
        }
        if (b % k == 0) {
            System.out.println("20. " + k + " is divider of " + b);
        }
        if (c % k == 0) {
            System.out.println("20. " + k + " is divider of " + c);
        }
    }

    //21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка?
    // Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
    public static void solveTask21() {
        Scanner in = new Scanner(System.in);
        System.out.print("Who are you? a boy or a girl. Please enter B or G:");
        String x = in.next();
        x = x.toLowerCase();
        System.out.println(x);

        if (x.equals("b")) {
            System.out.println("I like boys!");
        } else if (x.equals("g")) {
            System.out.println("I like girls!");
        } else
            System.out.println("wrong input");
    }

    //22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
    public static void solveTask22() {
        int x;
        int y;
        int x1;

        Random rand = new Random();
        x = rand.nextInt();
        y = rand.nextInt();

        if (x < y) {
            x1 = x;
            x = y;
            y = x1;
            System.out.println("22. x = " + x + " y = " + y);
        } else {
            System.out.println("22. x = " + x + " y = " + y);
        }
    }

    //23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12).
    // Если введены некорректные данные, то сообщить об этом.
    public static void solveTask23() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day :");
        int x = in.nextInt();
        System.out.println("Enter month :");
        int y = in.nextInt();

        if (x >= 1 && x <= 31) {
            if (y >= 1 && y <= 12) {
                System.out.println("date is correct");
            } else {
                System.out.println("month is incorrect");
            }
        } else {
            System.out.println("day is incorrect");
        }
    }

    //24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков п.\
    public static void solveTask24() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println("ne lybit");
        } else {
            System.out.println("lybit");
        }
    }

    //25. Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация »,
    // если температура в комнате превысила 60° С.
    public static void solveTask25() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature :");
        int n = in.nextInt();

        if (n >= 60) {
            System.out.println("«Пожароопасная ситуация »");
        } else {
            System.out.println("everything is fine");
        }
    }

    //26. Написать программу нахождения суммы большего и меньшего из трех чисел.
    public static void solveTask26() {
        int x;
        int y;
        int z;
        int res = 0;
        int a;
        int b;

        Random rand = new Random();
        x = rand.nextInt();
        y = rand.nextInt();
        z = rand.nextInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        if (x > y) {
            a = x;
            b = y;
        } else {
            a = y;
            b = x;
        }

        if (z > a) {
            a = z;
        }
        res += a;

        if (b > z) {
            res = res + z;
        } else {
            res = res + b;
        }

        System.out.println("26. result is " + res);
    }

    // 27. Найти max{min(a, b), min(c, d)}.
    public static void solveTask27() {
        int a = 5;
        int b = 3;
        int c = 6;
        int d = 4;
        int min1;
        int min2;
        int max;

        if (a > b) {
            min1 = b;
        } else {
            min1 = a;
        }

        if (c > d) {
            min2 = d;
        } else {
            min2 = c;
        }

        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        System.out.println("27. max value is " + max);
    }

    //28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).
    public static void solveTask28() {
        int a = 5;
        int b = 2;
        int c = 6;
        int d = 4;
        int max;

        if (a == d) {
            System.out.println(a);
        } else if (b == d) {
            System.out.println(b);
        } else if (c == d) {
            System.out.println(c);
        } else {
            if (d - a > d - b) {
                max = d - a;
            } else {
                max = d - b;
            }
            if (d - c > max) {
                max = d - c;
            }
            System.out.println("28. max " + max);
        }
    }

    //29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void solveTask29() {
        double x1 = 2;
        double y1 = 1;
        double x2 = 2;
        double y2 = 4;
        double x3 = 4;
        double y3 = 8;

        double z = (x2 - x1) * ( y3 - y1) - (y2 - y1) * (x3 - x1);
        if (z == 0){
            System.out.println("расположены на одной прямой");
        } else {
            System.out.println("не расположены на одной прямой");
        }
    }
    //30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
    public static void solveTask30() {
        int a;
        int b;
        int c;

        Random rand = new Random();
        a = rand.nextInt();
        b = rand.nextInt();
        c = rand.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a > b && b > c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    //31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
    public static void solveTask31() {
        int a = 2;
        int b = 5;
        int x = 2;
        int y = 4;
        int z = 8;

        if (x <= a && z <= b) {
            System.out.println("31. fitable");
        } else if (x <= b && z <= a) {
            System.out.println("31. fitable");
        } else if (x <= a && y <= b) {
            System.out.println("31. fitable");
        } else if (x <= b && y <= a) {
            System.out.println("31. fitable");
        } else if (y <= a && z <= b) {
            System.out.println("31. fitable");
        } else if (y <= b && z <= a) {
            System.out.println("31. fitable");
        }
    }

    //32. Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.
    public static void solveTask32() {
        int a = 2;
        int b = -5;
        int c = 2;

        if (a + b > 0) {
            System.out.println("positive a + b");
        } else if (a + c > 0) {
            System.out.println("positive a + c");
        } else if (b + c > 0) {
            System.out.println("positive b + c");
        }
    }

    //33. Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных.
    // Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа.
    // Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С;
    // 9455, 8997 — доступен модуль базы С.
    public static void solveTask33() {
        int[] group1 = {9583, 1747};
        int[] group2 = {3331, 7922};
        int[] group3 = {9455, 8997};

        Scanner in = new Scanner(System.in);
        System.out.println("Enter password :");
        int n = in.nextInt();

        for (int i = 0; i <= 1; i++) {
            if (n == group1[i]) {
                System.out.println("доступны модули баз А, В, С");
            } else if (n == group2[i]) {
                System.out.println("доступны модули баз В, С");
            } else if (n == group3[i]) {
                System.out.println("доступны модули баз С");
            } else {
                System.out.println("no such password");
            }
        }

    }

    //34. Составить программу, реализующую эпизод применения компьютера в книжном магазине.
    // Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»;
    // если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи;
    // если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
    public static void solveTask34() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price :");
        int p = in.nextInt();
        System.out.println("Enter money :");
        int m = in.nextInt();

        if (p - m == 0) {
            System.out.println("«спасибо»");
        } else if (p - m < 0) {
            System.out.println("«возьмите сдачу» " + (m - p));
        } else if (m - p < 0) {
            System.out.println("not enough " + (p - m));
        } else {
            System.out.println("wrong input");
        }
    }

    //35. Вычислить число и месяц в невисокосном году по номеру дня.
    public static void solveTask35() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of day :");
        int n = in.nextInt();

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < months.length; i++) {
            if (n > months[i]) {
                n -= months[i];
                continue;
            }
            int number = i + 1;
            System.out.println(" the day is " + n + " the number of month is " + number);
            break;
        }
    }

    //36. Вычислить значение функции:
    public static void solveTask36() {
        double x;
        double y;

        x = 3.3;

        if (x <= 3) {
            y = x * x - 3 * x + 9;
            System.out.println("36. y = " + y);
        } else if (x > 3) {
            y = 1 / (Math.pow(x, 3) + 6);
            System.out.println("36. y = " + y);
        }
    }

    //37. Вычислить значение функции:
    public static void solveTask37() {
        double x;
        double y;

        x = 5.5;

        if (x <= 3) {
            y = -1 * Math.pow(x, 2) + 3 * x + 9;
            System.out.println("37. y = " + y);
        } else if (x > 3) {
            y = 1 / (Math.pow(x, 3) - 6);
            System.out.println("37. y = " + y);
        }
    }

    //38. Вычислить значение функции:
    public static void solveTask38() {
        double x;
        double y;

        x = 5.5;

        if (x <= 0 && x <= 3) {
            y = Math.pow(x, 2);
            System.out.println("38. y = " + y);
        } else if (x > 3 || x < 0) {
            y = 4;
            System.out.println("38. y = " + y);
        }
    }

    //39. Вычислить значение функции:
    public static void solveTask39() {
        double x;
        double y;

        x = 5.5;

        if (x >= 8) {
            y = -1 * Math.pow(x, 2) + x - 9;
            System.out.println("39. y = " + y);
        } else if (x < 8) {
            y = 1 / (Math.pow(x, 4) - 6);
            System.out.println("39. y = " + y);
        }
    }
    //40. Вычислить значение функции:
    public static void solveTask40() {
        double x;
        double y;

        x = 5.5;

        if (x <= 13) {
            y = -1 * Math.pow(x, 3) + 9;
            System.out.println("40. y = " + y);
        } else if (x > 13) {
            y = -1 * 3 / (x + 1);
            System.out.println("40. y = " + y);
        }
    }
}