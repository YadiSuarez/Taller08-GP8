public class NotificacionFacebook implements NotificacionStrategy{
    @Override
    public void notificar(String mensaje){
        System.err.println("Enviando notificacion por Facebook: " + mensaje);
    }
}
