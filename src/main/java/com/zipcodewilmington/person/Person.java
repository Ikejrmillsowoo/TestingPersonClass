package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;
    private int height = Integer.MAX_VALUE;
    private String favFood = "";
    private boolean maritalStatus;
    private int numberOfKids = Integer.MAX_VALUE;
    private String city = "";



    public Person(){
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

    public Person(String name, int age, int height, String favFood, boolean maritalStatus, int numberOfKids, String city) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.favFood = favFood;
        this.maritalStatus = maritalStatus;
        this. numberOfKids = numberOfKids;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
    public int getHeight() {
        return this.height;
    }

    public String getFavFood() {
        return this.favFood;
    }
    public boolean getMaritalStatus() {
        return this.maritalStatus;
    }

    public Integer getNumberOfKids() {
        return this.numberOfKids;
    }
    public String getCity() {
        return this.city;
    }

}
