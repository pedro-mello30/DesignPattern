public abstract class Device {

    public int deviceState;
    public int maxSetting;
    public int volumeLevel = 0;

    public abstract void sevenPressed();
    public abstract void eightPressed();


    public void fivePressed(){
        volumeLevel++;
        System.out.println("Volume at:" + volumeLevel);
    }


    public void sixPressed(){
        volumeLevel--;
        System.out.println("Volume at:" + volumeLevel);
    }

    public void deviceFeedback(){
        if(deviceState > maxSetting || deviceState < 0)
            deviceState = 0;

        System.out.println("Channel at:" + deviceState);
    }
}
