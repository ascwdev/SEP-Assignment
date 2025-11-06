public class OpenCommand extends Command {

    @Override
    public void execute(Editor editor) {
        editor.open(this);
    }
}
