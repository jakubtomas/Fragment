package com.company;

public class Fragment {
    private int numerator;
    private int denominator;


    public Fragment(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public Fragment (Fragment otherFragment) { // spososobuje
        numerator = otherFragment.getNumerator();
        denominator = otherFragment.getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // private znamena
    private int getTheLargestCommonDivisor() {

        // absolutne hodnoty

        int absNumerator = Math.abs(numerator);
        int absDenominator = Math.abs(denominator);

        int  commonDivisor =  absNumerator < absDenominator  ? absNumerator : absDenominator;  // ternarny operator
        while(absNumerator % commonDivisor != 0  || absDenominator % commonDivisor != 0){
            commonDivisor --;

        }

        return commonDivisor;
    }


    public void changeToBasicShape() {
            // jedna metoda roby iba jednu vec


    }

    public void extendFragment(int value) {
            /// vynasoby citatela aj menovatel value

    }

    public double getRealValue() {
        return (double)this.numerator/this.denominator;
    }

    public void reverse() { // vymenit citatela a menatela
        int temp = this.numerator;
        this.numerator= this.denominator;
        this.denominator = temp;
    }

    public void oposite() {
        this.numerator = this.numerator + (-1);
    }

    public void Fragmantcopy() {
      // Fragment  newFragment = new Fragment( numerator, denominator);
      // return   newFragment;
    }


    // metoda ktora zisti či je zlomok v zakladnom tavare

    public boolean isFragmentInBasicShape() {
        // najvacsi spolocny delitel je jedna
        if (getTheLargestCommonDivisor() == 1) {
            return true;
        } else {
            return false;
        }

    }
    // dolezita casto pouzivana
    @Override
    public String toString() {

        return this.numerator + "/" + this.denominator;

    }
// triedu , konstruktor , ,get eri setery ,,
    // cislo a zlomok
    // prima cisla

    public MixedNumber getMixedNumber() {  //
        int value  = numerator / denominator;
        Fragment f = new Fragment(numerator%denominator, denominator);

        return  new MixedNumber(value,f);//
    }

}
