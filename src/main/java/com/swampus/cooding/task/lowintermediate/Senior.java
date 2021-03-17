package com.swampus.cooding.task.lowintermediate;

import com.swampus.cooding.misc.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * MIRROR Task
 */
public class Senior {

    /**
     * MIRROR task
     * you need to create units test for following methods
     * - find test class for that Class and modify
     */

    /**
     * Task1
     * Create Test
     */
    public int returnFive() {
        return 5;
    }

    /**
     * Task2
     * you have incoming string make it contain only small letters (make all letters small)
     * if string is null return empty string
     * Create Test
     */
    public String makeIncomingStringOnlySmallLetter(String string) {
        if (string == null) {
            return "";
        }
        return string.toUpperCase();
    }

    /**
     * Task3
     * - find biggest Integer in List<Integer>
     */
    public Integer findMax(List<Integer> numbers) {
        return numbers.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
    }

    /**
     * Task4
     * you have incoming param list of Employees, update all employees setting taxCategory B to everyone.
     * return updated List.
     */
    public List<Employee> asseingTaxCategoryBtoAllEmployess(List<Employee> employees) {
        return employees.stream().peek(t -> t.setTaxCategory("B")).collect(Collectors.toList());
    }

    /**
     * Task5
     * throw new RuntimeException with message "AAAAAAAAAAAAAAAAAAAAAAAAA"
     */
    public void throwException() {
        throw new RuntimeException("AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
