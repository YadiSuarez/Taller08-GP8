public class EmailListener implements Suscribir {
    private String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update(EventType eventType) {
        System.out.println("Correo para " + email + ": Evento" + eventType + "lanzado.");
    }
}