package AfterFactoryMethod;

// Classe principal para testar o Factory Method
public class Main {
    public static void main(String[] args) {
        // Criando a fábrica
        NotificationFactory factory = new NotificationFactory();

        // Criando todas as notificações
        Notification emailNotification = factory.createEmailNotification();
        Notification smsNotification = factory.createSMSNotification();
        Notification pushNotification = factory.createPushNotification();

        // Enviando notificações
        emailNotification.notifyUser();
        smsNotification.notifyUser();
        pushNotification.notifyUser();
    }
}