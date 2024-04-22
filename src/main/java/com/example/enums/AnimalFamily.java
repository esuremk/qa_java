package com.example.enums;

public enum AnimalFamily {
    FELINE("Кошачьи");
    private final String animalFamily;
    AnimalFamily(String animalFamily) {this.animalFamily = animalFamily;}
    public String getMode() {return animalFamily;}
}
