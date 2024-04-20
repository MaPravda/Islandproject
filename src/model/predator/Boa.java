package model.predator;

import model.abstracts.Animal;

public class Boa extends Predator {
    protected Boa (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
