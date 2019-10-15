package com.company;

public class Main {

    public static void main(String[] args) {

        Fragment fragment = new Fragment(32,48);

        System.out.println(fragment.getRealValue());


        System.out.println(fragment.toString());

        fragment.changeToBasicShape();
        System.out.println(fragment.toString());

        Fragment fragment1 = new Fragment(7, 28);

        System.out.println(fragment1.toString());




    }
}
