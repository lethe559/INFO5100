package Assignment_6;

public class Cat extends Pet implements Boardable{
	public String hairLength;
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}
	
	String getHairLength() {
		return hairLength;
	}
	
	public String toString() {
		String result;
		result = "CAT: " + "\n";
		result += this.getPetName() + " owned by " + this.getOwnerName() + "\n";
		result += "Color: " + this.getColor() + "\n";
		result += "Sex: " + this.getSex();
		result += "Hair: " +this.getHairLength();
		return result;
	}
}
