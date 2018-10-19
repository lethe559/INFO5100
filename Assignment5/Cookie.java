package Assignment_5;

public class Cookie extends DessertItem {
	private double pricePerDz;
	private int pcs;

	Cookie(String name, int pcs, double pricePerDz){
		super(name);
		this.pricePerDz = pricePerDz;
		this.pcs = pcs;
	}
	
	public int getCost() {
		return (int) Math.round(pricePerDz * pcs/12);
	}
	
	public String toString() {
		return pcs + " @ " + pricePerDz/100 + " /dz.\n" + super.toString();
	}
}
