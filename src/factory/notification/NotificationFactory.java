package factory.notification;

public class NotificationFactory {
    public Notification createNotification(String notificationType) {
        if (notificationType == null || notificationType.isEmpty()) {
            return null;
        }
        return switch (notificationType.toUpperCase()) {
            case "EMAIL" -> new Email();
            case "SMS" -> new SMS();
            case "PUSH" -> new Push();
            default -> throw new IllegalArgumentException("Unknown notification type " + notificationType);
        };
    }
}
