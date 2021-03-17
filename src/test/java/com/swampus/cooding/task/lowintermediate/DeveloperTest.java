package com.swampus.cooding.task.lowintermediate;

import com.swampus.cooding.misc.Employee;
import com.swampus.cooding.misc.MarsHolder;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DeveloperTest {

    private Developer developer = new Developer();

    @Test
    public void marsHolder() {
        MarsHolder marsHolder = developer.marsHolder();
        assertNotNull(marsHolder.getMarsRover());
    }

    @Test
    public void createMap() {
        assertNotNull(developer.createMap());
    }

    @Test
    public void updateEmployee() {
        developer.updateEmployee("1", "2", "3");
        Employee employee = developer.getEmployee();
        assertEquals("1", employee.getName());
        assertEquals("2", employee.getTaxCategory());
        assertEquals("3", employee.getPersonalCode());
    }

    @Test
    public void checkNotNullValues() {
        Employee employee = new Employee();
        employee.setName("1");
        employee.setTaxCategory("2");
        employee.setPersonalCode("3");

        assertTrue(developer.checkNotNullValues(employee));

        employee.setName(null);
        assertFalse(developer.checkNotNullValues(employee));
    }

    @Test
    public void putAllEmployesIntoList() {
        Employee employee = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        List<Employee> emp = developer.putAllEmployesIntoList(employee, employee2, employee3);

        assertEquals(employee, emp.get(0));
        assertEquals(employee2, emp.get(1));
        assertEquals(employee3, emp.get(2));
    }
}