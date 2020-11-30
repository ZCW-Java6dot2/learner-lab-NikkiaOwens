package io.zipcoder.interfaces;

import org.junit.Test;

public class ClassRoomTest {

    @Test
    public void getRosterTest(){

        ClassRoom classroom = new ClassRoom();

        classroom.getRoster();
        System.out.println(classroom.getRoster());
    }
}
