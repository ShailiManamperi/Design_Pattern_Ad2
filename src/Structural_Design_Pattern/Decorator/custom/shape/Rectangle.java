package Structural_Design_Pattern.Decorator.custom.shape;

import Structural_Design_Pattern.Decorator.custom.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle shape draw");
    }
}
