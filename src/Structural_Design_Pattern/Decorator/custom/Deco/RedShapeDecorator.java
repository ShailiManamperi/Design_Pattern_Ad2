package Structural_Design_Pattern.Decorator.custom.Deco;

import Structural_Design_Pattern.Decorator.custom.Shape;

public class RedShapeDecorator extends ShapeDecorate {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Within Red Shape Decorator");
    }

    public void setRed(){
        System.out.println("Convert to red color");
    }

}