package com.techelevator;

public class SquareWall extends RectangleWall{
    private int sideLength;

    public SquareWall(String name, String color, int length, int height) {
        super(name, color, length, height);
    }

    public SquareWall(String name, String color, int sideLength){
        super(name,color);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public int getArea() {
        return sideLength * sideLength;
    }

    public String toString(){

        return getName() + " (" + Integer.parseInt(String.valueOf(getSideLength())) + "x"
                + Integer.parseInt(String.valueOf(getSideLength())) + ") square";
    }

    //found myself repeating the toString method a lot but wasn't sure if I should make it an
    //abstract method through the wall class, i tried to keep the code as DRY as possible without
    //going outside the guidelines!

}
