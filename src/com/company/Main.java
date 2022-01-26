package com.company;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        int[] m = new int[12];
        for (int i = 0; i < 12; i++) m[i] = (i*2)+3;
        System.out.print("Array m: ");
        for (int i = 0; i < 12; i++) System.out.print(m[i] + " | ");
        double[] x = new double[15];
        for (int i = 0; i < 15; i++) x[i] = ((random() * 15) - 6);
        System.out.print("\nArray x: ");
        for (int i = 0; i < 15; i++) System.out.printf("%.3f | ", x[i]);
        double[][] n = new double[12][15];
        int line = 0;
        int column;
        while (line < 12) {
            column = 0;
            while (column < 15) {
                if (m[line] == 19) {
                    double firstCalc = ((atan(0.2 * (x[column] + 1) / 14)));
                    double power = (0.25 / ((asin(pow(Math.E, -(abs(x[column]))))) - 1));
                    double result = (pow(firstCalc, power));
                    n[line][column] = (result);
                } else if (m[line] == 5 || m[line] == 9 || m[line] == 11 || m[line] == 13 || m[line] == 17 || m[line] == 23) {
                    double result = cos(cos(pow(x[column], 1.0 / 3)));
                    n[line][column] = (result);
                } else {
                    double firstCalc = (pow(pow((x[column]), ((x[column]) - (3.0 / 4.0))), (1.0 / 3)));
                    double secondCalc = (0.25 - pow(firstCalc, 3 + (cos(pow(x[column], 1.0 / 3)))));
                    double power = (asin(E * pow(pow(-(4 / (abs(x[column]))), x[column]), 1.0 / 3)));
                    double result;
                    result = (pow(secondCalc, power));
                    n[line][column] = (result);
                }
                column++;
            }
            line++;
        }
        System.out.println("\nArray n :");
        line = 0;
        String error = ("ERR");
        while (line < 12) {
            column = 0;
            while (column < 15) {
                if (Double.isNaN(n[line][column])) {
                    System.out.printf("%2d/%2d = %8s | ", column, line, error);
                } else {
                    System.out.printf("%2d/%2d = %8.4f | ", column, line, n[line][column]);
                }
                column++;
                if (column == 15) {
                    System.out.println();
                }
            }
            line++;
        }
    }
}
