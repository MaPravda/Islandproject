package model.herbivores;

import model.abstracts.Animal;

public class Rabbit extends Herbivores {
    protected Rabbit (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
