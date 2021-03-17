package com.swampus.cooding.task.begginer;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SeniorTest {

    private Senior senior = new Senior();

    @Test
    public void translateSpeech() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("DA", "NET");
        dictionary.put("alfa", "bukva");
        dictionary.put("111", "ok");
        senior.setDictionary(dictionary);
        assertEquals(
                "NET ili net NET prob. bukva bukva. ok ok. NET prob.",
                senior.translateSpeech("DA ili net NET prob. " +
                        "alfa alfa. 111 111. DA prob."));
    }

    @Test
    public void filterPrimeNumbers() {

        List<Integer> primes = new ArrayList<>();
        primes.add(1);
        primes.add(2);
        primes.add(3);
        primes.add(8);
        primes.add(112);
        primes.add(3);
        primes.add(17);
        primes.add(80);
        primes.add(11);
        primes.add(80);
        senior.setListOfNum(primes);

        List<Integer> results = senior.filterPrimeNumbers();
        assertEquals(5, results.size());
        assertTrue(results.contains(2));
        assertTrue(results.contains(3));
        assertTrue(results.contains(17));
        assertTrue(results.contains(11));
    }

    @Test
    public void containsPhone() {
        Set<String> phones = new HashSet<>();
        phones.add("12345");
        phones.add("22222");
        phones.add("33333");
        senior.setPhones(phones);

        assertTrue(senior.containsPhone("22222"));
        assertTrue(senior.containsPhone("+22222"));
        assertTrue(senior.containsPhone("+37122222"));
        assertTrue(senior.containsPhone("+37122222"));
        assertTrue(senior.containsPhone("+37122 222"));
        assertTrue(senior.containsPhone("33333"));
        assertTrue(senior.containsPhone("3 3 3 3  3"));
        assertTrue(senior.containsPhone("+ 3 7 1 3 3   333"));
        assertTrue(senior.containsPhone("+1234 5"));

        assertFalse(senior.containsPhone("+11234 5"));
        assertFalse(senior.containsPhone("1234"));
        assertFalse(senior.containsPhone("KK"));
        assertFalse(senior.containsPhone("+371"));
        assertFalse(senior.containsPhone("+"));
        assertFalse(senior.containsPhone(""));
        assertFalse(senior.containsPhone("-22222"));
        assertFalse(senior.containsPhone("-2222"));
        assertFalse(senior.containsPhone("2 2 2 2 2 2"));
    }

    @Test
    public void sumAllStringFromAllLists() {
        List<List<String>> list = new ArrayList<>();
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("CC");
        List<String> c = new ArrayList<>();
        List<String> d = new ArrayList<>();
        d.add("E");
        d.add("G");
        d.add("HH");
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        assertEquals("ABCCEGHH",
                senior.sumAllStringFromAllLists(list));
    }

    @Test
    public void isLuckyNumber() {
        assertFalse(senior.isLuckyNumber(new int[]{1, 2, 3, 4, 5}));
        assertFalse(senior.isLuckyNumber(new int[]{1, 2, 5}));
        assertFalse(senior.isLuckyNumber(new int[]{}));
        assertFalse(senior.isLuckyNumber(new int[]{1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}));
        assertFalse(senior.isLuckyNumber(new int[]{1, 2, 3, 4, 1, 1, 1, 1, 5, 1, 1, 1, 1}));
        assertFalse(senior.isLuckyNumber(new int[]{1, 1, 1, 1, 0}));
        assertFalse(senior.isLuckyNumber(new int[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 2, 1, 1}));
        assertFalse(senior.isLuckyNumber(new int[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 2, 1, 0}));

        assertTrue(senior.isLuckyNumber(new int[]{1, 1, 1, 1, 1}));
        assertTrue(senior.isLuckyNumber(new int[]{0, 1, 1, 1, 1, 1}));
        assertTrue(senior.isLuckyNumber(new int[]{1, 1, 1, 1, 1, 1}));
        assertTrue(senior.isLuckyNumber(new int[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 2}));
        assertTrue(senior.isLuckyNumber(new int[]{9, 1, 1, 1, 1, 1, 1, 3}));
        assertTrue(senior.isLuckyNumber(new int[]{9, 9, 1, 1, 1, 1, 1, 3}));
        assertTrue(senior.isLuckyNumber(new int[]{1, 1, 1, 1, 1, 2}));


    }
}
