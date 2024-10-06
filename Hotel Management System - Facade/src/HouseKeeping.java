public class HouseKeeping implements  HotelService {
    @Override
    public void callService(Object roomNumber) {
        cleanRoom((int) roomNumber);
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Calling a Housekeeper to room: " + roomNumber + "!");
    }
}
