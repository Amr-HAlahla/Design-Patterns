package factory.notification;

public class SMS implements Notification {

    @Override
    public void modifyUser() {
        System.out.println("You've received SMS notification!");
    }
}
