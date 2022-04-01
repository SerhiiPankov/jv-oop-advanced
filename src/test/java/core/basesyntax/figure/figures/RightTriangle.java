package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;

import java.util.Random;

public class RightTriangle extends Figure {
    private final Random random = new Random();
    private int side;

    public RightTriangle(String name, String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Right Triangle, Color: " + getColor() + ", Side: " + side + ", Area: " + getArea() + ".");
    }
}
