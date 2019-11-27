import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ObjectPool<T> {

    private ConcurrentLinkedQueue<T> pool;

    private ScheduledExecutorService executorService;

    public abstract T create();

    public ObjectPool(int minObjects){
        initialize(minObjects);
    }

    public ObjectPool(int minObjects, int maxObjects, long validationInternal){
        initialize(minObjects);

        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                int size = pool.size();

                if(size < minObjects){
                    int sizeToBeAdded = minObjects + size;

                    for (int i = 0; i < sizeToBeAdded; i++){
                        pool.add(create());
                    }
                }else if (size > maxObjects){
                    int sizeToBeRemoved = size - maxObjects;

                    for (int i = 0; i < sizeToBeRemoved; i++){
                        pool.poll();
                    }
                }
            }
        }, validationInternal, validationInternal, TimeUnit.SECONDS);
    }

    public T checkOut(){
        T t;
        if((t = pool.poll()) == null){
            t = create();
        }
        return t;
    }

    public void checkIn(T t){
        if(t == null)
            return;

        pool.offer(t);
    }

    public void shutdown(){
        if(executorService != null)
            executorService.shutdown();
    }

    private void initialize(int minObjects){
        pool = new ConcurrentLinkedQueue<T>();

        for (int i = 0; i < minObjects; i++){
            pool.add(create());
        }
    }
}
