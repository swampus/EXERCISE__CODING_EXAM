package com.swampus.cooding.task.lowintermediate;

import com.swampus.cooding.misc.Employee;
import com.swampus.cooding.misc.MarsHolder;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Developer {

    private Employee employee;

    /**
     * Task1
     * Create object MarsRover
     * Create Object MarsHolder
     * make MarsHolder have reference to MarsRover
     * (explore methods)
     * and return MarsHolder (that was created)
     */
    public MarsHolder marsHolder() {
        return null;
    }

    /**
     * Task2
     * look at type method need to return.
     * Create empty object of that type and return
     */
    public Map<String, List<List<Set<String>>>> createMap() {
        return null;
    }

    /**
     * Task3
     * you have field employee, update it`s name,taxCategory,personalCode with provided params.
     * Why is NullPointer Exception ? What is init value of employee ?
     * ( employee contains only 3 fields and you need update all of them, so think about recreate object)
     */
    public void updateEmployee(String name, String taxCategory, String personalCode) {

    }

    /**
     * Task4
     * you have incoming instance Employee employee. Return true if all fields of that instance are not null
     * return false if at least one field is null
     */
    public boolean checkNotNullValues(Employee employee) {
        return false;
    }

    /**
     * Task5
     * you have 3 incoming employees put then into new List and return
     */
    public List<Employee> putAllEmployesIntoList(Employee employee1, Employee employee2, Employee employee3) {
        return null;
    }

    public Employee getEmployee() {
        return employee;
    }
}

