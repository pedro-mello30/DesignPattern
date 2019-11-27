import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        // write your code here


        ObjectPool<ExportingProcess> pool = new ExportingProcessPool();
        pool.shutdown();

        ExecutorService executorService = Executors.newFixedThreadPool(8);


        for (int i = 0; i < 9; i++ ){

            executorService.execute(new ExportingTask(pool, i));
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(30, TimeUnit.SECONDS);
        }   catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
