public class DrumsCommand implements Command{

    private InstrumentMusic instrument;

    public DrumsCommand(InstrumentMusic newDrums) {
        instrument = newDrums;
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
