import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*@Slf4j*/
public class ParkingLot<T extends Cars> {

    private List<T> carsList = new ArrayList<T>();

    public void parkCar(final T carToPark) {
        carsList.add(carToPark);
    }

    public void removeBrokenCars() {

        final int carsBeforeRemoving = carsList.size();
        carsList = carsList.stream()
                .filter(car -> !car.hasBrokenEngine())
                .collect(Collectors.toList());

        final int carsRemoved = carsBeforeRemoving - carsList.size();
        System.out.println("Number of cars removed " + carsRemoved);
//        log.info("Number of cars removed " + carsRemoved);

    }


}
