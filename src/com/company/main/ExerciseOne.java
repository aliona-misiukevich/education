package com.company.main;

import java.util.Random;

public class ExerciseOne {
    public static void executeTasks() {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
        task23();
        task24();
        task25();
        task26();
        task27();
        task28();
        task29();
        task30();
    }
    public static void task1() {
        //1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
        double x;
        double y;
        x = 5.6;
        y = 1.1;
        double s = x + y;
        double d = x - y;
        double m = x * y;
        double q = x / y;
        System.out.println(s);
        System.out.println(d);
        System.out.println(m);
        System.out.println(q);
    }

    //2. Найдите значение функции: с = 3 + а.
    public static void task2() {
        double a;
        a = 5;
        double c = 3 + a;
        System.out.println("2. c = 3 + a = " + c);
    }

    //3. Найдите значение функции: z = 2 * x + ( y – 2 ) * 5.
    public static void task3() {
        double x;
        double y;
        x = 10;
        y = 5.5;
        double z;
        z = 2 * x + (y - 2) * 5;
        System.out.println("3. z = 2 * x + ( y – 2 ) * 5 = " + z);
    }

    //4.Найдите значение функции:z=((a–3)*b/2)+c.
    public static void task4() {
        double a;
        double b;
        double c;
        a = 3.2;
        b = 4.5;
        c = 5.5;
        double z;
        z = (a - 3) * b / 2 + c;
        System.out.println("4. z=((a–3)*b/2)+c = " + z);
    }

    //5. Составить алгоритм нахождения среднего арифметического двух чисел
    public static void task5() {
        double a;
        double b;
        double c;
        Random rand = new Random();
        a = rand.nextDouble();
        b = rand.nextDouble();

        c = (a + b) / 2;
        System.out.println("5. average = " + c);
    }

    //6. Написать код для решения задачи. В n малых бидонах 80 л молока.
    //Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
    public static void task6() {
        int n;
        int m;
        double p;
        double q;
        n = 20;
        m = 15;
        p = 80 / n;
        q = (p + 12) * m;
        System.out.println("6. liters in m = " + q);
    }

    //7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
    public static void task7() {
        double x;
        double s;
        x = 7;
        s = Math.pow(x, 2) * 2;
        System.out.println("7. s = " + s);
    }

    //8. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    //𝑏+√𝑏2 +4𝑎𝑐−𝑎3𝑐+𝑏−2
    public static void task8() {
        double a;
        double b;
        double c;
        double d;
        a = 5.5;
        b = 400;
        c = 2;
        d = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
        System.out.println("8. the result is " + d);
    }

    //9. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    //𝑎 ∗ 𝑏 − 𝑎𝑏 − 𝑐 𝑐𝑑 𝑐𝑑
    public static void task9() {
        double a;
        double b;
        double c;
        double d;
        double r;

        a = 2.5;
        b = -3;
        c = 4.3;
        d = 5;

        r = a / c * b / d - (a * b - c) / (c * d);
        System.out.println("9. the result is " + r);
    }

    //10. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    //𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 ∗ 𝑡𝑔 𝑥𝑦 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
    public static void task10() {
        double x;
        double y;
        double r;
        x = -5.5;
        y = 7.3;
        r = (Math.sin(x) + Math.cos(y)) / ((Math.cos(x) - Math.sin(y))) * Math.sin(x * y) / Math.cos(x * y);
        System.out.println("10. the result is " + r);
    }

    //11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
    public static void task11() {
        double a;
        double b;
        double c;
        double s;
        double p;
        a = 2;
        b = 5;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        p = a + b + c;
        s = 0.5 * a * b;
        System.out.println("11. p = " + p + " s = " + s);
    }

    //12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
    public static void task12() {
        double x1;
        double x2;
        double y1;
        double y2;
        double l;
        x1 = 1.1;
        x2 = 3.5;
        y1 = 3;
        y2 = 5;
        l = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        System.out.println("12. length = " + l);
    }

    //13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его
    //периметр и площадь.
    public static void task13() {
        double x1, x2, x3;
        double y1, y2, y3;
        double p, s;
        double a, b, c;
        x1 = 1.3;
        x2 = 2.4;
        x3 = 2.7;
        y1 = 2;
        y2 = 4;
        y3 = 3.5;
        a = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        b = Math.sqrt((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)));
        c = Math.sqrt((Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));
        p = a + b + c;
        s = Math.sqrt(0.5 * p * (0.5 * p - a) * (0.5 * p - b) * (0.5 * p - c));
        System.out.println("13. p = " + p + " s = " + s);
    }

    //14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
    public static void task14() {
        double r;
        double s;
        double c;
        r = 5.7;
        s = Math.PI * Math.pow(r, 2);
        c = 2 * Math.PI * r;
        System.out.println("14. s = " + s + ", c = " + c);
    }

    //15. Написать программу, которая выводит на экран первые четыре степени числа π.
    public static void task15() {
        for (int i = 1; i < 5; i++) {
            double p = Math.PI;
            double r = Math.pow(p, i);
            System.out.println("Pi is " + r);
        }
    }

    //16. Найти произведение цифр заданного четырехзначного числа.
    public static void task16() {
        int a;
        int a1, a2, a3, a4;
        int m;
        a = 4567;
        a1 = a / 1000;
        a2 = (a - (a1 * 1000)) / 100;
        a3 = (a - (a1 * 1000) - (a2 * 100)) / 10;
        a4 = a % 10;
        m = a1 * a2 * a3 * a4;
        System.out.println("16. the result is " + m);

    }

    //17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
    public static void task17() {
        double a;
        double b;
        double c; //среднее арифметическое
        double d; //среднее геометрическое
        a = 7.6;
        b = -5;
        c = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
        d = Math.sqrt(Math.abs(a) * Math.abs(b));
        System.out.println("17." + c + " and " + d);
    }

    //18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
    public static void task18() {
        double s1;
        double s2;
        double v;
        double l;
        l = 15.5;
        s1 = Math.pow(l, 2);
        s2 = 6 * Math.pow(l, 2);
        v = Math.pow(l, 3);
        System.out.println("18. s1 = " + s1 + " s2 = " + s2 + " v = " + v);
    }

    //19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
    public static void task19() {
        double h;
        double a;
        double s;
        double ri; //радиусы вписанной
        double rd; //описанной окружностей
        a = 10;
        h = a * Math.sqrt(3) / 2;
        s = 0.5 * a * h;
        ri = a / (2 * Math.sqrt(3));
        rd = a / Math.sqrt(3);
        System.out.println("19. h = " + h + " s = " + s + " r1 = " + ri + " r2 = " + rd);
    }

    //20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
    public static void task20() {
        double c;
        double r;
        double s;

        c = 150;
        r = c / (2 * Math.PI);
        s = Math.PI * Math.pow(r, 2);
        System.out.println("20. s = " + s);
    }

    //21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    // Поменять местами дробную и целую части числа и вывести полученное значение числа.
    public static void task21() {
        double R;
        double a;
        double b;
        double res;

        R = 123.456;
        a = R * 1000 % 1000;
        b = R / 1000 - a / 1000000;
        res = a + b;

        System.out.println("21. result = " + res);

    }
    //22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    //ННч ММмин SSc.
    public static void task22() {
        int T;
        int h;
        int m;
        int s;

        T = 123456;
        s = T % 100;
        h = T / 10000;
        m = T / 100 - h * 100;

        System.out.println("22. HH" + h + "MM" + m + "SS" + s);

    }
    //23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
    public static void task23() {
        double s;
        int R = 5;
        int r = 2;

         s = Math.PI * (R * R - r * r);
         System.out.println("23. " + s);
    }
    // 24.Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
    public static void task24(){
        double s;
        double a = 5;
        double b = 10;
        double q = 30;
        double c = (a - b) / 2 * Math.cos(a);

        s = c * Math.sin(a) * (a - c * Math.cos(q));
        System.out.println("24. " + s);

    }
    //25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с
    // (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
    public static void task25() {
        double a = 2;
        double b = 30;
        double c = 7;
        double d;
        double x1;
        double x2;

        d = b * b - 4 * a * c;

        x1 = -1 * b + Math.sqrt(d) / 2 * a;
        x2 = -1 * b - Math.sqrt(d) / 2 * a;

        System.out.println("25. " + x1 + " " + x2);
    }
    //26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
    public static void task26() {
        double a = 24;
        double b = 23;
        double q = 40;
        double s;

        s = 0.5 * a * b * Math.sin(q);
        System.out.println("26. " + s);
    }
    //27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и а10 за четыре операции.
    public static void task27() {
        double a = 4;
        double x1;
        double x2;
        double a2;

        a2 = a * a;

        x1 = a2 * a2 * a2 * a2;
        x2 = a2 * a2 * a2 * a2 * a2;
    }
    //28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.
    public static void task28() {
        double x = 22.9868;
        double q;
        double m1;
        double m;
        double s;

        q = Math.floor(x);
        m1 = (x - q) * 60;
        m = Math.floor(m1);

        s = (m1 - m) * 60;

        System.out.println("28. " + q + "градусы" + m + "минуты" + s + "секунды");
    }
    // 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
    public static void task29() {
        double a = 14;
        double b = 15;
        double c = 17;

        double x;
        double y;
        double z;

        x = Math.acos((b * b + c * c - a * a ) / (2 * b * c));
        y = Math.acos( (a * a + c * c - b * b ) / (2 * a * c));
        z = 180 - x - y;
        System.out.println("29. " + x + " " + y + " " + z);
    }
    //30. Три сопротивлени R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
    public static void task30() {
        double r;
        double r1 = 2;
        double r2 = 3;
        double r3 = 4;

        r = 1 / (1 / r1 + 1 / r2 + 1 / r3);

        System.out.println("30. " + r);
    }
    //31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч,
    // скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.
    public static void task31() {

    }
    //32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?
    //33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
    // 34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.
    //35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
    //36. Найти частное произведений четных и нечетных цифр четырехзначного числа.
}
