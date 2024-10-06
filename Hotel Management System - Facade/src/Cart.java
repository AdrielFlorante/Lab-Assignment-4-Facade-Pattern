public class Cart implements HotelService {
    @Override
    public void callService(Object numberOfCarts) {
        requestCart((int) numberOfCarts);
    }
    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting " + numberOfCarts + " carts");
    }
}
