import java.util.concurrent.atomic.AtomicLong;
//WorkSpace - Worker
public class ExportingTask implements Runnable {

    private int threadN = 0;
    private ObjectPool<ExportingProcess> pool;


    public ExportingTask(ObjectPool<ExportingProcess> p, int threadN){
        this.pool = p;
        this.threadN = threadN;
    }

    @Override
    public void run() {
        ExportingProcess exportingProcess = pool.checkOut();

        System.out.println("Thread: " + threadN + " Object with process no. " + exportingProcess.getProcessN() + " did checkOut");

        pool.checkIn(exportingProcess);

        System.out.println("Thread: " + threadN + " Object with process no. " + exportingProcess.getProcessN() + " did checkIn");

    }
}
