package AfterFactoryMethod;

//Cada classe implementa a interface Notificacao, definindo sua própria lógica para o envio.
//Isso tambem evita grandes blocos de código if-else na aplicação principal.

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Enviando Notificação por Email...");
    }
}