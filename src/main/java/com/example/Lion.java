package com.example;

import com.example.constants.ExceptionMessage;
import com.example.enums.AnimalKind;
import com.example.enums.Sex;

import java.util.List;

public class Lion {

    Feline feline;
    boolean hasMane;

    public Lion(Sex sex, Feline feline) throws Exception {
        this.feline = feline;

        if (Sex.MALE.equals(sex)) {
            hasMane = true;
        } else if (Sex.FEMALE.equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception(ExceptionMessage.NOT_ALLOWED_VALUE_SEX);
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood(AnimalKind.PREDATOR);
    }
}
