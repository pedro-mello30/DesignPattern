public class Main {

    public static void main(String[] args) {

        RemoteControl tvPause = new TVRemotePause(new TVDevice(12, 100));
        RemoteControl tvMute = new TVRemoteMute(new TVDevice(10, 50));

        System.out.println("-----------------------------------------");
        System.out.println("Test TV with Pause");

        tvPause.fivePressed();
        tvPause.ninePressed();
        tvPause.sevenPressed();
        tvPause.sevenPressed();
        tvPause.eightPressed();
        tvPause.ninePressed();

        System.out.println("-----------------------------------------");
        System.out.println("Test TV with Mute");

        tvMute.fivePressed();
        tvMute.sevenPressed();
        tvMute.eightPressed();
        tvMute.eightPressed();
        tvMute.ninePressed();

        System.out.println("-----------------------------------------");

        RemoteControl dvdDevice = new DVDRemote(new DVDDevice(1, 10));

        System.out.println("Test DVD device");

        dvdDevice.fivePressed();
        dvdDevice.sevenPressed();
        dvdDevice.eightPressed();
        dvdDevice.eightPressed();
        dvdDevice.eightPressed();
        dvdDevice.eightPressed();
        dvdDevice.eightPressed();
        dvdDevice.ninePressed();

        System.out.println("-----------------------------------------");
    }
}
