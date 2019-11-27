// Invoker
public class Bandmaster {

    Command theCommand;

    public Bandmaster(Command newCommand) {
        this.theCommand = newCommand;
    }

    public void doThis(){
        theCommand.execute();
    }

    public void undoThis(){
        theCommand.undo();
    }
}
