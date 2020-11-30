package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor();


        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor();

        Assert.assertTrue( instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student();
        Instructor instructor = new Instructor();
        Double expected = 30.0;

        instructor.teach(student, expected);

        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture(){
        Student Jake = new Student();
        Student Ty = new Student();
        Student[] students = {Ty, Jake};
        Double numOfHours = 20.0;
        Double expected = 10.0;

        Instructor instructor = new Instructor();

        instructor.lecture(students, numOfHours);
        Double actualTy = Ty.getTotalStudyTime();
        Double actualJake = Jake.getTotalStudyTime();
        Assert.assertEquals(expected, actualJake);
        Assert.assertEquals(expected, actualTy);

    }
}
