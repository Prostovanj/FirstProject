package com.company;

import java.util.Arrays;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        int nm=0;
        int []m = new int[23];
            for(int i=3;i<26;++i,++nm) m[nm] = i;

        System.out.println("Array m ="+Arrays.toString(m));
        nm=0;
        double []x = new double[15];
            for(int i=0;i<15;++i,++nm) x[nm] =((Math.random()*15)-6) ;

        System.out.println("Array x ="+Arrays.toString(x));

        double [][]n = new double [12][15];




    }
    }