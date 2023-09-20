package Enoc.conDIP;

public class MensajeDeVoz implements INotificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Mensaje de voz: "+mensaje);
    }
}
