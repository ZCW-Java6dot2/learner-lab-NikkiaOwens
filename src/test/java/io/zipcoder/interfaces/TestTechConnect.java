package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestTechConnect {


    @Test
    public void testRemoveStudents(){
        TechConnect techConnect = new TechConnect();

        techConnect.removeStudents();

        Assert.assertTrue(techConnect.getStudents().isEmpty());
    }

    @Test
    public void testRecruitStudents(){
        TechConnect techConnect2 = new TechConnect();



        Assert.assertFalse(techConnect2.getStudents().isEmpty());
    }
}
