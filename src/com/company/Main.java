package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double X = in.nextDouble();
        System.out.println(MyLog(X));
        System.out.println(Math.log(1 - X));
        System.out.println(Math.log(1 - X) == MyLog(X));
    }
    public static double MyLog(double X)
    {
        double summ = 0;
        int tochnost = 1000;
        for (int i = 1; i <= tochnost; i++)
        {
            summ -= 1.0 * Pow(X, i) / i;
        }
        return summ;
    }
    private static double Pow(double num, double stepen)
    {
        double proiz = 1.0;
        for (int i = 1; i <= stepen; i++)
        {
            proiz *= num;
        }
        return proiz;
    }
}
