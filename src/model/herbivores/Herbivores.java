package model.herbivores;

import model.abstracts.Animal;

public class Herbivores extends Animal {
    protected Herbivores (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
