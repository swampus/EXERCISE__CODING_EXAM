package com.swampus.cooding.task.begginer;

import com.swampus.cooding.misc.chess.ChessFigureSide;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArchitectTest {

    private Architect architect = new Architect();

    @Test
    public void calculateNumbersInside2DArray() {
        int[][] a = {{1, 2, 3}, {0, 0, 0}, {1, 1, 1}};
        assertEquals(9, architect.calculateNumbersInside2DArray(a));

        int[][] b = {{1, 2, 3}, {-10, -9, 0}, {1, 1, 1}};
        assertEquals(-10, architect.calculateNumbersInside2DArray(b));
    }

    @Test
    public void multyPlayTable() {
        assertEquals(ChessFigureSide.WHITE, architect.multyPlayTable("WHITE"));
        assertEquals(ChessFigureSide.BLACK, architect.multyPlayTable("BLACK"));
    }
}