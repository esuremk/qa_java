package com.example.enums;

public enum AnimalSound {
    MEOW("Мяу");
    private final String animalSound;
    AnimalSound(String animalSound) {this.animalSound = animalSound;}
    public String getMode() {return animalSound;}
}
