package Structural_Design_Pattern.facade;

import Structural_Design_Pattern.facade.custom.impl.CircleShape;
import Structural_Design_Pattern.facade.custom.impl.RectangleShape;

import java.util.ArrayList;

public class ShapeRunner {
    public static void main(String[] args) {
        ArrayList<SuperShape> objects = new ArrayList<>();
        objects.add(new RectangleShape());
        objects.add(new CircleShape());

        for (SuperShape object : objects) {
            object.run();
        }
    }
}
