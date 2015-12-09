

public class Jail extends Space{
	public boolean performAction()
	{
		//Charge the player here if they have been in jail for too long
		int jailCount = Board.getBoard().getCurrentPlayer().getJailCount();
		if (jailCount >= 3)
		{
			movePlayer();
			Board.getBoard().getCurrentPlayer().chargePlayer(50);
		}
		else
		{
			if (diceRoll.isDoubles())
			{
				movePlayer();
			}
			else
			{
				Board.getBoard().getCurrentPlayer().incrementJailCount();
			}
		}
		return true;
	}
}
