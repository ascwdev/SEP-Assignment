public class HelpCommand extends Command {

    @Override
    public void execute(Editor editor) {
        editor.printHelp();
    }

}
