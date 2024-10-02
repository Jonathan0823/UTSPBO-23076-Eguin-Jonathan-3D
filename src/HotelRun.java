import users.*;
import java.util.Scanner;
public class HotelRun {
    public static void main(String[] args) throws Exception {
        String roomName;
        boolean isLoop = true;

        Scanner input = new Scanner(System.in);
        Hotel hotel = new Hotel();

        System.out.println("Welcome to the hotel");
        System.out.print("Enter your status: ");
        String status = input.nextLine();


        if(status.equals("admin")) {
            Admin admin = new Admin("Admin");
            System.out.println("\nWelcome Admin\n");
            
            while (isLoop) {
                admin.getInfo();
                System.out.println();
                hotel.showMenu("admin");
    
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine();
                System.out.println();


                switch (choice) {
                    case 1:
                        hotel.showRoom("customer");
                        System.out.println("\nPress enter to continue...");
                        input.nextLine();
                        break;
    
                    case 2:
                        System.out.println("Enter room name: ");
                        roomName = input.nextLine();
                        hotel.checkAvailability(roomName);
                        System.out.println("\nPress enter to continue...");
                        input.nextLine();
                        break;
    
                    case 3:
                        System.out.print("Enter room name: ");
                        roomName = input.nextLine();
                        System.out.println();
                        hotel.orderDetails(roomName);
                        System.out.println("\nPress enter to continue...");
                        input.nextLine();
                        break;
                    
                    case 4:
                        isLoop = false;
                        break;

                    default:
                        System.out.println("Invalid choice");
                        System.out.println("\nPress enter to continue...");
                        input.nextLine();
                        break;
                }
            }
            

        } else {
            System.out.println("Welcome Customer");
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            Customer customer = new Customer(name);

            System.out.println("\nWelcome " + customer.name() + "\n");
            
            while (isLoop) {
                customer.getInfo();
                System.out.println();
                hotel.showMenu("customer");
    
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine();
                System.out.println();


                switch (choice) {
                    case 1:
                        hotel.showRoom("admin");
                        System.out.println("\nPress enter to continue...");
                        input.nextLine();
                        break;

                    case 2:
                        System.out.print("Enter room name: ");
                        roomName = input.nextLine();
                        hotel.orderRoom(roomName, customer.name());
                        System.out.println();
                        System.out.println("\nPress enter to continue...");
                        input.nextLine();
                        break;
    
                    case 3:
                        System.out.print("Enter room name: ");
                        roomName = input.nextLine();
                        hotel.checkAvailability(roomName);
                        System.out.println("\nPress enter to continue...");
                        input.nextLine();
                        break;
    
                    case 4:
                        System.out.print("Enter room name: ");
                        roomName = input.nextLine();
                        System.out.println();
                        hotel.orderDetails(roomName);
                        System.out.println("\nPress enter to continue...");
                        input.nextLine();
                        break;
                    
                    case 5:
                        isLoop = false;
                        break;

                    default:
                        System.out.println("Invalid choice");
                        System.out.println("\nPress enter to continue...");
                        input.nextLine();
                        break;
                }
            }
            
        }
        input.close();
        System.out.println("\nThank you for visiting the hotel.");
    }
}
