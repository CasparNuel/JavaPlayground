/*
This program illustrates the differences
between the datatypes int and double.

This file is called Example3.java
 */

class Example3 {
    public static void main(String args[]) {
        int var;
        double x;

        var = 10;

        x = 10.0;

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println("We will now divide both by 4");

        var = var / 4;
        x = x / 4;

        System.out.println("var after division: " + var);
        System.out.println("X after division: " + x);
    }
}