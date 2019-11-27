public class DVDRemote extends RemoteControl {
    public boolean play = true;

    public DVDRemote(Device device){
        super(device);
    }
    @Override
    public void ninePressed() {
        play = !play;

        System.out.println("DVD is playing: " + play);
    }
}
