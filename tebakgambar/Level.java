package com.example.tebakgambar;

public class Level {
    private String name;
    private boolean isLocked;

    public Level(String name, boolean isLocked) {
        this.name = name;
        this.isLocked = isLocked;
    }

    public String getName() {
        return name;
    }

    public boolean isLocked() {
        return isLocked;
    }
}

