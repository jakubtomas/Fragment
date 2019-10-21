package com.company;

import com.sun.source.tree.TryTree;

public class Bank {

    private String name;

    public Bank(String name) {
        this.name = name;
    }


    public double convert(double amount, String code) {
        double value = 0 ;
        if (code == "TRY") {
            value = amount * 6.44;
        } else if (code == "HUF") {
            value = amount * 330.62;
        } else if (code == "CHF") {
            value = amount * 1.10;
        } else if (code == "HRK") {
            value  =  amount * 7.44;
        } else if (code == "GBP") {
            value = amount * 0.8644;
        } else {
            value = -1;
        }

        return value;
    }

    public static double loan(double value, double interest, int months) {
        double total = 0;

        if (value <= 0 || interest <= 0 || months <= 0) {
            total = -1;
        } else {
            total  = (value * interest)/100; // vypocet iba uroku
            total = total + value;        // pripocitanie uroku k pozicke
            total = total/ months ; // vypocet messacnej splatky
        }
        return total ;
    }


    /*
    *

public static double loan (double value, double interest, int months) {
   // doplnit kod
}
metoda vypocita vypocita vysku mesacnej splatky
(suma sa navysi o urok a vydeli sa poctom splatok)
pri nespravnom vstupe, ak nejake cislo bude zaporne alebo 0, vrati metoda -1

priklad:
loan(1000, 4.5 , 20 ) vrati 52.25

loan(6000, 2.8 , -36) vrati -1
GIT, GIT, GIT ...vsetko ulozit alebo ulozikt ako na git
    * */

}
