package Before;

// criando diretamente as instâncias
public class MainBefore {
    public static void main(String[] args) {
        EmailNotificacao email = new EmailNotificacao();
        SMSNotificacao sms = new SMSNotificacao();
        PushNotificacao push = new PushNotificacao();

        email.enviar("Bem-vindo ao sistema!");
        sms.enviar("Seu código é 1234");
        push.enviar("Você tem uma nova mensagem!");

    }
}