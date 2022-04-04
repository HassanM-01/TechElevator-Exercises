package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnd3Test {

    @Test
    public void firstNumberIsLargestReturn11(){
        MaxEnd3 test = new MaxEnd3();
        int [] firstIsLargest = new int[] {11,4,6};
        int [] expected = {11,11,11};

        int [] actual = test.makeArray(firstIsLargest);

        Assert.assertArrayEquals(firstIsLargest,expected);
    }

    @Test
    public void secondNumberIsLargestReturn11(){
        MaxEnd3 test = new MaxEnd3();
        int [] secondIsLargest = new int[] {11,40,6};
        int [] expected = {11,11,11};

        int [] actual = test.makeArray(secondIsLargest);

        Assert.assertArrayEquals(secondIsLargest,expected);
    }

    @Test
    public void lastNumberIsLargestReturn11(){
        MaxEnd3 test = new MaxEnd3();
        int [] lastIsLargest = new int[] {10,4,11};
        int [] expected = {11,11,11};

        int [] actual = test.makeArray(lastIsLargest);

        Assert.assertArrayEquals(lastIsLargest,expected);
    }
}