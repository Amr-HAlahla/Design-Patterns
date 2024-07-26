package factory.notification;

public class NotificationFactoryDemo {
    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification1 = notificationFactory.createNotification("email");
        notification1.modifyUser();

        Notification notification2 = notificationFactory.createNotification("sms");
        notification2.modifyUser();

        Notification notification3 = notificationFactory.createNotification("push");
        notification3.modifyUser();

    }
}
