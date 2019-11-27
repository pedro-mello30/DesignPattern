public class GuitarCommand implements Command {

    private InstrumentMusic instrument;

    public GuitarCommand(InstrumentMusic newGuitar) {
        instrument = newGuitar;
    }

    @Override
    public void execute() {
        instrument.play();
    }

    @Override
    public void undo() {
        instrument.stop();
    }
}
