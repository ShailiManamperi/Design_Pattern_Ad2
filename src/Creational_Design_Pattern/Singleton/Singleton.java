package Creational_Design_Pattern.Singleton;

public class Singleton {
    public static void main(String[] args) {
        Singleton_Object s1 = Singleton_Object.getInstance();
        Singleton_Object s2 = Singleton_Object.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}


