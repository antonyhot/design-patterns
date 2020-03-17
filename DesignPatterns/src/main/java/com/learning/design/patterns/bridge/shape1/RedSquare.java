package com.learning.design.patterns.bridge.shape1;

public class RedSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
