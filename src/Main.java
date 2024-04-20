import com.fasterxml.jackson.databind.ObjectMapper;
import config.ChanceOfBeingEatingConfig;

public class Main {
    public static void main (String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        ChanceOfBeingEatingConfig chanceOfBeingEatingConfig = new ChanceOfBeingEatingConfig(objectMapper, "resources/ChanceToGetEaten.json");

    }
}