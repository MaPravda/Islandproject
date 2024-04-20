package model.herbivores;

import model.abstracts.Animal;

public class Dear extends Herbivores {
    protected Dear (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
