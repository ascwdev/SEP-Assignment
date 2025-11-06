public class QuitCommand extends Command {

    @Override
    public void execute(Editor editor){
        editor.quit(this);
    }
}
