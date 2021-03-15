package com.swampus.cooding.task.intermediate;

import com.swampus.cooding.misc.DConnectionManager;
import com.swampus.cooding.misc.DataQHolder;
import com.swampus.cooding.misc.LoadCommandThread;
import org.junit.Test;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JuniorTest {

    private Junior junior = new Junior();

    @Test
    public void returnCurrentDate() {
        long date = new Date().getTime();
        assertTrue(date + 100 >= junior.returnCurrentDate().getTime()
                || date <= junior.returnCurrentDate().getTime() + 100);
    }

    @Test
    public void callConnect() {
        DConnectionManager dConnectionManager = new DConnectionManager();
        junior.callConnect(dConnectionManager);
        assertEquals("OK", dConnectionManager.getAbc());
    }

    @Test
    public void waitForTaskToComplete() {
        LoadCommandThread loadCommandThread = new LoadCommandThread();
        loadCommandThread.start();
        junior.waitForTaskToComplete(loadCommandThread);
        assertEquals("done", loadCommandThread.getStatus());
    }

    @Test
    public void callMethodIfObjectExists() {
        assertEquals("HolderL2", junior.callMethodIfObjectExists(Optional.of(new DataQHolder())));
        assertEquals("D_Default", junior.callMethodIfObjectExists(Optional.empty()));
    }

    @Test
    public void consumeStream() {
        List<String> list = junior.consumeStream(Stream.of("A", "B", "C"));
        assertEquals(3, list.size());
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }
}