package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Integer expectedHeight = Integer.MAX_VALUE;
        String expectedFavFood = "";
        boolean expectedMaritalStatus = false;
        Integer expectedNumberOfKids = Integer.MAX_VALUE;
        String expectedCity = "";

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Integer actualHeight = person.getHeight();
        String actualFavFood = person.getFavFood();
        boolean actualMaritalStatus = person.getMaritalStatus();
        Integer actualNumberOfKids = person.getNumberOfKids();
        String actualCity = person.getCity();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedFavFood, actualFavFood);
        Assert.assertEquals(expectedMaritalStatus, actualMaritalStatus);
        Assert.assertEquals(expectedNumberOfKids, actualNumberOfKids);
        Assert.assertEquals(expectedCity, actualCity);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 32;

        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFaveFood() {
        // Given
        Person person = new Person();
        String expected = "Rice and Beans";

        // When
         person.setFavFood(expected);

        // Then
        String actual = person.getFavFood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetMaritalStatus() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setMaritalStatus(expected);

        // Then
        boolean actual = person.getMaritalStatus();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfKids() {
        // Given
        Person person = new Person();
        Integer expected = 3;

        // When
        person.setNumberOfKids(expected);

        // Then
        Integer actual = person.getNumberOfKids();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetCity() {
        // Given
        Person person = new Person();
        String expected = "Accra";

        // When
        person.setCity(expected);

        // Then
        String actual = person.getCity();
        Assert.assertEquals(expected, actual);
    }
}
