package com.swampus.cooding.task.intermediate;

import com.swampus.cooding.misc.Employee;

import java.util.Map;

public class Senior {

    private Map<String, Long> taxTable;

    /**
     * Task1
     * you have field taxTable there is String KEY - tax category value and VALUE the number (percent of tax)
     * personsGrossSalary parameter is provided it is a map where key is Employee - is a company employee and
     * value is amount of gross salary (before tax) you need to return map where KEY is employee personal code and
     * VALUE is amount of salary after tax. To get employee personal code you already have getter
     */
    public Map<String, Double> calculateNetSalary(Map<Employee, Double> personsGrossSalary){
        return null;
    }

    //public

    public Map<String, Long> getTaxTable() {
        return taxTable;
    }

    public void setTaxTable(Map<String, Long> taxTable) {
        this.taxTable = taxTable;
    }
}
