package model.predator;

import model.abstracts.Animal;

public class Fox extends Predator {
    protected Fox (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
