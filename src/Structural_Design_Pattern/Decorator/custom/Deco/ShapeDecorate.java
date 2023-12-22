package Structural_Design_Pattern.Decorator.custom.Deco;

import Structural_Design_Pattern.Decorator.custom.Shape;

public class ShapeDecorate implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorate(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
