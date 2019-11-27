public class Guitar implements InstrumentMusic {
    @Override
    public void play() {
        System.out.println("Guitar Sound played.");
    }

    @Override
    public void stop() {
        System.out.println("Guitar Sound stoped.");
    }
}
