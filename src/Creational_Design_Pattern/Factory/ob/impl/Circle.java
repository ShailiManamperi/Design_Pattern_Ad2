package Creational_Design_Pattern.Factory.ob.impl;

import Creational_Design_Pattern.Factory.ob.Shape;
import com.sun.prism.ps.Shader;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is Circle Shape");
    }
}
