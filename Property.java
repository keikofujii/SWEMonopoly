import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 11/12/2015.
 */
public class Property Extends Space {
   // member variables
   private String _name;
   private Boolean mortgaged;
   private float baseRent;
   private Player owner;
   private String color;
   private int houseCount;
   private int hotelCount;
   private int housePrice;
   private int hotelPrice;
   private int propertyPrice;
   private List<PropertyItem> _propertyList;
   private int _rent;


   // constructor
   public Property(String name) {
      this._name = name;

      if (_propertyList == null){
         _propertyList = new ArrayList<PropertyItem>();

         initialize();
      }
   }

   boolean performAction() {
      return true;
   }

   // properties
   String getName() {
      return this._name;
   }

   int getHousePrice() {
      return this.housePrice;
   }

   int getHotelPrice() {
      return this.hotelPrice;
   }

   int getPropertyPrice() {
      return this.propertyPrice;
   }


   float getRent() {
      // first we interact with the base class to determine what factors determine the rent
      // e.g. ownership of sister properties
      float finalRent = 0;
      float houseRent;
      float hotelRent;
      boolean allOwnedSamePlayer = super.CommonOwnership(this.name, this.owner);

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

   private void initialize() {
      PropertyItem propertyItem;

      propertyItem = new PropertyItem();
      propertyItem.Name = "Mediterranean Avenue";
      propertyItem.Color = "Purple";
      propertyItem.Rent = 2;
      propertyItem.Price = 60;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Baltic Avenue";
      propertyItem.Color = "Purple";
      propertyItem.Rent = 4;
      propertyItem.Price = 60;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Oriental Avenue";
      propertyItem.Color = "Light Blue";
      propertyItem.Rent = 6;
      propertyItem.Price = 100;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Vermont Avenue";
      propertyItem.Color = "Light Blue";
      propertyItem.Rent = 6;
      propertyItem.Price = 100;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Connecticut Avenue";
      propertyItem.Color = "Light Blue";
      propertyItem.Rent = 8;
      propertyItem.Price = 120;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Charles Place";
      propertyItem.Color = "Pink";
      propertyItem.Rent = 10;
      propertyItem.Price = 140;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "States Avenue";
      propertyItem.Color = "Pink";
      propertyItem.Rent = 10;
      propertyItem.Price = 140;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Virginia Avenue";
      propertyItem.Color = "Pink";
      propertyItem.Rent = 12;
      propertyItem.Price = 160;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "St. James Place";
      propertyItem.Color = "Orange";
      propertyItem.Rent = 14;
      propertyItem.Price = 180;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Tennessee Avenue";
      propertyItem.Color = "Orange";
      propertyItem.Rent = 140;
      propertyItem.Price = 180;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "New York Avenue";
      propertyItem.Color = "Orange";
      propertyItem.Rent = 16;
      propertyItem.Price = 200;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Kentucky Avenue";
      propertyItem.Color = "Red";
      propertyItem.Rent = 18;
      propertyItem.Price = 220;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Indiana Avenue";
      propertyItem.Color = "Red";
      propertyItem.Rent = 18;
      propertyItem.Price = 220;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Illinois Avenue";
      propertyItem.Color = "Red";
      propertyItem.Rent = 20;
      propertyItem.Price = 240;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Atlantic Avenue";
      propertyItem.Color = "Yellow";
      propertyItem.Rent = 22;
      propertyItem.Price = 260;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Ventnor Avenue";
      propertyItem.Color = "Yellow";
      propertyItem.Rent = 22;
      propertyItem.Price = 260;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Marvin Gardens";
      propertyItem.Color = "Yellow";
      propertyItem.Rent = 24;
      propertyItem.Price = 280;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Pacific Avenue";
      propertyItem.Color = "Green";
      propertyItem.Rent = 26;
      propertyItem.Price = 300;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "North Carolina Avenue";
      propertyItem.Color = "Green";
      propertyItem.Rent = 26;
      propertyItem.Price = 300;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Pennsylvania Avenue";
      propertyItem.Color = "Green";
      propertyItem.Rent = 28;
      propertyItem.Price = 320;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Park Place";
      propertyItem.Color = "Dark Blue";
      propertyItem.Rent = 35;
      propertyItem.Price = 350;

      _propertyList.add(propertyItem);

      propertyItem = new PropertyItem();
      propertyItem.Name = "Boardwalk";
      propertyItem.Color = "Dark Blue";
      propertyItem.Rent = 50;
      propertyItem.Price = 400;

      _propertyList.add(propertyItem);
   }


   Player getOwner() {
      return this.owner;
   }

   void setOwner(Player player) {
      this.owner = player;
   }


}
