package com.company;

public class MixedNumber {

    private int number;

    private Fragment  fragment;  // to bude objekt


    public MixedNumber(int number, Fragment fragment) {
        this.number = number;
        this.fragment = fragment;

    }

    public MixedNumber(int number, int numerator, int denominator) {
        this.number = number;
        this.fragment = new Fragment(numerator, denominator);

    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }


    @Override
    public String toString() {
        return number + "/" + fragment.toString();
    }


    public void coverToFragment() {  /// zmiesane na cislo
        Fragment newFragment = new Fragment(4, 5);

        // number*fragment.getDenominator()+fragment.getNumerator();


    }


    public double gerRealValue() {
        return number+fragment.getRealValue();
    }
}
