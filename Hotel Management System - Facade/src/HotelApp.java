public class HotelApp {

    public static void main(String[] args) {
        HotelService cart = new Cart();
        HotelService houseKeeping = new HouseKeeping();
        HotelService valet = new Valet();

        FrontDesk frontDesk = new FrontDesk(cart, houseKeeping, valet);

        frontDesk.callCarts(2);
        frontDesk.callHouseKeeping(505);
        frontDesk.callValet("QKZ153");
    }
}
