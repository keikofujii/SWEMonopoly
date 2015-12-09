

public class Go extends Space{
	public boolean performAction()
	{
		// Give the player 200 dollars
		Board.getBoard().getCurrentPlayer().givePlayer(200);
		return true;
	}
}
