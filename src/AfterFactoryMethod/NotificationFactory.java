package AfterFactoryMethod;

// Fábrica que cria todos os tipos de notificação
class NotificationFactory {

    public Notification createEmailNotification() {
        return new EmailNotification();
    }

    public Notification createSMSNotification() {
        return new SMSNotification();
    }

    public Notification createPushNotification() {
        return new PushNotification();
    }
}
