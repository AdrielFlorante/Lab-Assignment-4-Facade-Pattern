public class FrontDesk {
    private HotelService cart;
    private HotelService houseKeeping;
    private HotelService valet;

    public FrontDesk(HotelService cart, HotelService houseKeeping, HotelService valet) {
        this.cart = cart;
        this.houseKeeping = houseKeeping;
        this.valet = valet;
    }

    public void callHouseKeeping(int roomNo) {
        houseKeeping.callService(roomNo);
    }
    public void callCarts(int noOfCarts) {
        cart.callService(noOfCarts);
    }
    public void callValet(String plateNo) {
        valet.callService(plateNo);
    }
}
