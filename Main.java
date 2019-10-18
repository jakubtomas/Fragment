package com.company;

public class Main {

    public static void main(String[] args) {

        Fragment fragment = new Fragment(32,48);

        Fragment fragment1 = new Fragment(7, 28);
        System.out.println(fragment.getRealValue());


        System.out.println(fragment.toString());

        fragment.changeToBasicShape();
        System.out.println(fragment.toString());


        System.out.println(fragment1.toString());


        MyMath myMath = new MyMath();
        System.out.println(myMath.add(fragment,fragment1));

        System.out.println("==================================");
        Rectangle myrectangle = new Rectangle(10, 4);
        System.out.println(myrectangle.calcDiagonale());
        System.out.println(myrectangle.calcPerimeter());
        System.out.println(myrectangle.calcArea());
        myrectangle.showRectangle();


    }
}
