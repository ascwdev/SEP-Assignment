import java.util.HashMap;

public class CommandWords
{
    private HashMap<String, Command> commandsMap = new HashMap();

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        this.commandsMap.put("help", new HelpCommand());
        this.commandsMap.put("look", new LookCommand());
        this.commandsMap.put("rot90", new Rot90Command());
        this.commandsMap.put("open", new OpenCommand());
        this.commandsMap.put("save", new SaveCommand());
        this.commandsMap.put("mono", new MonoCommand());
        this.commandsMap.put("script", new ScriptCommand());
        this.commandsMap.put("quit", new QuitCommand());
        this.commandsMap.put(null, new NullCommand());
        // Hashmap setup
    }

    /**
     * Get a command from the commandsMap HashMap.
     * @param command The command to retrieve.
     * @return The
     */
    public Command get(String command) { return commandsMap.get(command); }

    /**
     * Return whether the passed command parameter is a command.
     * @param command The desired command to check with.
     * @return True if passed command is valid, false otherwise.
     */
    public boolean isCommand(String command) { return commandsMap.containsKey(command); }

}
