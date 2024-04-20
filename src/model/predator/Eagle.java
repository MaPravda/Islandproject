package model.predator;

import model.abstracts.Animal;

public class Eagle extends Predator {
    protected Eagle (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
