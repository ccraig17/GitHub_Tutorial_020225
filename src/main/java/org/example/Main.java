package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        sayHello();
        System.out.println(addNumbers(3,3));
    }

    public static void sayHello(){
        System.out.println("Hi from Craig!");
    }
    public static int addNumbers(int num1, int num2){
        return num1 + num2;
    }

}