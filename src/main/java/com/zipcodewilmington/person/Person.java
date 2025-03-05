package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
//    private int height;
//    private String favFood;
//    private boolean maritalStatus;
//    private int numberOfKids;
//    private String city;


//    public Person(String name, int age, int height,String favFood, boolean maritalStatus, int numberOfKids, String city){
    public Person(){
        name =  this.name;
       age = this.age;
//        this.height = height;
//        this.favFood = favFood;
//        this.maritalStatus = maritalStatus;
//        this.numberOfKids = numberOfKids;
//        this.city = city;
    }



    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
