public class SaveCommand extends Command {

    @Override
    public void execute(Editor editor){
        editor.save(this);
    }
}