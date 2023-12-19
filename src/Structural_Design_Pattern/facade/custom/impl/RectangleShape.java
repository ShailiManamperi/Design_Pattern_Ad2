package Structural_Design_Pattern.facade.custom.impl;

import Structural_Design_Pattern.facade.custom.Rectangle;

public class RectangleShape implements Rectangle {
    @Override
    public void run() {
        System.out.println("Rectangle shape is running");
    }
}
