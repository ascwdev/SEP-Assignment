public abstract class Command
{
    private String secondWord;
    private String thirdWord;

    /**
     * Create a command object. The constructor sets both subcommands
     * (secondWord & thirdWord) to null by default.
     */
    public Command()
    {
        this.secondWord = null;
        this.thirdWord = null;
    }

    /**
     * @return The second word of this command. Returns null if there was no
     * second word.
     */
    public String getSecondWord()
    {
        return secondWord;
    }

    /**
     * @return The third word of this command. Returns null if there was no
     * third word.
     */
    public String getThirdWord()
    {
        return thirdWord;
    }


    /**
     * Sets the second word to the desired input parameter.
     * @param word The desired input to store as the second word.
     */
    public void setSecondWord(String word) { this.secondWord = word; }

    /**
     * Sets the third word to the desired input parameter.
     * @param word The desired input to store as the third word.
     */
    public void setThirdWord(String word) { this.thirdWord = word; }


    /**
     * @return true if the command has a second word.
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
    
    /**
     * @return true if the command has a third word.
     */
    public boolean hasThirdWord()
    {
        return (thirdWord != null);
    }

    public abstract void execute(Editor editor);
}

