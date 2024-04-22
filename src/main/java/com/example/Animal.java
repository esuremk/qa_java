package com.example;

import com.example.constants.ExceptionMessage;
import com.example.enums.AnimalKind;

import java.util.List;

public class Animal {

    public List<String> getFood(AnimalKind animalKind) throws Exception {
        //TODO вынести так же еду в перечисления
        if (AnimalKind.HERBIVORE.equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if (AnimalKind.PREDATOR.equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception(ExceptionMessage.NOT_ALLOWED_ANIMAL_KIND);
        }
    }

    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}