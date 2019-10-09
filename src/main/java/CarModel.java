import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.LogRecord;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class CarModel implements Cars {

    private String model;
    private int horsePower;
    private EngineType engineType;
    private boolean brokenEngine;
    private int howManyTries = 0;
    private List<String> logList = new ArrayList<>();
    LocalDateTime localTime = LocalDateTime.now();
    Random random = new Random();


    LogRecord logRecord1 = new LogRecord(Level.INFO, "Your engine is started");
    LogRecord logRecord2 = new LogRecord(Level.INFO, "Warn!!!");
    LogRecord logRecord3 = new LogRecord(Level.INFO, "Oh no.... Your engine is broken :(");
    LogRecord logRecord4 = new LogRecord(Level.INFO, "Your car was fixed");
    LogRecord logRecord5 = new LogRecord(Level.INFO, "You tried, but didn't succes");



    public CarModel(String model, int horsePower) {
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
            logList.add(logRecord1.getMessage() + " " + getModel() + " " + localTime);
            howManyTries += 1;
        } else if (howManyTries == 1) {
            System.out.println("You are trying start your engine again");
            log.info(logRecord2.getMessage());
            logList.add(logRecord2.getMessage() + " " + getModel() + " " + localTime);
            howManyTries += 1;
        } else if (howManyTries >= 2) {
            System.out.println("No more!!!");
            log.info(logRecord3.getMessage());
            logList.add(logRecord3.getMessage() + " " + getModel() + " " + localTime);

            brokenEngine = true;

        }
    }

    @Override
    public void fixCar(final Cars car) {
        boolean canFixed = new Random().nextBoolean();
        if (canFixed == true) {
            log.info(logRecord4.getMessage() + getModel());
            logList.add(logRecord4.getMessage() + " " + getModel() + " " + localTime);
            brokenEngine = !brokenEngine;
        } else if (canFixed == false) {
            log.info(logRecord5.getMessage() + getModel());
            logList.add(logRecord5.getMessage() + " " + getModel() + " " + localTime);
        }
    }
}



