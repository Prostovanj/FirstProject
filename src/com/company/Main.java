package com.company;

import java.util.Arrays;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        int nmbr=0;
        int []m = new int[12];
        for(int i=3;i<26;++i,++i,++nmbr) m[nmbr] = i;

        System.out.println("Array m ="+Arrays.toString(m));


        nmbr=0;
        double []x = new double[15];
        for(int i=0;i<15;++i,++nmbr) x[nmbr] =((random()*15)-6) ;

        System.out.println("Array x ="+Arrays.toString(x));


        int stroka=0;
        int stolbec;
        double [][]n = new double [12][15];

        while(stroka<12) {
            stolbec=0;
            while (stolbec < 15){

                if (m[stroka] == 19) {
                    n[stroka][stolbec] = (
                        //первая формула
                        pow((atan(0.2*(x[stolbec]+1)/14)),0.25/(asin(pow(Math.E,(abs(-x[stolbec])))))-1)

                    );
                }



                    else if (m[stroka] == 11) {
                    //вот тут я хз как сравнить с несколькими числами

                        n[stroka][stolbec] = (
                            //вторая формула

                           cos(cos(pow(x[stolbec],1.0/3)))
                        //тут тоже корень 3 степени вроде бы так но я не уверен

                        );

                    }
                        else {
                            n[stroka][stolbec] = (33

                                //третья формула

                            );
                        }
            ++stolbec;
            }

        ++stroka;
        }

        System.out.println("Array n :");
        stroka=0;
        while(stroka<12) {
            stolbec=0;
            while (stolbec < 15) {
                System.out.print(stolbec+"/"+stroka+" = "+ n[stroka][stolbec]+" | ");
                ++stolbec;
                if(stolbec==15){
                    System.out.println(" ");
                }
            }
        ++stroka;
        }
    }




    }
