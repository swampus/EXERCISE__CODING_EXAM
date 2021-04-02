package com.swampus.cooding.task.advanced;

import com.swampus.cooding.misc.Operation;
import com.swampus.cooding.misc.SwNode;
import com.swampus.cooding.misc.builder.User;
import com.swampus.cooding.misc.card.PlayerHand;
import com.swampus.cooding.misc.card.PlayingCard;
import com.swampus.cooding.misc.observer.Channel;
import com.swampus.cooding.misc.observer.NewsChannel;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeveloperTest {

    private Developer developer = new Developer();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void makeGarbageCollection() {
        List<SwNode> tree = new ArrayList<>();
        SwNode swNodeRoot = new SwNode("root", true);
        SwNode swNodeA = new SwNode("A1", false);
        SwNode swNodeA2 = new SwNode("A2", false);
        swNodeRoot.setReference(swNodeA);
        swNodeA.setReference(swNodeA2);

        SwNode swNodeB = new SwNode("B1", false);
        swNodeA2.setReference(swNodeB);

        SwNode swNodeB2 = new SwNode("B2", false);
        swNodeB.setReference(swNodeB2);

        SwNode swNodeC = new SwNode("C", false);

        SwNode swNodeC2 = new SwNode("C2", false);

        SwNode swNodeC3 = new SwNode("C3", false);
        swNodeC3.setReference(swNodeA2);
        swNodeC2.setReference(swNodeC3);

        tree.add(swNodeRoot);
        tree.add(swNodeA);
        tree.add(swNodeA2);
        tree.add(swNodeB);
        tree.add(swNodeB2);
        tree.add(swNodeC);
        tree.add(swNodeC2);
        tree.add(swNodeC3);


        List<SwNode> result = developer.makeGarbageCollection(tree);
        assertEquals(5, result.size());
        assertTrue(result.contains(swNodeRoot));
        assertTrue(result.contains(swNodeA));
        assertTrue(result.contains(swNodeA2));
        assertTrue(result.contains(swNodeB));
        assertTrue(result.contains(swNodeB2));

    }

    @Test
    public void calculateAllAmounts() {
        List<Map<String, Long>> data = new ArrayList<>();
        Map<String, Long> firstReport = new HashMap<>();
        Map<String, Long> secondReport = new HashMap<>();

        firstReport.put("1", 100L);
        firstReport.put("2", 200L);
        firstReport.put("3", 600L);
        firstReport.put("4", 1000L);
        firstReport.put("5", -1L);

        secondReport.put("1", 55L);
        secondReport.put("2", 101L);
        secondReport.put("3", -600L);
        secondReport.put("10", 10000L);

        data.add(firstReport);
        data.add(secondReport);

        List<Operation> result = developer.calculateAllAmounts(data);

        assertEquals(6, result.size());
        assertEquals("1", result.get(0).getId());
        assertEquals("2", result.get(1).getId());
        assertEquals("3", result.get(2).getId());
        assertEquals("4", result.get(3).getId());
        assertEquals("5", result.get(4).getId());
        assertEquals("10", result.get(5).getId());

        assertEquals(new Long(155), result.get(0).getAmount());
        assertEquals(new Long(301), result.get(1).getAmount());
        assertEquals(new Long(0), result.get(2).getAmount());
        assertEquals(new Long(1000), result.get(3).getAmount());
        assertEquals(new Long(-1), result.get(4).getAmount());
        assertEquals(new Long(10000), result.get(5).getAmount());

    }

    @Test
    public void getWinnersOnTables() {

        Map<String, List<PlayerHand>> tables = new HashMap<>();
        PlayingCard playingCard1 = new PlayingCard("A1", "S", "A");
        PlayingCard playingCard2 = new PlayingCard("A2", "S", "K");
        PlayingCard playingCard3 = new PlayingCard("A3", "S", "Q");
        PlayingCard playingCard4 = new PlayingCard("A4", "S", "J");
        PlayingCard playingCard5 = new PlayingCard("A5", "S", "10");

        List<PlayingCard> fleshRoyal = new ArrayList<>();
        fleshRoyal.add(playingCard1);
        fleshRoyal.add(playingCard2);
        fleshRoyal.add(playingCard3);
        fleshRoyal.add(playingCard4);
        fleshRoyal.add(playingCard5);

        List<PlayingCard> nothing = new ArrayList<>();
        nothing.add(new PlayingCard("B1", "C", "K"));
        nothing.add(new PlayingCard("B2", "H", "J"));
        nothing.add(new PlayingCard("B3", "S", "7"));
        nothing.add(new PlayingCard("B4", "H", "2"));
        nothing.add(new PlayingCard("B5", "H", "1"));

        List<PlayingCard> pair = new ArrayList<>();
        pair.add(new PlayingCard("C1", "C", "K"));
        pair.add(new PlayingCard("C2", "H", "J"));
        pair.add(new PlayingCard("C3", "S", "7"));
        pair.add(new PlayingCard("C4", "H", "2"));
        pair.add(new PlayingCard("C5", "H", "K"));

        PlayerHand playerHand1 = new PlayerHand("Player1", fleshRoyal);
        PlayerHand playerHand12 = new PlayerHand("Player2", pair);
        PlayerHand playerHand13 = new PlayerHand("Player3", nothing);

        List<PlayerHand> playerHandsTable1 = new ArrayList<>();
        playerHandsTable1.add(playerHand1);
        playerHandsTable1.add(playerHand12);
        playerHandsTable1.add(playerHand13);

        List<PlayerHand> playerHandsTable2 = new ArrayList<>();
        List<PlayingCard> twoPair = new ArrayList<>();
        twoPair.add(new PlayingCard("C1", "C", "K"));
        twoPair.add(new PlayingCard("C22", "H", "J"));
        twoPair.add(new PlayingCard("C33", "S", "7"));
        twoPair.add(new PlayingCard("C44", "H", "J"));
        twoPair.add(new PlayingCard("C54", "H", "K"));

        List<PlayingCard> street = new ArrayList<>();
        street.add(new PlayingCard("C1", "D", "K"));
        street.add(new PlayingCard("C22", "H", "Q"));
        street.add(new PlayingCard("C33", "H", "J"));
        street.add(new PlayingCard("C44", "H", "9"));
        street.add(new PlayingCard("C54", "H", "10"));

        List<PlayingCard> nothing2 = new ArrayList<>();
        nothing2.add(new PlayingCard("D1", "C", "A"));
        nothing2.add(new PlayingCard("D2", "H", "Q"));
        nothing2.add(new PlayingCard("D3", "S", "J"));
        nothing2.add(new PlayingCard("D4", "H", "3"));
        nothing2.add(new PlayingCard("D5", "H", "2"));


        List<PlayingCard> treeOfAKind = new ArrayList<>();
        treeOfAKind.add(new PlayingCard("Z1", "C", "A"));
        treeOfAKind.add(new PlayingCard("Z2", "H", "A"));
        treeOfAKind.add(new PlayingCard("Z3", "D", "A"));
        treeOfAKind.add(new PlayingCard("Z4", "H", "3"));
        treeOfAKind.add(new PlayingCard("Z5", "H", "2"));

        playerHandsTable2.add(new PlayerHand("Player1", twoPair));
        playerHandsTable2.add(new PlayerHand("Player2", street));
        playerHandsTable2.add(new PlayerHand("Player3", nothing2));
        playerHandsTable2.add(new PlayerHand("Player4", treeOfAKind));

        List<PlayerHand> playerHandsTable3 = new ArrayList<>();
        List<PlayingCard> twoPairTwo = new ArrayList<>();
        twoPairTwo.add(new PlayingCard("C1", "C", "Q"));
        twoPairTwo.add(new PlayingCard("C22", "H", "J"));
        twoPairTwo.add(new PlayingCard("C33", "S", "7"));
        twoPairTwo.add(new PlayingCard("C44", "D", "J"));
        twoPairTwo.add(new PlayingCard("C54", "H", "Q"));

        List<PlayingCard> twoPairTwoBigger = new ArrayList<>();
        twoPairTwoBigger.add(new PlayingCard("C1", "C", "K"));
        twoPairTwoBigger.add(new PlayingCard("C22", "H", "2"));
        twoPairTwoBigger.add(new PlayingCard("C33", "S", "3"));
        twoPairTwoBigger.add(new PlayingCard("C44", "D", "2"));
        twoPairTwoBigger.add(new PlayingCard("C54", "H", "K"));

        playerHandsTable3.add(new PlayerHand("Player1", twoPairTwo));
        playerHandsTable3.add(new PlayerHand("Player2", twoPairTwoBigger));

        tables.put("TABLE_1", playerHandsTable1);
        tables.put("TABLE_2", playerHandsTable2);
        tables.put("TABLE_3", playerHandsTable3);

        Map<String, PlayerHand> res = developer.getWinnersOnTables(tables);

        assertEquals(3, res.size());

        assertEquals(fleshRoyal, res.get("TABLE_1"));
        assertEquals(street, res.get("TABLE_2"));
        assertEquals(twoPairTwoBigger, res.get("TABLE_3"));
    }

    @Test
    public void builderPattern() throws Exception {
        Class<?> obj = this.getClass().getClassLoader().loadClass("com.swampus.cooding.misc.builder.UserBuilder");
        Object instance = obj.newInstance();
        Method age = instance.getClass().getDeclaredMethod("age", Long.class);
        Method phone = instance.getClass().getDeclaredMethod("phone", String.class);
        Method address = instance.getClass().getDeclaredMethod("address", String.class);
        Method build = instance.getClass().getDeclaredMethod("build");
        age.invoke(instance, 22L);
        phone.invoke(instance, "222333444");
        address.invoke(instance, "some street");

        User user = (User) build.invoke(instance);
        assertEquals(new Long(22), user.getAge());
        assertEquals("222333444", user.getPhone());
        assertEquals("some street", user.getAddress());
    }

    @Test
    public void observerPattern() throws Exception {
        NewsChannel channel = new NewsChannel();

        Class<?> obj = this.getClass().getClassLoader().loadClass("com.swampus.cooding.misc.observer.ChannelObserver");
        Object instance = obj.newInstance();

        Method subscribe = instance.getClass().getDeclaredMethod("subscribe", Channel.class);

        subscribe.invoke(instance, channel);

        sleep(1500);


        assertEquals("SOME NEWS", channel.getNews());


    }
}