//Object Pool

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class WareHouse<T> {

    private long expirationTime;
    private Hashtable<T, Long> availableEquipment, inUseEquipment;

    public int count = 0;
    public int maxObject;

    public WareHouse(){
        expirationTime = 30000;
        maxObject = 3;
        availableEquipment = new Hashtable<T, Long>();
        inUseEquipment= new Hashtable<T, Long>();
    }



    public abstract T create();

//    give Equipment Worker
    public synchronized T checkOut() {
        long now = System.currentTimeMillis();
        T t;

        if (availableEquipment.size() > 0) {
            Enumeration<T> e = availableEquipment.keys();
            t = e.nextElement();
            inUseEquipment.put(t, now);
            count--;
            return t;
        } else {
            t = create();
            inUseEquipment.put(t, now);
            return t;
        }
    }


//    return equipment to WareHouse
    public synchronized void checkIn(T t){
        if(count <= maxObject){
            availableEquipment.put(t, System.currentTimeMillis());
            inUseEquipment.remove(t);
            count++;
        }else{
            System.out.println("Warehouse is all busy");
        }
    }



    public void setMaxObject(int max){
        maxObject = max;
    }

}
