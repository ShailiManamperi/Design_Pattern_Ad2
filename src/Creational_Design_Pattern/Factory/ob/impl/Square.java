package Creational_Design_Pattern.Factory.ob.impl;

import Creational_Design_Pattern.Factory.ob.Shape;


public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("This is Square shape");
    }
}
