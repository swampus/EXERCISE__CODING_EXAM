package com.swampus.cooding.task.begginer;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeveloperTest {
    private Developer developer = new Developer();

    @Test
    public void modifyArray() {
        String[] arr = {"abC", "def", "010", "gGg"};
        String[] res = developer.modifyArray(arr);
        assertEquals("ABC", res[0]);
        assertEquals("DEF", res[1]);
        assertEquals("010", res[2]);
        assertEquals("GGG", res[3]);
    }

    @Test
    public void howManyFivesInValues() {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("K1", 6);
        maps.put("K2", 5);
        maps.put("K3", 6);
        maps.put("K4", 5);
        maps.put("K5", 5);
        maps.put("K6", 1);
        maps.put("K7", 2);
        developer.setHolder(maps);
        assertEquals(3, developer.howManyFivesInValues());
    }

    @Test
    public void getFirstHalfOfArray() {
        String[] arr = {"abC", "def", "010", "gGg", "ccc"};
        String[] res = developer.getFirstHalfOfArray(arr);

        assertEquals("abC", res[0]);
        assertEquals("def", res[1]);
        assertEquals("010", res[2]);
        assertEquals(3, res.length);

        arr = new String[]{"abC", "def"};
        res = developer.getFirstHalfOfArray(arr);
        assertEquals("abC", res[0]);
        assertEquals(1, res.length);
    }

    @Test
    public void getLongestStringSizeFromParams() {
        assertEquals(4, developer.getLongestStringSizeFromParams("123", "12", "1234"));
        assertEquals(3, developer.getLongestStringSizeFromParams("123", null, "123"));
        assertEquals(5, developer.getLongestStringSizeFromParams("12345", null, "1"));
        assertEquals(1, developer.getLongestStringSizeFromParams(null, null, "1"));
        assertEquals(0, developer.getLongestStringSizeFromParams(null, null, null));
    }

    @Test
    public void getSetOnePlusUniqueNumbersFromSetTwo() {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(11);
        set.add(2);
        set.add(4);

        developer.setNumbers(set);

        Set<String> setTwo = new HashSet<>();
        setTwo.add("5");
        setTwo.add("3");
        setTwo.add("2");
        setTwo.add("1");

        developer.getSetOnePlusUniqueNumbersFromSetTwo(setTwo);
        assertEquals(6, set.size());
        assertTrue(set.contains(5));
        assertTrue(set.contains(11));
        assertTrue(set.contains(2));
        assertTrue(set.contains(4));
        assertTrue(set.contains(1));
        assertTrue(set.contains(3));
    }
}