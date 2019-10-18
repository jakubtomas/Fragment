package com.company;

public class Rectangle {
    private int a ;
    private int b ;
    private String character ;
    private boolean fill;


    public Rectangle(int a, int b) { //
        this.a = a;
        this.b = b;
        character = "=";
    }

    public void  setCharacter(String character) {
        this.character = character;
    }

    public void setFill(boolean fill) {
        this.fill= fill;
    }

    //
    public int calcArea() {
        return a*b;
    }

    // obvod
    public int calcPerimeter() {
        return   2*a + 2*b;
    }


    public double calcDiagonale() { // uhlopriecka pytagorova veta


        return Math.sqrt(a*a+b*b);
    }

    public void showRectangle() {
        // 10
        for (int x = 1; x <= this.b; x++) {
            System.out.println();
            for (int y = 1 ; y <= this.a; y++) {
                System.out.print(character);
            }
        }
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return "Reactangle :a = " + a + "b" + b;
    }


}
