package model.herbivores;

import model.abstracts.Animal;

public class Mouse extends Herbivores {
    protected Mouse (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
