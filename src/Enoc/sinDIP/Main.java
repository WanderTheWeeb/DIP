package Enoc.sinDIP;

public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();
        notificador.enviarCorreo("Holis");
        notificador.enviarMensajeTxt("Hola");
    }


}
