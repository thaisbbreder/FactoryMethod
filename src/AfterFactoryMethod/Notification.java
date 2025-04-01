package AfterFactoryMethod;

//Interface com um método genérico enviar(), que todas as notificações devem implementar.
//Garante que todas as notificações tenham o mesmo comportamento e facilita a adicionar novos tipos de notificações no futuro */

// Interface para Notificação
interface Notification {
    void notifyUser();
}
