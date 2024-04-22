package com.example.enums;

public enum Sex {
    MALE("Самец"),
    FEMALE("Самка"),
    NON_EXISTENT_GENDER("Неизвестный пол");
    private final String sex;
    Sex(String sex) {this.sex = sex;}
    public String getMode() {return sex;}
}
