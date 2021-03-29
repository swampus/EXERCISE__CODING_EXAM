package com.swampus.cooding.task.intermediate;

import com.swampus.cooding.misc.IConnector;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Optional;

import static org.junit.Assert.*;

public class ArchitectTest {

    private Architect architect = new Architect();

    @Test
    public void iConnectorProxy() {
        IConnector iConnector = architect.iConnectorProxy();
        iConnector.connect();
        iConnector.deltaAbstract();
        assertNull(iConnector.cltOfffer());
    }

    @Test
    public void iConnectorDecorator() throws Exception {
        IConnector iConnector = architect.iConnectorDecorator();
        Method me = iConnector.getClass().getDeclaredMethod("getDString");
        String res = (String) me.invoke(iConnector);
        assertEquals("12345", res);

    }

    @Test
    public void nullObjectPattern() {
        Optional res = (Optional) architect.nullObjectPattern(null);
        assertFalse(res.isPresent());
    }

    @Test
    public void task4() {
        Architect.ArchitectLazyLoadingTask ar = architect.task4();
        assertNull(ar.reference);
        assertEquals("loadRef934345", ar.getReference());
        assertEquals("loadRef934345", ar.reference);
    }
}