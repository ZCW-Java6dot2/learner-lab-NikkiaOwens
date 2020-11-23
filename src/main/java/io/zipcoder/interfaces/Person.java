package io.zipcoder.interfaces;

public class Person {

    String name;
    public Person(String name){
        this.name = name;
    }

    public Person() {

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
