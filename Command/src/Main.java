import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        InstrumentMusic guitar = new Guitar();
        Command commandGuitar = new GuitarCommand(guitar);

        Bandmaster bandmaster = new Bandmaster(commandGuitar);

        bandmaster.doThis();


//      ---------------------------------------------------------

        Guitar guitarA = new Guitar();
        Drums drumsA =  new Drums();

        ArrayList<InstrumentMusic> list = new ArrayList<InstrumentMusic>();

        list.add(guitarA);
        list.add(drumsA);
        list.add(guitar);

        Command instrumentsCommand = new InstrumentsCommand(list);

        bandmaster = new Bandmaster(instrumentsCommand);

        bandmaster.doThis();
        bandmaster.undoThis();

    }
}
