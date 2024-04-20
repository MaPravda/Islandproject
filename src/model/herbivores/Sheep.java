package model.herbivores;

import model.abstracts.Animal;

public class Sheep extends Herbivores {
    protected Sheep (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
