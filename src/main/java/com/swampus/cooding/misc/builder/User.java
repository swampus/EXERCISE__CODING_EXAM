package com.swampus.cooding.misc.builder;

public class User {
    private Long age;
    private String phone;
    private String address;

    public User(Long age, String phone, String address) {
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public Long getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
