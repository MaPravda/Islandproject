package model.abstracts;

public abstract class Essence {
    protected Double weight;
    protected Integer maxCountSpeciesCell;
    protected Integer movementSpeed;
    protected Double kgOfFoodForSaturation;

    public Double getWeight () {
        return weight;
    }

    public Integer getMaxCountSpeciesCell () {
        return maxCountSpeciesCell;
    }

    public Integer getMovementSpeed () {
        return movementSpeed;
    }

    public Double getKgOfFoodForSaturation () {
        return kgOfFoodForSaturation;
    }

    protected Essence (Double weight, Integer maxCountSpeciesCell, Integer movementSpeed, Double kgOfFoodForSaturation) {
        this.weight = weight;
        this.maxCountSpeciesCell = maxCountSpeciesCell;
        this.movementSpeed = movementSpeed;
        this.kgOfFoodForSaturation = kgOfFoodForSaturation;
    }
}
