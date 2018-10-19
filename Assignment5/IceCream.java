package Assignment_5;

public class IceCream extends DessertItem{
	int price;
	
	IceCream(String name, int price){
		super(name);
		this.price = price;
	}
	
	public int getCost() {
		return price;
	}

}
