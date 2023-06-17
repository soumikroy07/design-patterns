package LLD.ObserverPattern;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations){
            this.listeners.put(operation,new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener){
        List<EventListener> uses = listeners.get(eventType);
        uses.add(listener);
    }

    public void notify(String eventType, File file){
        List <EventListener> user = listeners.get(eventType);
        for (EventListener listener : user){
            listener.update(eventType, file);
        }
    }


}
