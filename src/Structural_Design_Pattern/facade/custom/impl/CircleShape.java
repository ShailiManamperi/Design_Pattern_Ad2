package Structural_Design_Pattern.facade.custom.impl;

import Structural_Design_Pattern.facade.custom.Circle;

public class CircleShape implements Circle {
    @Override
    public void run() {
        System.out.println("Circle shape is running");
    }
}
