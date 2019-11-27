import java.util.ArrayList;

public class Carataker {

    private ArrayList<Memento> history = new ArrayList<Memento>();;


    public void addMemento(Memento newMemento){
        history.add(newMemento);
    }

    public Memento getMemento(int index){
        return history.get(index);
    }
}
