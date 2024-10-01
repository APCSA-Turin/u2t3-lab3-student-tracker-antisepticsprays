package com.example.project;

public class Student {
    private String first;
    private String last;
    private int grad;
    private double accumulatedTestScores;
    private int testScoreCount;
    private double highestTestScore;
 
    public Student(String firstName, String lastName, int gradYear) {
        first = firstName;
        last = lastName;
        grad = gradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        return first;
    }
 
    // returns lastName
    public String getLastName() {
        return last;
    }
 
    public double getHighestTestScore() {
        return highestTestScore;
    }

    public int getTestScoreCount(){
        return testScoreCount;
    }

    public int getGradYear(){
        return grad;
    }
 
    public void setGradYear(int newGradYear) {
        grad = newGradYear;
    }
    
    public void addTestScore(double newTestScore) {
        accumulatedTestScores = accumulatedTestScores + newTestScore;
        testScoreCount = testScoreCount + 1;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }
 
    public boolean isPassing() {
        double average = accumulatedTestScores / testScoreCount;
        if (average >= 65) {
            return true;
        } else {
            return false;
        }
    }
 
    public double averageTestScore() {
        double average = accumulatedTestScores / testScoreCount;
        return average;
    }
 
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }