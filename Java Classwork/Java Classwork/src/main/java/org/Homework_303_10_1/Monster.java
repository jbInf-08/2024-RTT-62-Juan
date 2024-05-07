package org.Homework_303_10_1;

// Superclass Monster
class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    // Method to be overridden by subclasses
    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}

// Subclass FireMonster
class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}

// Subclass WaterMonster
class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}

// Subclass StoneMonster
class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}


