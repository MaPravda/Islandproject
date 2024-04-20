package model.abstracts;

import service.AnimalAction;

public abstract class Animal extends Essence implements AnimalAction {

    protected Animal (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
