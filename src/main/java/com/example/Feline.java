package com.example;

import com.example.enums.AnimalFamily;
import com.example.enums.AnimalKind;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood(AnimalKind.PREDATOR);
    }

    @Override
    public String getFamily() {
        return AnimalFamily.FELINE.getMode();
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
