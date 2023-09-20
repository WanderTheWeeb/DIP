package Enoc.conDIP;

public class MensajeTxt implements INotificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje de texto: " +mensaje);
    }
}
