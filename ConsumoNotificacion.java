public class ConsumoNotificacion {
    public void notificar(Cliente cliente, String mensaje) {
        cliente.realizarPago(mensaje);
    }
}