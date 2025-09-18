package io.github.inigomurga.app;

public class App {
    public static void main(String[] args) {
        System.out.println(greet("Mundo"));
    }

    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hola";
        }
        return "Hola, " + name;
    }
}
