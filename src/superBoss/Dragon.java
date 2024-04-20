package superBoss;

import service.BossAction;

public class Dragon extends SuperClass implements BossAction {
    protected Dragon (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        super(weight, maxCountSpeciesCell, movementSpeed, kgOfFoodForSaturation);
    }

    @Override
    public void destroy () {
        System.out.println("Burn everything");
    }

    @Override
    public void move () {

    }

    @Override
    public void multiply () {

    }

    @Override
    public void chanceToEat () {

    }
}
