public class TVDevice extends Device {

    public TVDevice(int deviceState, int maxSetting) {
        super();
        super.deviceState = deviceState;
        super.maxSetting = maxSetting;
    }

    @Override
    public void sevenPressed() {
        super.deviceState--;
        System.out.println("Channel at:" + deviceState);
    }

    @Override
    public void eightPressed() {
        super.deviceState++;
        System.out.println("Channel at:" + deviceState);
    }

}
