public class Drums implements InstrumentMusic {

    @Override
    public void play() {
        System.out.println("Drums Sound played.");
    }

    @Override
    public void stop() {
        System.out.println("Drums Sound stoped.");
    }
}
