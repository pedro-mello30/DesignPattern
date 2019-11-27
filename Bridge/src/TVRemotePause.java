public class TVRemotePause extends RemoteControl {

    public TVRemotePause(Device device){
        super(device);
    }

    @Override
    public void ninePressed() {
        System.out.println("Tv was paused.");
    }
}
