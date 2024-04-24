package com.example;

import com.example.enums.AnimalSound;

import java.util.List;

public class Cat {

    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public AnimalSound getSound() {
        return AnimalSound.MEOW;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
