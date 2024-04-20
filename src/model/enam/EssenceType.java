package model.enam;

import model.herbivores.*;
import model.predator.*;
import plants.Grass;
import superBoss.Dragon;

public enum EssenceType {
WOLF("Wolf", Wolf.class),
BOA("Boa", Boa.class),
FOX("Fox", Fox.class),
BEAR("Bear", Bear.class),
EAGLE("Eagle", Eagle.class),
HORSE("Horse", Horse.class),
DEAR("Dear", Dear.class),
RABBIT("Rabbit", Rabbit.class),
MOUSE("Mouse", Mouse.class),
GOAT("Goat", Goat.class),
SHEEP("Sheep", Sheep.class),
BOAR("Boar", Boar.class),
BUFFALO("Buffalo", Buffalo.class),
DUCK("Duck", Duck.class),
CATERPILLAR("Caterpillar", Caterpillar.class),
GRASS("Grass", Grass.class),
DRAGON("Dragon", Dragon.class);

private final String type;
private final Class clazz;

    public String getType () {
        return type;
    }

    public Class getClazz () {
        return clazz;
    }

    EssenceType (String type, Class clazz) {
        this.type = type;
        this.clazz = clazz;
    }
}
