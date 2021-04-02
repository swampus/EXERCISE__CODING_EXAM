package com.swampus.cooding.task.advanced;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SeniorTest {

    private Senior senior = new Senior();

    @Test
    public void permutateString() {
        List<String> result = senior.permutateString("ABV");
        assertEquals(6, result.size());
        assertTrue(result.contains("ABV"));
        assertTrue(result.contains("AVB"));
        assertTrue(result.contains("VAB"));
        assertTrue(result.contains("VBA"));
        assertTrue(result.contains("BAV"));
        assertTrue(result.contains("BVA"));

        result = senior.permutateString("10");
        assertEquals(2, result.size());
        assertTrue(result.contains("10"));
        assertTrue(result.contains("01"));
    }

    @Test
    public void moonDistanceToEarth() {
        assertEquals(400000, senior.moonDistanceToEarth(0), 90000);
    }

    @Test
    public void task02() {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(0);
        list.add(1000);
        list.add(4);
        list.add(1000);
        list.add(0);
        list.add(4);
        list.add(0);
        list.add(0);
        list.add(4);
        list.add(33);
        list.add(47);
        list.add(1);
        list.add(500);
        list.add(500);
        list.add(321);
        list.add(1000);
        list.add(1000);
        list.add(4);

        assertEquals(4.031416, senior.task02(list), 0.000001);

    }

    @Test
    public void task03() {
        List<List<Integer>> res = senior.task03(3);
        assertEquals(3, res.size());
        assertEquals(new Integer(8), res.get(0).get(0));
        assertEquals(new Integer(16), res.get(0).get(1));
        assertEquals(2, res.get(0).size());

        assertEquals(new Integer(3), res.get(1).get(0));
        assertEquals(new Integer(5), res.get(1).get(1));
        assertEquals(new Integer(7), res.get(1).get(2));
        assertEquals(new Integer(4), res.get(1).get(3));
        assertEquals(4, res.get(1).size());

        assertEquals(new Integer(9), res.get(2).get(0));
        assertEquals(new Integer(2), res.get(2).get(1));
        assertEquals(2, res.get(2).size());
    }

    @Test
    public void calculatePNumber() {

        List<Integer> res = senior.calculatePNumber(2);
        assertEquals(2, res.size());
        assertEquals(new Integer(1), res.get(0));
        assertEquals(new Integer(4), res.get(1));

        res = senior.calculatePNumber(4);
        assertEquals(4, res.size());
        assertEquals(new Integer(1), res.get(0));
        assertEquals(new Integer(4), res.get(1));
        assertEquals(new Integer(1), res.get(2));
        assertEquals(new Integer(5), res.get(3));


        res = senior.calculatePNumber(6);
        assertEquals(6, res.size());
        assertEquals(new Integer(1), res.get(0));
        assertEquals(new Integer(4), res.get(1));
        assertEquals(new Integer(1), res.get(2));
        assertEquals(new Integer(5), res.get(3));
        assertEquals(new Integer(9), res.get(4));
        assertEquals(new Integer(2), res.get(5));
    }
}

