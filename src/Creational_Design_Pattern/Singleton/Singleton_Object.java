package Creational_Design_Pattern.Singleton;

public class Singleton_Object {
    //Private Static Instance
    private static Singleton_Object instance;

    //Private Constructor
    private Singleton_Object() {
        System.out.println("Making a object.");
    }

    //Public Static method to get instance
    public static Singleton_Object getInstance() {
        return instance == null ? instance = new Singleton_Object() : instance;
    }
}
