package superBoss;

import model.abstracts.Animal;

public class SuperClass extends Animal {
    protected SuperClass (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }
}
