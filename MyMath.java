package com.company;

public class MyMath {

    // matematicka operacie  //
    public Fragment add(Fragment a, Fragment b) { // vlozim cislo
        // vratime zlomok
        Fragment result = null;


        result = new Fragment(a.getNumerator() * b.getNumerator() + a.getDenominator() * b.getNumerator()
                , a.getDenominator() * b.getDenominator());


        result.changeToBasicShape();

        return  result;


    }
        // odcitanie   // znamena ze nepotrebuje volat cez objekt
    public static Fragment sub(Fragment a, Fragment b) { // vlozim cislo
        // vratime zlomok
        Fragment result = null;


        result = new Fragment(a.getNumerator() * b.getNumerator() - a.getDenominator() * b.getNumerator()
                , a.getDenominator() * b.getDenominator());


        result.changeToBasicShape();

        return  result;


    }

    public Fragment mul(Fragment a, Fragment b) { // vlozim cislo
        // vratime zlomok
        Fragment result = null;


        result = new Fragment(a.getNumerator() * b.getNumerator(),
                a.getDenominator()*a.getDenominator());


        result.changeToBasicShape();

        return  result;


    }

    public Fragment dev(Fragment a, Fragment b) { // vlozim cislo
        // vratime zlomok
        Fragment result = null;


        result = new Fragment(a.getNumerator() * b.getDenominator(),
                a.getDenominator()*a.getNumerator());


        result.changeToBasicShape();

        return  result;


    }
    // pomyloformyzmus  1 metoda ma viac tvarov
    public Fragment mull(int number, Fragment a , Fragment b) {
        Fragment result = null;


        result = new Fragment(a.getNumerator() * number , a.getDenominator());


        result.changeToBasicShape();

        return  result;
    }

    public Fragment add(Fragment a, int value) {
        Fragment temp = new Fragment(value,1);
        return add(temp,a);
    }



}
