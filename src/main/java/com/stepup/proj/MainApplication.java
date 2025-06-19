package com.stepup.proj;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Привет, мир!");
        System.out.println("12345678");
        System.out.println("new_feature"); //выкат не в ближайшую поставку
    }
    public static void DoSomething() {
        int a;
        a = 5;
        String b;
        b = "строчка_кода";
        System.out.println(a+b);
        System.out.println(a++);
        System.out.println(94%5);
    }
}
