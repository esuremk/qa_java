package com.example.enums;

public enum AnimalKind {
    HERBIVORE("Травоядное"),
    PREDATOR("Хищник");
    private final String animalKind;
    AnimalKind(String animalKind) {this.animalKind = animalKind;}
    public String getMode() {return animalKind;}
}
