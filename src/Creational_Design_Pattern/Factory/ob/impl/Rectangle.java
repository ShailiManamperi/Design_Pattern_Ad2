package Creational_Design_Pattern.Factory.ob.impl;

import Creational_Design_Pattern.Factory.ob.Shape;


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is Rectangle shape");
    }
}
