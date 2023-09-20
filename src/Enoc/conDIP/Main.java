package Enoc.conDIP;

public class Main {

    public static void main(String[] args) {
        INotificacion correo = new CorreoElectronico();
        INotificacion mensajetxt = new MensajeTxt();
        INotificacion mensajeVoz = new MensajeDeVoz();

        Notificador notificador = new Notificador(correo);
        Notificador notificadorMensaje = new Notificador(mensajetxt);
        Notificador notificadorVoz = new Notificador(mensajeVoz);

        notificadorMensaje.enviarNotificacion("Mensaje de prueba txt");
        notificador.enviarNotificacion("Mensaje de prueba correo");
        notificadorVoz.enviarNotificacion("ensaje de prueba de voz");
    }
}
