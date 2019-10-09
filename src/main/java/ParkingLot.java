import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;

@Slf4j

public class ParkingLot<T extends Cars> {

    private List<T> carsList = new ArrayList<T>();
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalTime localTime = LocalTime.now();
    String time = localTime.format(ISO_LOCAL_TIME);
    private String normalTime = (localTime.getHour()
            + ":" + localTime.getMinute()
            + ":" + localTime.getSecond());

    public void parkCar(final T carToPark) {
        carsList.add(carToPark);
    }

    public void removeBrokenCars() {

        final int carsBeforeRemoving = carsList.size();
        carsList = carsList.stream()
                .filter(car -> !car.hasBrokenEngine())
                .collect(Collectors.toList());

        final int carsRemoved = carsBeforeRemoving - carsList.size();
        //  System.out.println("Number of cars removed " + carsRemoved);
        log.info("Number of cars removed " + carsRemoved + " " + "at" + " " + normalTime);


    }

}
