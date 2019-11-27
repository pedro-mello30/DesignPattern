import java.util.ArrayList;

public class InstrumentsCommand implements Command{
    private ArrayList<InstrumentMusic> instrumentMusicList;

    public InstrumentsCommand(ArrayList<InstrumentMusic> instrumentMusicList) {
        this.instrumentMusicList = instrumentMusicList;
    }


    @Override
    public void execute() {
        for (InstrumentMusic instrumentMusic : instrumentMusicList){
            instrumentMusic.play();
        }
    }

    @Override
    public void undo() {
        for (InstrumentMusic instrumentMusic : instrumentMusicList){
            instrumentMusic.stop();
        }
    }
}
