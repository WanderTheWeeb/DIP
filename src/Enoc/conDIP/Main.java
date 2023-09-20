package Enoc.conDIP;

public class Main {

    public static void main(String[] args) {
        INotificacion correo = new CorreoElectronico();
        INotificacion mensajetxt = new MensajeTxt();

        Notificador notificador = new Notificador(correo);
        Notificador notificadorMensaje = new Notificador(mensajetxt);

        notificadorMensaje.enviarNotificacion("Mensaje de prueba txt");
        notificador.enviarNotificacion("Mensaje de prueba correo");

    }
}
