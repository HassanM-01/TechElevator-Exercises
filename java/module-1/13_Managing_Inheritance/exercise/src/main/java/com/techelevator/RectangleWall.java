package com.techelevator;

public class RectangleWall extends Wall {

    private int length;
    private int height;

    public RectangleWall(String name, String color, int length, int height){
        super(name, color);
        this.length = length;
        this.height = height;
    }

    public RectangleWall(String name, String color) {
    super(name, color);
    }


    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        int measurements= length * height;
        return  measurements;
    }

    public String toString(){

        return getName() + " (" + Integer.parseInt(String.valueOf(getLength())) + "x"
                + Integer.parseInt(String.valueOf(getHeight())) + ") rectangle";
    }

}
