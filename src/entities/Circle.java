package entities;

import entities.enums.Color;

public class Circle extends Shape{
    private Double radius;

    public Circle(){
        super();
    }

    public Circle(Color color, Double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area(){
        Double PI = 3.1415;
        return PI * Math.pow(radius, 2);
    }
}
