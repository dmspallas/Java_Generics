package com.dmspallas;

public abstract class Player {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public Player(String name) {
        this.name = name;

    }
}
