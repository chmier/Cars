import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public abstract class CarModel implements Cars {

    private String model;
    private int horsePower;
    private EngineType engineType;
    private boolean brokenEngine;
    private int howManyTries = 0;
    private List<String> logList = new ArrayList<>();
    LocalDateTime localTime = LocalDateTime.now();


    LogRecord logRecord1 = new LogRecord(Level.INFO, "Your engine is started");
    LogRecord logRecord2 = new LogRecord(Level.INFO, "hint: warn!!!");
    LogRecord logRecord3 = new LogRecord(Level.INFO, "Oh no.... Your engine  is broken :(");

    public CarModel (String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public List<String> getList() {
        return logList;
    }

    @Override
    public boolean hasBrokenEngine() {
        return brokenEngine;
    }

    @Override
    public void startEngine() {
        if (howManyTries == 0) {
            System.out.println("You are trying start your engine");
            /*            logList.add(logRecord.getMessage());*/
            log.info(logRecord1.getMessage());
            logList.add(logRecord1.getMessage() + " " + getModel() +  " " + localTime);
            howManyTries += 1;
        } else if (howManyTries == 1) {
            System.out.println("You are trying start your engine again");
            log.info(logRecord2.getMessage());
            logList.add(logRecord2.getMessage() + " " + getModel() +  " " + localTime);
            howManyTries += 1;
        } else if (howManyTries >= 2) {
            System.out.println("No more!!!");
            log.info(logRecord3.getMessage());
            logList.add(logRecord3.getMessage() + " " + getModel() + " " + localTime);

            brokenEngine = true;

        }
    }
}
