public class NullCommand extends Command {

    @Override
    public void execute(Editor editor) {
        editor.nullCommand();
    }
}
