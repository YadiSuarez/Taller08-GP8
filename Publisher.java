import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Publisher {
    private Map<EventType, List<Suscribir>> suscriptores;
    
    public Publisher(){
    suscriptores = new HashMap<>();
    Arrays.stream(EventType.values()).forEach(event -> 
        suscriptores.put(event, new ArrayList<>())
    );


    };

    public void agregarSuscriptor(EventType eventType, Suscribir listener) {
        List<Suscribir> users = suscriptores.get(eventType);
        users.add(listener);
    }

    public void eliminarSuscriptor(EventType eventType, Suscribir listener) {
        List<Suscribir> users = suscriptores.get(eventType);
        users.remove(listener);
    }

    public void notificar(EventType eventType, String data) {
        List<Suscribir> users = suscriptores.get(eventType);
        for (Suscribir listener : users) {
            listener.update(eventType);
        }
    }
}