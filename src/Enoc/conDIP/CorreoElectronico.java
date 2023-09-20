package Enoc.conDIP;

public class CorreoElectronico implements  INotificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electronico "+mensaje);
    }
}
