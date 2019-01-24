package com.medestin.animal.shelter;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}