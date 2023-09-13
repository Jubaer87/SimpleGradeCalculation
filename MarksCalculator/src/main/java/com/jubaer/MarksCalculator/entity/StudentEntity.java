package com.jubaer.MarksCalculator.entity;


//This is a simple project where we can calculate three marks of a student. No HTML or CSS is implemented here.
//Input example 50, 75, 65 where you can test if a student has passed or not. And average passed mark is 50
//example student is passed.



public class StudentEntity {

//	Variables
    private int markOne;
    private int markTwo;
    private int markThree;

    // Constructor with default values
    public StudentEntity() {
        this.markOne = 0;
        this.markTwo = 0;
        this.markThree = 0;
    }
    
    
//  Getter and Setter methods
    public int getMarkOne() {
        return markOne;
    }

    public void setMarkOne(int markOne) {
        this.markOne = markOne;
    }

    public int getMarkTwo() {
        return markTwo;
    }

    public void setMarkTwo(int markTwo) {
        this.markTwo = markTwo;
    }

    public int getMarkThree() {
        return markThree;
    }

    public void setMarkThree(int markThree) {
        this.markThree = markThree;
    }

    public int getTotal() {
        return markOne + markTwo + markThree;
    }

    public double getAvg() {
        return (double) (markOne + markTwo + markThree) / 3;
    }

//  Checking weather a student is passed or not based on average value
    public String getGrade() {
        String grade;
        double avg = getAvg();

        if (avg >= 50) {
            grade = "pass";
        } else {
            grade = "fail";
        }

        return grade;
    }
}
