import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AudiA4 implements Cars {

    private String model;
    private int horsePower;
    final private EngineType engineType = EngineType.GASOLINE_NATURALLY_ASPIRATED;
    private boolean brokenEngine;

    public AudiA4(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public boolean hasBrokenEngine() {
        if (brokenEngine) {
            return brokenEngine;
        }
        brokenEngine = new Random().nextBoolean();
        return brokenEngine;
    }

    public void startEngine() {

    }
}
