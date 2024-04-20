package config;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.abstracts.Essence;
import model.enam.EssenceType;

import java.util.Map;

public class ChanceOfBeingEatingConfig {
    private Map<Map<EssenceType, Essence>, Integer> chanceOfBeingEatingConfig;

    public ChanceOfBeingEatingConfig (Map<Map<EssenceType, Essence>, Integer> chanceOfBeingEatingConfig) {
        this.chanceOfBeingEatingConfig = chanceOfBeingEatingConfig;
    }

    public ChanceOfBeingEatingConfig(ObjectMapper objectMapper, String pathToJson) {

    }
}
