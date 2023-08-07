package com.example.FitCheck.Model;

import java.util.HashMap;
import java.util.Map;

public class Outfit {
    
    private String name;
    private Map<ClothingType, Clothing> outfit;

    public Outfit(String name) {
        this.name = name;
        this.outfit = new HashMap<>();
    }

    //Getters

    public String getName() {
        return name;
    }

    public Map<ClothingType, Clothing> getOutfit() {
        return outfit;
    }

    public Clothing getSpecificClothingType(ClothingType clothingType) {
        return outfit.get(clothingType);
    }

    //Setters

    public void changeName(String newName) {
        this.name = newName;
    }

    public void addClothing(ClothingType clothingType, Clothing clothing) {
        outfit.put(clothingType, clothing);
    }


}
