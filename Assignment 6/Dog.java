package Assignment_6;

public class Dog extends Pet implements Boardable {
	private String size;
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
	}
	
	String getSize() {
		return size;
	}
	
	public String toString() {
		String result;
		result = "DOG: " + "\n";
		result += this.getPetName() + " owned by " + this.getOwnerName() + "\n";
		result += "Color: " + this.getColor() + "\n";
		result += "Sex: " + this.getSex();
		result += "Size: " +this.getSize();
		return result;
	}
}