package com.swampus.cooding.task.lowintermediate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArchitectTest {

    private Architect architect = new Architect();

    @Test
    public void calculateDeterminant() {
        long[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(0, architect.calculateDeterminant(mat1));

        long[][] mat2 = {{1, 3, 5, 9}, {1, 3, 1, 7}, {4, 3, 9, 7}, {5, 2, 0, 9}};
        assertEquals(-376, architect.calculateDeterminant(mat2));

        long[][] mat3 = {{21, 1, 13}, {1, 11, 1}, {12, 1, 33}};
        assertEquals(5878, architect.calculateDeterminant(mat3));
    }

    @Test
    public void doSomething() {
        assertEquals(0, architect.doSomething(0));
        assertEquals(0, architect.doSomething(1));
        assertEquals(1, architect.doSomething(2));
        assertEquals(1, architect.doSomething(3));
        assertEquals(2, architect.doSomething(4));
        assertEquals(3, architect.doSomething(5));
        assertEquals(5, architect.doSomething(6));
        assertEquals(8, architect.doSomething(7));
        assertEquals(13, architect.doSomething(8));
        assertEquals(21, architect.doSomething(9));
        assertEquals(34, architect.doSomething(10));
        assertEquals(55, architect.doSomething(11));
    }

    @Test
    public void getComplexityOfBubbleSortAlgorithm() {
        assertEquals("O(n*n)", architect.getComplexityOfBubbleSortAlgorithm());
    }

    @Test
    public void getComplexityOfAlgorithm() {
        assertEquals("O(n+n/2)", architect.getComplexityOfAlgorithm());
    }
}
