import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Board;

/**
 *
 * @author Jack Tillotson
 * Created by Jack on 11/12/2015.
 */
public class Property extends Space {
   // member variables
   private String _name;
   private Boolean mortgaged;
   private float baseRent;
   private Player owner;
   private String _color;
   private int houseCount;
   private int hotelCount;
   private int housePrice;
   private int hotelPrice;
   private int _propertyPrice;
   private int _rent;
   private String purchaseProperty;

    /**
     *
     * @param name
     * @param color
     * @param rent
     * @param price
     */
   // constructor
   public Property(String name, String color, int rent, int price) {
      _name = name;
      _color = color;
      _rent = rent;
      _propertyPrice = price;
   }

    /**
     *
     * @return [returns the name of the property]
     */
   // properties
   String getName() {
      return _name;
   }

    /**
     *
     * @return [returns the price of a house]
     */
   int getHousePrice() {
      return housePrice;
   }

    /**
     *
     * @return [returns the price of a hotel]
     */
   int getHotelPrice() {
      return hotelPrice;
   }

    /**
     *
     * @return [returns the price of the property]
     */
   int getPropertyPrice() {
      return _propertyPrice;
   }

    /**
     *
     * @return [returns the color of the property]
     */
   public String getColor(){
      return _color;
   }

    /**
     *
     * @return [returns the owner of the property]
     */
   public Player getOwner(){
      return owner;
   }

    /**
     *
     * @return [returns the price of the property]
     */
   public int getPrice(){
      return _propertyPrice;
   }

    /**
     *
     * @return [returns the amount of rent a player pays when landing on a property
     * after calculations]
     */
   public float getRent() {
      // first we interact with the base class to determine what factors determine the rent
      // e.g. ownership of sister properties
      float finalRent = 0;
      float houseRent;
      float hotelRent;
      boolean hasMonopoly = getOwner().hasMonopoly(this);
      //boolean allOwnedSamePlayer = super.CommonOwnership(this.name, this.owner);

      // here is where we initially calculate finalRent based on home/hotel counts
      if (houseCount > 0){
         houseRent = baseRent * (3 + houseCount);
         finalRent += houseRent;
      }
      else if (hotelCount > 0) {
         hotelRent = baseRent * 10;
         finalRent += hotelRent;
      }


      // multiply by 2 *if* allOwnedSamePlayer is true
      if (allOwnedSamePlayer & houseCount < 1 & hotelCount < 1) {
         finalRent += baseRent * 2;
      }

      return finalRent;
   }

    /**
     *
     * @return [returns that the action took place.  The action is either charging them for the property
     * and adding it to their properties or auctioning the property or charging them rent]
     */
	@Override
	public boolean performAction() {
        // check to see if anyone owns the property, if not then ask them to purchase
		if (getOwner() == null){
	        Scanner input = new Scanner(System.in);
	         purchaseProperty = input.next();
	         if (purchaseProperty == "Y"){
	            Board.getBoard().getCurrentPlayer().chargePlayer(getPrice());
	            Board.getBoard().getCurrentPlayer().addProperty();
	            setOwner(Board.getBoard().getCurrentPlayer());
	         }
	         else {
	            Bank.auction(this);
	         }
	      }
	      else {
	         .chargeMoney(getRent());
	         getOwner().addMoney(getRent());
	      }
		return true;
	}


    /**
     *
     * @param player
     */
   public void setOwner(Player player) {
     owner = player;
   }


}
