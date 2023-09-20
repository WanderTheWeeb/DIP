package Enoc.sinDIP;

public class Notificador {
    public void  enviarCorreo(String mensaje){
        System.out.println("Enviando correo electronico "+mensaje);
    }
    public void enviarMensajeTxt(String mensaje){
        System.out.println("Enviando mensaje de txt " +mensaje);
    }
}
