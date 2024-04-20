package model.herbivores;

import model.abstracts.Animal;

public class Horse extends Herbivores {
    protected Horse (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
