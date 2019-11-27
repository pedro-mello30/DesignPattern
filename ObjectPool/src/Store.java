// New Object Creation
public class Store extends WareHouse<WorkSpace>{

    public int workers = 0;

    public Store(){
        super();

    }

    @Override
    public WorkSpace create() {
        return new WorkSpace();
    }

    public void employWorker(){
        workers++;
    }


}
