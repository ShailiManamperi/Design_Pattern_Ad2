package Creational_Design_Pattern.Factory;

import Creational_Design_Pattern.Factory.ob.Shape;



public class Factory {
    public static void main(String[] args) {
        Shape_Factory shapeFactory= new Shape_Factory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}
