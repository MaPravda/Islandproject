package model.herbivores;

import model.abstracts.Animal;

public class Duck extends Herbivores {
    protected Duck (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
