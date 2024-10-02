package users;

public class Admin extends Customer{
    
    @Override
    public void getInfo() {
        System.out.println("This is an admin.");
    }
    
    
}
