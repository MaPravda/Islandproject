package model.herbivores;

import model.abstracts.Animal;

public class Goat extends Herbivores {
    protected Goat (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
