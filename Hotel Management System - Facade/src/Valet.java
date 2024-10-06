public class Valet implements HotelService {
    @Override
    public void callService(Object plateNUmber) {
        pickUpVehicle((String) plateNUmber);
    }
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Requesting a valet for vehicle with plate number: " + plateNumber);
    }
}
