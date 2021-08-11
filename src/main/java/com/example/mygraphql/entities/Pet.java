package com.example.mygraphql.entities;

/**
 * @author Covey Liu, covey@liukedun.com
 * Date: 8/27/2019 2:15 PM
 */
public class Pet {

    private long id;

    private String name;

    private Animal type;

    private int age;

    public Pet(long id, String name, Animal type, int age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public Pet() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getType() {
        return type;
    }

    public void setType(Animal type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}