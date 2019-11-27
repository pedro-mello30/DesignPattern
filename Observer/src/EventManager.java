import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

//Publisher
public class EventManager {
    HashMap<String, ArrayList<EventListener>> listeners = new HashMap<String, ArrayList<EventListener>>();


    public EventManager(String... operations) {
        for(String op : operations){
            listeners.put(op, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener newListener){
        ArrayList<EventListener> users = listeners.get(eventType);
        users.add(newListener);
    }

    public void unsubscribe(String eventType, EventListener removeListener){
        ArrayList<EventListener> users = listeners.get(eventType);
        users.remove(removeListener);
    }

    public void notify(String eventType, File file){
        ArrayList<EventListener> users = listeners.get(eventType);
        for(EventListener user : users){
            user.update(eventType, file);
        }
    }

}
