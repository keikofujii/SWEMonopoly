import java.util.ArrayList;
import java.util.Set;

public class Bank
{
    private Set<Property, bankProterties> _proterties;
    
    /**
     * This method consturst the Bank
     */
    public Bank()
    {
        _proterties = new HashMap<Property, bankProterties>;
    }
    
    /**
     * This method sells a property to the player if they have enough money
     * @param soldProperty This is the property to be sold
     * @param currentPlayer This is the player who wants to buy the player
     * @return true if successful or false if they don't have enough money or it is already sold
     */
    public boolean sellProperty(Property soldProperty, Player currentPlayer)
    {
        // assume that the player has enough money
        boolean ableToBuy = true;
        // check to see if the player has enough money to buy the property
        if (soldProperty.getPropertyPrice() <= currentPlayer.getCash() && _proterties.has(soldProperty))
        {
            //sell the property
            currentPlayer.getsProperty(soldProperty);
            currentPlayer.removeCash(soldProperty.getPropertyPrice());
            _proterties.remove(soldProperty);
        } // if
        else // they don't have enough money to buy the property
        {
            // player doesn't have sufficient funds or the proterty is already sold
            ableToBuy = false;
        } // else
        
        return ableToBuy;
    } // sellProperty
    
    
    /**
     * This method gives the player new building and
     * removes the the price of that building from the player's cash supply
     *
     * @param playersProperty This the property that the building will be put on
     * @param currentPlayer This is the player who is buying the building
     * @param buildingToBeSold This is the building that will be sold
     * @returns true if successful else false if the player doesn't have enough money
     */
    public boolean sellBuilding(Property playersProperty, Player currentPlayer, Building buildingToBeSold)
    {
        // Vars
        int buildingPrice = false;
        boolean ableToBuyBuilding;
        // get the price of the building from the property
        buildingPrice = playersProperty.getBuildingPrice(buildingToBeSold)
        //check to see if the player has an monopoly and enough money to buy the property
        if (currentPlayer.hasMonopoly() && buildingPrice =< currentPLayer.getCash())
        {
            // take the cash from the player for the building
            currentPlayer.removeCash(buildingPrice);
            // add the building to the player
            currentPlayer.addBuilding(BuildingToBeSold);
        } // if
        else
        {
            // player doesn't have a monopoly and cannot buy a building
            ableToBuyBuilding = false;
        } // else
        // return true if successful or false if unsuccessful
        return ableToBuyBuilding;
    } // sellBuilding
    
    
    /**
     * This method sells a property to whoever has the highest bid.  This is done through
     * a bind auction where no one else gets to see what another person put up for a bid.
     *
     * @param propertyToBeSold  This is the preperty that the players are trying to buy
     * @param theBoard Needed to get access to all of the players at once
     * @return true if the property is sold else false
     */
    public boolean auction(Property propertyToBeSold, Board theBoard)
    {
        // get an arraylist of players from the baord
        ArrayList<Player> thePlayers = theBoard.getBoard().getPlayers();
        int playerWithHighestBig = thePlayer.get(0).getBid();
        // assume the first player has the highest bid
        int playerPosition = 0;
        // loop over each player
        for (int i = 0; i < thePlayers.size(); i++)
        {
            // find the player with the highest bid and if they have enough money to buy the property
            if (thePlayers.get(i).getBid() > currentHighestBid && thePlayers.get(i).getCash() >= thePlayers.get(i).getBid())
            {
                playerWithHighestBig = bidAmount[i];
                playerPosition = i;
            } // if
        } // for
        
        // find the highest amount in the array and the
        // sell the property to the player with the highest amount of money
    } // auction
    
    
    /**
     * This method is the bank buying a building from the player and giving them cash for it.
     * The amount of cash is half of what was paid for the building
     *
     * @param playersProperty This is protery that has the building
     * @param currentPlayer This is the player who is selling the building back to the bank
     * @param buildingToBeSold this is the building that will be sold
     * @return true if sold, else the player didn't have a building to sell
     */
    public boolean buyBuilding(Property playersProperty, Player currentPlayer, building buildingToBeSold)
    {
        // get the building type
        // when a building is sold back to the bank the player only gets half of what they paid for the building
        buildingPrice = buildingToBeSold.getBuildingPrice() / 2;
        // give the player back half of the money of the building that was paid for it
        currentPlayer.addCash(buildingPrice);
        currentPlayer.removeBuilding()
        
    } // buyBuilding
} // Bank
