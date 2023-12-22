package Structural_Design_Pattern.Decorator;

import Structural_Design_Pattern.Decorator.custom.Deco.RedShapeDecorator;
import Structural_Design_Pattern.Decorator.custom.Deco.ShapeDecorate;
import Structural_Design_Pattern.Decorator.custom.Shape;
import Structural_Design_Pattern.Decorator.custom.shape.Cricle;
import Structural_Design_Pattern.Decorator.custom.shape.Rectangle;
import Structural_Design_Pattern.facade.custom.Circle;

public class Main {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        Shape shape1 = new RedShapeDecorator(new Cricle());

        shape1.draw();

        cricle.draw();

        Shape shape2 = new ShapeDecorate(new Rectangle());

        shape2.draw();

    }
}
