package model.predator;

import model.abstracts.Animal;

public class Wolf extends Predator {
    protected Wolf (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }

}
