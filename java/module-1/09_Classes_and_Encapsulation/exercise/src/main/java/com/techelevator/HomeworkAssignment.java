package com.techelevator;

public class HomeworkAssignment {
private int earnedMarks; //instance variables
private int possibleMarks;
private String submitterName;
private String letterGrade;

public String getLetterGrade() {   //method behind the madness

    if (((1.0* earnedMarks / possibleMarks) * 100) >= 90) {
        return "A";
    } else if (((1.0*earnedMarks / possibleMarks) * 100) >= 80) {
        return "B";
    } else if (((1.0*earnedMarks / possibleMarks) * 100) >= 70) {
        return "C";
    } else if (((1.0*earnedMarks / possibleMarks) * 100) >= 60) {
        return "D";
    } else return "F";
}


    public int getEarnedMarks() {
        return earnedMarks;
    }


    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }


    public String getSubmitterName() {
        return submitterName;
    }


    public int getPossibleMarks() {
        return possibleMarks;
        //constructor
    }

    public HomeworkAssignment (int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }
}
