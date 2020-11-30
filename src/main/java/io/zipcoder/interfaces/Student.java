package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    double totalStudyTime;

    public Student(String name) {
        this.name = name;
    }

    public Student(){}

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
