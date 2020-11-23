package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testSetName(){
        //Given
        Person person = new Person();
        String expected = "Nikkia";

        //When
        person.setName(expected);
        String actual = person.getName();
        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void testConstructor(){
        //Given
        String expected = "Owens";

        //When
        Person person = new Person(expected);
        String actual = person.getName();

        //Then

        Assert.assertEquals(expected, actual);
    }

//    //Given
//    String[] numberArray = {"1", "5", "15", "9", "4"};
//    String[] expected = {"1", "4", "5", "9", "15"};
//    //When
//        flower.sort(numberArray);
//
//    //Then
//    assertArrayEquals(expected, numberArray);

}
