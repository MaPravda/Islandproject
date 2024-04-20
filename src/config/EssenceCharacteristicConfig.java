package config;

import model.abstracts.Essence;
import model.enam.EssenceType;

import java.util.Map;

public class EssenceCharacteristicConfig {
    private Map<EssenceType, Essence> essenceCharacteristicConfig;

    public EssenceCharacteristicConfig (Map<EssenceType, Essence> essenceCharacteristicConfig) {
        this.essenceCharacteristicConfig = essenceCharacteristicConfig;
    }
}
