public class TVRemoteMute extends RemoteControl{


    public TVRemoteMute(Device device){
        super(device);
    }

    @Override
    public void ninePressed() {
        System.out.println("Tv was muted.");
    }
}
