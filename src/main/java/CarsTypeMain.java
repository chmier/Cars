
public class CarsTypeMain {

    public static void main(String[] args) {

        final Cars audiA4 = new AudiA4("Audi", 180);
        final Cars renaultClio = new RenaultClio("Clio", 220);
        final Cars toyota = new ToyotaCorolla("Corolla", 120);

        final ParkingLot<Cars> parkingLot = new ParkingLot<>(); // dowolne samochody;
        final ParkingLot<AudiA4> audiParkingLot = new ParkingLot<>(); // tylko audi
        final ParkingLot<RenaultClio> renaultClioParkingLot = new ParkingLot<>(); // tylko clio

parkingLot.parkCar(audiA4);
parkingLot.parkCar(renaultClio);
parkingLot.parkCar(toyota);
parkingLot.removeBrokenCars();

    }
}
