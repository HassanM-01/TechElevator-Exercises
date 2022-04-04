package com.techelevator;

import org.junit.*;

import static org.junit.Assert.*;

public class GradeBookTest {

    GradeBook gradeBook;

    @Before
    public void before() throws Exception {
        System.out.println("Setting up our test");
        GradeBook gradeBook = new GradeBook();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing test down");
    }

    @Test
    public void aScoreOf90ShouldReturnA(){
        //Arrange
        int ninetyScore = 90;
        GradeBook gradeBook = new GradeBook();
        String expected = "A";
        //Act
        String actual = gradeBook.calculateLetterGrade(ninetyScore);
        //Assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void aScoreOf59ShouldFail(){
        int failScore=59;
        GradeBook gradeBook = new GradeBook();
        String expected = "F";

        String actual = gradeBook.calculateLetterGrade(failScore);

        Assert.assertEquals(expected,actual);
    }

@Test
    public void userInvalidEntry(){
        int invalidScore = -3;
    GradeBook gradeBook = new GradeBook();
        String expected = "Invalid entry";

        String actual = gradeBook.calculateLetterGrade(invalidScore);

        Assert.assertEquals(expected,actual);
}


}