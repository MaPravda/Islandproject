package model.herbivores;

import model.abstracts.Animal;

public class Buffalo extends Herbivores {
    protected Buffalo (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
