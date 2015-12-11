
public abstract class Space {
    
    /**
     * A method to perform an action when the player lands on a space
     *
     * @return if the action was performed
     */
    public abstract boolean performAction();
    
    private int row;
    private int column;
}
