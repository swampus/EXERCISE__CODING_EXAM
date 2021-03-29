package com.swampus.cooding.task.advanced;

import com.swampus.cooding.misc.Cartograpy;
import com.swampus.cooding.misc.chess.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JuniorTest {

    private Junior junior = new Junior();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAllPossibleValues() {
        Figure figure1 = new Knight(ChessFigureSide.BLACK);
        Figure figure2 = new Knight(ChessFigureSide.WHITE);
        Figure figure3 = new Queen(ChessFigureSide.WHITE);
        Figure figure4 = new Pound(ChessFigureSide.WHITE);
        List<Optional<Figure>> figures = new ArrayList<>();
        figures.add(Optional.of(figure1));
        figures.add(Optional.ofNullable(null));
        figures.add(Optional.of(figure2));
        figures.add(Optional.of(figure3));
        figures.add(Optional.ofNullable(null));
        figures.add(Optional.of(figure4));
        List<Integer> res = junior.getAllPossibleValues(figures);
        assertEquals(3, res.size());
        assertTrue(res.contains(3));
        assertTrue(res.contains(1));
        assertTrue(res.contains(9));
    }

    @Test
    public void getSha256() throws Exception {
        assertEquals("36bbe50ed96841d10443bcb670d6554f0a34b761be67ec9c4a8ad2c0c44ca42c", junior.getSha256("abcde"));
        assertEquals("40218acf0f0fb90b61ee467010843fe1fd6b0f03a2c4bac52a88f0160172a9fa", junior.getSha256("a1b2c3d4e"));

    }

    @Test
    public void concatAllLists() {
        List<List<List<String>>> lists = new ArrayList<>();
        List<List<String>> listSec = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list2.add("01");
        list2.add("02");
        list2.add("03");

        List<String> list21 = new ArrayList<>();
        list21.add("0A");
        list21.add("0B");

        List<String> list31 = new ArrayList<>();
        list31.add("LLL");
        list31.add("CCC");

        listSec.add(list2);
        listSec.add(list21);
        listSec.add(list31);

        List<List<String>> listSec2 = new ArrayList<>();
        List<String> listSec21 = new ArrayList<>();
        listSec21.add("M_1");
        List<String> listSec22 = new ArrayList<>();
        listSec22.add("M_21");
        listSec22.add("M_22");

        listSec2.add(listSec21);
        listSec2.add(listSec22);

        lists.add(listSec);
        lists.add(listSec2);

        List<String> res = junior.concatAllLists(lists);
        assertEquals(10, res.size());
        assertEquals("01", res.get(0));
        assertEquals("02", res.get(1));
        assertEquals("03", res.get(2));

        assertEquals("0A", res.get(3));
        assertEquals("0B", res.get(4));

        assertEquals("LLL", res.get(5));
        assertEquals("CCC", res.get(6));

        assertEquals("M_1", res.get(7));
        assertEquals("M_21", res.get(8));
        assertEquals("M_22", res.get(9));

    }

    @Test
    public void getAllFileNames() {
        List<String> list = junior.getAllFileNames("./src/test/resources/advance");
        assertEquals(4, list.size());
        assertEquals("ab.txt", list.get(0));
        assertEquals("abbbb.csv", list.get(1));
        assertEquals("om.wat", list.get(2));
        assertEquals("ruru.txt", list.get(3));
    }

    @Test
    public void createCartography() {
        Cartograpy car = junior.createCartography();
        assertEquals("100101010101010", car.getCard());
    }
}