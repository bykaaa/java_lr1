package ru.rsatu.lr1;

public class HelloWorld {
    static String Hello = "Hello ";
    public static void printHello(String name) {
        System.out.println(Hello+name+"!");
    }

    public void helloDynamic(String name) {
        System.out.println("Dynamic Hello "+name+"!!!");
    }
}