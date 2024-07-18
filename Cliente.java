public class Cliente {
    private String nombre;
    private NotificacionStrategy mecanismoNotificacion;

    public Cliente(String nombre, NotificacionStrategy mecanismoNotificacion) {
        this.nombre = nombre;
        this.mecanismoNotificacion = mecanismoNotificacion;
    }

    public void realizarPago(String mensaje) {

        System.out.println(nombre + " ha realizado un pago. Mensaje: " + mensaje);
        mecanismoNotificacion.notificar(mensaje);
    }

}