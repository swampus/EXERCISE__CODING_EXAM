package com.swampus.cooding.misc;

import java.util.Objects;

public class Employee {
    private String name;
    private String taxCategory;
    private String personalCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(String taxCategory) {
        this.taxCategory = taxCategory;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(taxCategory, employee.taxCategory) &&
                Objects.equals(personalCode, employee.personalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, taxCategory, personalCode);
    }
}
