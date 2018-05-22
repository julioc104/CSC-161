public class SalesItems {
  			// fields
  			private String itemIdentifier;
  			private String itemDescription;
  			private double price;
  			private int quantity;
  
  			// Constructor
  		public SalesItems () {
        itemIdentifier = "";
        itemDescription = "";
        price = 0.0;
        quantity = 0;
      }
  		public SalesItems (String itemId, String itemDes, Double p, int qty) {
        itemIdentifier = itemId;
        itemDescription = itemDes;
        price = p;
        quantity = qty;
      }
  		
  		// mutators 
  		public void setItemID (String itemId) {
        itemIdentifier = itemId;
      }
  		public void setItemDescription (String itemDes) {
        itemDescription = itemDes;
      }
  		public void setPrice (double p) {
        price = p;
      }
  		public void setQuantity (int qty) {
        quantity = qty;
      }
  
  		// Accessors
  		public String getItemId () {
        return itemIdentifier;
      }
  		public String getItemDescription () {
        return itemDescription;
      }
  		public double getPrice () {
        return price;
      }
  		public int getQuantity () {
        return quantity;
      }
  
  		// method 
  		public double totalValue () {
        return price * quantity;
      }
	}