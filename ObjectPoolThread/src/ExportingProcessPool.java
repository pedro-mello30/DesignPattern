//store

import java.util.concurrent.atomic.AtomicLong;

public class ExportingProcessPool extends ObjectPool<ExportingProcess> {

    private int processN = 0;

    public ExportingProcessPool() {
        super(4, 10, 5);
    }
    public void increaseProcess(){
        processN++;
    }
    @Override
    public ExportingProcess create() {
        increaseProcess();
        return new ExportingProcess(processN);
    }
}
