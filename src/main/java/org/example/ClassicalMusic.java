package org.example;

public class ClassicalMusic implements Music {
    private ClassicalMusic () {} //чтобы нельзя было создать объект через new
    public static ClassicalMusic getClassicalMusic () {
        return new ClassicalMusic();
    }
    public void doMyInit () {
        System.out.println("Doing my initializaition");
    }
    public void doMyDestroy () {
        System.out.println("Doing my destraction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";

    }
}
