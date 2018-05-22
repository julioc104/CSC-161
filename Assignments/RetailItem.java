public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;


	// constructors

	public RetailItem () {
		description = "";
		unitsOnHand = 0;
		price = 0.0;
	}

	// mutators

	public void setDescription (String des) {
		description = des;
	}
	public void setUnitsOnHand (int units) {
		unitsOnHand = units;
	}
	public void setPrice (double pr) {
		price = pr;
	}

	// accessors

	public String getDescription () {
		return description;
	}
	public int getUnitsOnHand () {
		return unitsOnHand;
	}
	public double getPrice () {
		return price;
	}
}