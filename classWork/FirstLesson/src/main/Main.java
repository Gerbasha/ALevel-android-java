package main;

public class Main {
    public static void main(String[] args) {
        byte a = 100;
        byte b = -50;
        int c = a + b;
        float d = 2.2f;
        float e = 3.5f;
        System.out.println("Hello, world!");
        System.out.println(c + ";");
        System.out.println("Result " + (d*e) + ";");
        System.out.println("\u0044");
        //матиматические операции приводятся к int
    }
}