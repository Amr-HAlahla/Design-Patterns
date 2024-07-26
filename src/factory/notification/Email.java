package factory.notification;

public class Email implements Notification {

    @Override
    public void modifyUser() {
        System.out.println("You've received an Email notification!");
    }
}
