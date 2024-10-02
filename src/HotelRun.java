import users.*;
public class HotelRun {
    public static void main(String[] args) throws Exception {
        Hotel hotel = new Hotel();
        Admin admin = new Admin();
        Customer customer = new Customer();
        
        hotel.checkAvailability();
        admin.getInfo();
        customer.getInfo();        
    }
}
