public class ScriptCommand extends Command {

    @Override
    public void execute(Editor editor){
        editor.script(this);
    }
}