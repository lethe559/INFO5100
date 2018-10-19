package Assignment_5;

public class Sundae extends IceCream{
	String toppingName;
	int toppingPrice;
	
	Sundae(String name, int price, String toppingName, int toppingPrice) {
		super(name, price);
		this.toppingName = toppingName;
		this.toppingPrice = toppingPrice;
	}

	public int getCost() {
		return price + toppingPrice;
	}
}
