package model.herbivores;

import model.abstracts.Animal;

public class Caterpillar extends Herbivores {

    protected Caterpillar (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
