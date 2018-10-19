package Assignment_5;

public class Candy extends DessertItem {
	private double pricePerLb;
	private double weight;
	
	Candy(String name, double weight, double pricePerLb){
		super(name);
		this.pricePerLb = pricePerLb;
		this.weight = weight;
	}
	
	public int getCost() {
		return (int) Math.round(pricePerLb * weight);
	}
	
	public String toString() {
		return weight + " @ " + pricePerLb/100 +"/dz.\n" + super.toString();
	}
}
