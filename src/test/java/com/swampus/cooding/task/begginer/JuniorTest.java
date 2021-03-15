package com.swampus.cooding.task.begginer;

import com.swampus.cooding.task.begginer.Junior;
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
    public void addElementToLastPosition() {
        String[] arr = new String[]{"A", "B", ""};
        junior.setArr(arr);
        junior.addElementToLastPosition("C");
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