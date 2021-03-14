package com.swampus.cooding.begginer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JuniorTest {

    private Junior junior = new Junior();

    @Test
    public void getThePhrase() {
        assertEquals("Hello Exam", junior.getThePhrase());
    }

    @Test
    public void increaseField() {
        Integer field = 5;
        junior.setValueField(field);
        junior.increaseField();
        assertEquals(new Integer(10), junior.getValueField());
    }

    @Test
    public void addElementToEnd() {
        String arr[] = {"A", "B"};
        junior.setArr(arr);
        junior.addElementToEnd("C");
        assertEquals("C", junior.getArr()[2]);
    }

    @Test
    public void findTheDifference() {
        assertEquals(3, junior.findTheDifference(11, 8));
    }

    @Test
    public void getElementCountInFieldArray() {
        String arr[] = {"A", "B", "D", "E"};
        junior.setArr(arr);
        assertEquals(4, junior.getElementCountInFieldArray());
    }
}