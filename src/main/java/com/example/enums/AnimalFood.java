package com.example.enums;

import java.util.List;

public enum AnimalFood {
    //TODO список еды тоже можно вынести
    PREDATOR(List.of("Животные", "Птицы", "Рыба")),
    HERBIVORE(List.of("Трава", "Различные растения"));
    private final List<String> food;
    AnimalFood(List<String> food) {this.food = food;}
    public List<String> getListFood() {return food;}
}
