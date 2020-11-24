package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void instanceLearnerTest(){
        //Given
        Student student = new Student();
        //When

        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void inheritanceTest(){
        //Given
        Student student = new Student();
        Person person = new Person();
        //When

        //Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest(){
        //Given
        Student student = new Student();
        //Person person = new Person();
        Double expected = 10.0;
        //When
        student.learn(expected);
        Double actual = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
