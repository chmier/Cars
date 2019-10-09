import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarsTypeMain {

    public static void main(String[] args) throws IOException {

        List<String> logList = new ArrayList<>();

        final Cars audiA4 = new AudiA4("Audi", 180);
        final Cars renaultClio = new RenaultClio("Clio", 220);
        final Cars toyota = new ToyotaCorolla("Corolla", 120);
        final BmwE90 bmw = new BmwE90("BMW", 300);
        final Saver saver = new Saver();
        final Mechanic mechanikAndrzej = new Mechanic("Andrzej", "Złotaraczka");

        final ParkingLot<Cars> parkingLot = new ParkingLot<>(); // dowolne samochody;
        final ParkingLot<AudiA4> audiParkingLot = new ParkingLot<>(); // tylko audi
        final ParkingLot<RenaultClio> renaultClioParkingLot = new ParkingLot<>(); // tylko clio

        parkingLot.parkCar(audiA4);
        parkingLot.parkCar(renaultClio);
        parkingLot.parkCar(toyota);
        parkingLot.parkCar(bmw);

        renaultClio.startEngine();
        renaultClio.startEngine();

        toyota.startEngine();
        toyota.startEngine();
        toyota.startEngine();
        audiA4.startEngine();
        audiA4.startEngine();
        audiA4.startEngine();
        bmw.startEngine();
        bmw.startEngine();
        bmw.startEngine();

        mechanikAndrzej.tryFixCar(audiA4);
        mechanikAndrzej.tryFixCar(bmw);
        mechanikAndrzej.tryFixCar(toyota);

        parkingLot.removeBrokenCars();

        saver.saverData(renaultClio.getList());
        saver.saverData(bmw.getList());
        saver.saverData(audiA4.getList());
        saver.saverData(toyota.getList());


    }
}
