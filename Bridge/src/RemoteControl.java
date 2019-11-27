public abstract class RemoteControl {
    private Device device;

    public RemoteControl(Device device){
        this.device = device;
    }

    public abstract void ninePressed();

    public void fivePressed(){
        device.fivePressed();
    }

    public void sixPressed(){
        device.sixPressed();
    }
    public void sevenPressed(){
        device.sevenPressed();
    }

    public void eightPressed(){
        device.eightPressed();
    }

    public void deviceFeedback(){
        device.deviceFeedback();
    }

}
