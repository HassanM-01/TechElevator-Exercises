package com.techelevator;

public class TechElevatorStudent {
    String name;
    String position;
    int tenure;

    public void teach() {
        Lecture myLecture = new Lecture();

        myLecture.lectureTopic = "Objects & Classes";
        myLecture.lectureDurationInMinutes = 90;
    }
}
