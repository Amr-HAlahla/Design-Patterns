package factory.notification;

public class Push implements Notification {

    @Override
    public void modifyUser() {
        System.out.println("You've received a Push notification!");
    }
}
