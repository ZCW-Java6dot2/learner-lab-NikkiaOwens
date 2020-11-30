package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipcodeWilmington {

//    @Before
//    public void setup(){
//        ZipCodeWilmington.fireStaff();
//    }

    @Test
    public void testFireStaff(){
        ZipCodeWilmington zip1 =  new ZipCodeWilmington();
        zip1.fireStaff();
        Assert.assertTrue(zip1.getInstructors().isEmpty());
    }

    @Test
    public void testHireStaff(){
        ZipCodeWilmington zip2 =  new ZipCodeWilmington();
        Assert.assertFalse(zip2.getInstructors().isEmpty());
    }
}
