public class ExportingProcess{

    private long processN;

    public ExportingProcess(long processN){
        this.processN = processN;

        System.out.println("Object with process no. " + processN + " was created");
    }

    public long getProcessN(){
        return processN;
    }
}
