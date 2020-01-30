package com.example.silas.demo.models;


import java.util.*;


public class Person {
    private String name;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    private UUID uuid;

    public Person() { }

    public Person(String name, Long age, UUID uuid) {
        this.name = name;
        this.age = age;
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }

    private Long age;

}
