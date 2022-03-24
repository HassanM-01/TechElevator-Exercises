package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {

    @Test
    public void enterBa2xReturnBaBa(){
        WordCount test = new WordCount();
        String [] arrayWithBa2x = new String []{"ba", "ba", "black", "sheep"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba",2);
        expected.put("black",1);
        expected.put("sheep",1);

        Map<String, Integer> actual = test.getCount(arrayWithBa2x);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void enterA2xReturnA2(){
        WordCount test = new WordCount();
        String [] arrayWithA2x = new String []{"a", "a", "b", "c"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a",2);
        expected.put("b",1);
        expected.put("c",1);

        Map<String, Integer> actual = test.getCount(arrayWithA2x);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void enterEmptyReturnEmpty(){
        WordCount test = new WordCount();
        String [] arrayEmpty = new String []{};
        Map<String, Integer> expected = new HashMap<>();


        Map<String, Integer> actual = test.getCount(arrayEmpty);

        Assert.assertEquals(expected,actual);

    }

}