package com.swampus.cooding.task.lowintermediate;

import com.swampus.cooding.misc.Operation;
import com.swampus.cooding.misc.SwNode;
import com.swampus.cooding.misc.gemstones.Emerald;
import com.swampus.cooding.misc.gemstones.Ruby;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class JuniorTest {

    private Junior junior = new Junior();

    @Test
    public void createInstance() {
        assertNotNull(junior.createInstance());
    }

    @Test
    public void createClassOperation() {
        Operation var = junior.createClassOperation("22", 10L);
        assertEquals("22", var.getId());
        assertEquals(new Long(10), var.getAmount());
    }

    @Test
    public void createEmelerald() {
        Emerald emerald = junior.createEmelerald();
        assertEquals("EM_1", emerald.getId());
    }

    @Test
    public void createMap() {
        Map<String, Ruby> map = junior.createMap("K", "R1");
        assertEquals(1, map.size());
        assertTrue(map.containsKey("K"));
        Ruby ruby = map.get("K");
        assertEquals("R1", ruby.getId());
    }

    @Test
    public void createAndReferecen() {
        SwNode swNode = new SwNode("1", false);
        junior.setLocalNode(swNode);
        junior.createAndReferecen();
        SwNode swNodeRes = junior.getLocalNode();
        SwNode referenced = swNodeRes.getReference();
        assertNotNull(referenced);
        assertEquals("2", referenced.getId());
        assertFalse(referenced.isRoot());
    }
}