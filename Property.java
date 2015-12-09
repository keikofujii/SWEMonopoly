import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Board;

/**
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


   // constructor
   public Property(String name, String color, int rent, int price) {
      _name = name;
      _color = color;
      _rent = rent;
      _propertyPrice = price;
   }

   // properties
   String getName() {
      return _name;
   }

   int getHousePrice() {
      return housePrice;
   }

   int getHotelPrice() {
      return hotelPrice;
   }

   int getPropertyPrice() {
      return _propertyPrice;
   }

   public String getColor(){
      return _color;
   }

   public Player getOwner(){
      return owner;
   }

   public int getPrice(){
      return _propertyPrice;
   }

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

	@Override
	public boolean performAction() {
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

   public Player getOwner() {
      return owner;
   }

   public void setOwner(Player player) {
     owner = player;
   }


}
