
public class Hotel implements HotelInterface {
    private String room[] = {
        "Room 1", "Room 2", "Room 3", "Room 4", "Room 5", "Room 6", "Room 7", "Room 8", "Room 9", "Room 10"
    };

    private boolean roomAvailable[] = {
        true, true, false, true, true, true, false, true, true, true
    };

    private String customerName[] = {
        "", "", "Jack", "", "", "", "Jesse", "", "", ""
    };

    private int roomPrice[] = {
        100, 200, 300, 400, 500, 600, 700, 800, 900, 1000
    };

    public void showMenu(String status) {
        if (status == "admin") {
            System.out.println("Menu:");
            System.out.println("1. Show rooms");
            System.out.println("2. Check availability");
            System.out.println("3. Order details");
            System.out.println("4. Exit");
        } else {

                System.out.println("Menu:");
                System.out.println("1. Show rooms");
                System.out.println("2. Order room");
                System.out.println("3. Check availability");
                System.out.println("4. Order details");
                System.out.println("5. Exit");
            
        }
        
    }


    public void showRoom(String status) {
        System.out.println("List of rooms:");
        if (status.equals("admin")) {
            for (int i = 0; i < room.length; i++) {
                System.out.println(room[i] + " - " + roomAvailable[i] + " - " + customerName[i] + " - " + "Price = " + roomPrice[i]);
            }
        } else {
            for (int i = 0; i < room.length; i++) {
                if (roomAvailable[i]) {
                    System.out.println(room[i] + " - " + "Price = " + roomPrice[i]);
                }
            }
        }
    }

    public void orderRoom(String roomName, String customerName) {
        System.out.println("Details: ");
        System.out.println("Room: " + roomName);
        System.out.println("Customer: " + customerName);
        System.out.println("Price: ");
        for (int i = 0; i < room.length; i++) {
            if (room[i] == roomName.toLowerCase()) {
                if (roomAvailable[i]) {
                    roomAvailable[i] = false;
                    this.customerName[i] = customerName;
                    System.out.println(roomPrice[i]);
                    System.out.println("Room is booked successfully.");
                } else {
                    System.out.println("Room is not available.");
                }
            }
        }
    }
    
    public void checkAvailability(String roomName) {
        for (int i = 0; i < room.length; i++) {
            if (room[i].equals(roomName.toLowerCase())) {
                if (roomAvailable[i]) {
                    System.out.println(roomName + " is available.");
                } else {
                    System.out.println(roomName + " is not available.");
                }
            }
        }
    }
    
    public void orderDetails(String roomName) {
        System.out.println("Order details:");
        for (int i = 0; i < room.length; i++) {
            if (room[i].equals(roomName.toLowerCase())) {
                System.out.println("Room: " + room[i]);
                System.out.println("Customer: " + customerName[i]);
                System.out.println("Price: " + roomPrice[i]);

                if(roomAvailable[i]) {
                    System.out.println("Room is available to order.");
                } 
            }
        }

    }
    

}
