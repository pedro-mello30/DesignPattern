public class DVDDevice extends Device{

    public DVDDevice(int deviceState, int maxSetting){
        super();
        super.deviceState = deviceState;
        super.maxSetting = maxSetting;
    }

    @Override
    public void sevenPressed() {
        super.deviceState--;
        System.out.println("DVD skips to last chapter.");
    }

    @Override
    public void eightPressed() {
        super.deviceState++;
        System.out.println("DVD skips to next chapter.");
    }
}
