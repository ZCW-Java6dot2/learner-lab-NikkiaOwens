package io.zipcoder.interfaces;

public class Instructor extends Person implements  Teacher{


    public Instructor(String name) {
        this.name = name;
    }
    public Instructor(){

    }

    // invokes the learn method on the specified Student object.
    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    //invokes the learn method on each of the elements in the specified array of Student objects.
    //numberOfHours should be evenly split amongst the students.
    //double numberOfHoursPerStudent = numberOfHours / students.length;
    public void lecture(Student[] students, double numberOfHours) {
        double hoursPerStudent = numberOfHours / students.length;

        for( Student student: students){
            student.learn(hoursPerStudent);
        }
    }
}
