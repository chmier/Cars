import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@AllArgsConstructor
@Data
public class Mechanic {

    private String name;
    private String surName;


    public void tryFixCar(final Cars car) {
        if (car.hasBrokenEngine()) {
            car.fixCar(car);

        }
    }

}


