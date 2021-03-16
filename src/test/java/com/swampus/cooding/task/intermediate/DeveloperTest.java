package com.swampus.cooding.task.intermediate;

import com.swampus.cooding.misc.chess.*;
import com.swampus.cooding.misc.gemstones.BlueSapphire;
import com.swampus.cooding.misc.gemstones.Emerald;
import com.swampus.cooding.misc.gemstones.Gemstone;
import com.swampus.cooding.misc.gemstones.Ruby;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeveloperTest {

    private Developer developer = new Developer();

    @Test
    public void convertStringToDate() {
        assertEquals(new Long(1468476002000L), developer.convertStringToDate("2016-07-14 09:00:02"));
        assertEquals(new Long(1605340212000L), developer.convertStringToDate("2020-11-14 09:50:12"));
    }

    @Test
    public void consumeFile() {
        assertEquals("some string to be loaded....", developer.consumeFile("./src/test/resources/MynewFile.txt"));
    }

    @Test
    public void createSetWithGemstones() {
        Set<Gemstone> gemstoneSet = developer.createSetWithGemstones();
        assertEquals(732, gemstoneSet.stream().filter(t -> t instanceof BlueSapphire).count());
        assertEquals(116, gemstoneSet.stream().filter(t -> t instanceof Ruby).count());
    }

    @Test
    public void filterOutSameStones() {
        List<Gemstone> gemstoneIn = new LinkedList<>();
        Gemstone ruby = new Ruby();
        ruby.setId("A");
        Gemstone ruby2 = new Ruby();
        ruby2.setId("B");
        Gemstone ruby3 = new Ruby();
        ruby3.setId("C");
        Gemstone ruby4 = new Ruby();
        ruby4.setId("B");

        Gemstone emerals = new Emerald();
        emerals.setId("A");

        Gemstone emerals2 = new Emerald();
        emerals2.setId("B");
        Gemstone emerals3 = new Emerald();
        emerals3.setId("CCC");

        Gemstone blueSaphire = new BlueSapphire();
        blueSaphire.setId("A");

        Gemstone blueSaphire2 = new BlueSapphire();
        blueSaphire2.setId("A");

        Gemstone blueSaphire3 = new BlueSapphire();
        blueSaphire3.setId("BB");

        gemstoneIn.add(ruby);
        gemstoneIn.add(ruby);
        gemstoneIn.add(ruby2);
        gemstoneIn.add(ruby3);
        gemstoneIn.add(ruby4);
        gemstoneIn.add(emerals);
        gemstoneIn.add(emerals2);
        gemstoneIn.add(emerals3);
        gemstoneIn.add(blueSaphire);
        gemstoneIn.add(blueSaphire2);
        gemstoneIn.add(blueSaphire3);

        List<Gemstone> gemstoneList = developer.filterOutSameStones(gemstoneIn);

        assertEquals(8, gemstoneList.size());

        assertTrue(gemstoneList.contains(ruby));
        assertTrue(gemstoneList.contains(ruby2));
        assertTrue(gemstoneList.contains(ruby3));
        assertTrue(gemstoneList.contains(ruby4));

        assertTrue(gemstoneList.contains(emerals));
        assertTrue(gemstoneList.contains(emerals2));
        assertTrue(gemstoneList.contains(emerals3));

        assertTrue(gemstoneList.contains(blueSaphire));
        assertTrue(gemstoneList.contains(blueSaphire3));


    }

    @Test
    public void evaluateChessBoard() {
        Map<String, Figure> chessBoard = new HashMap<>();
        chessBoard.put("a1", new Knight(ChessFigureSide.BLACK));
        chessBoard.put("a2", new Knight(ChessFigureSide.BLACK));
        chessBoard.put("a3", new Knight(ChessFigureSide.WHITE));
        chessBoard.put("a4", new Pound(ChessFigureSide.WHITE));
        chessBoard.put("a5", new Pound(ChessFigureSide.WHITE));
        chessBoard.put("a6", new Pound(ChessFigureSide.WHITE));
        chessBoard.put("a7", new Pound(ChessFigureSide.WHITE));
        chessBoard.put("a8", new Queen(ChessFigureSide.BLACK));

        assertEquals(Optional.of(ChessFigureSide.BLACK), developer.evaluateChessBoard(chessBoard));


        chessBoard = new HashMap<>();
        chessBoard.put("a2", new Knight(ChessFigureSide.BLACK));
        chessBoard.put("a3", new Knight(ChessFigureSide.WHITE));

        assertEquals(Optional.empty(), developer.evaluateChessBoard(chessBoard));

    }
}
