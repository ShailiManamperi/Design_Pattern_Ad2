package Creational_Design_Pattern.Factory;

import Creational_Design_Pattern.Factory.ob.Shape;
import Creational_Design_Pattern.Factory.ob.impl.Circle;
import Creational_Design_Pattern.Factory.ob.impl.Rectangle;
import Creational_Design_Pattern.Factory.ob.impl.Square;

public class Shape_Factory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }else{
            if( shapeType.equalsIgnoreCase("CIRCLE")){
                return new Circle();
            }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();
            }else if(shapeType.equalsIgnoreCase("SQUARE")){
                return new Square();
            }
        }
        return null;
    }
}
