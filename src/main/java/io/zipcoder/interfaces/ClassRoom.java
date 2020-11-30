package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {


    TechConnect techConnect = new TechConnect();
    ArrayList<Student> students = techConnect.getStudents();

    ArrayList<Instructor> instructors = ZipCodeWilmington.getInstructors();

    public HashMap<String, Person> getRoster() {
        Integer lengthOfHashmap = students.size() + instructors.size()  ;
        HashMap<String, Person> people = new HashMap<String, Person>(lengthOfHashmap);

        for (int i = 0; i < lengthOfHashmap; i++) {
            //System.out.println(students.get(i).name);
//            if (i < students.size()) {

                if(i < students.size()-1){
                    int j = 0;
            people.put(instructors.get(j).name, instructors.get(j));
                j++;} else
                    people.put(students.get(i).name, students.get(i));
//            } else
//                for (int j = 0; j < instructors.size(); j++) {
//                    people.put(instructors.get(j).name, instructors.get(j));
//
//                }


        }
        System.out.println(people);
        return people;
    }
}

