package Assignment_6;

public abstract class Pet {
	private String petName;
	private String ownerName;
	private String color;
	protected int sex;
	
	public Pet(String name, String ownerName, String color) {
		petName = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSex(int sexid) {
		if(sexid == 1){
			sex = 1;}
		if(sexid == 2){
			sex = 2;}
		if(sexid == 3){
			sex = 3;}
		if(sexid == 4){
			sex = 4;}
	};
	
	public String getSex() {
		if(sex == 1) {
			return "MALE";}
		if(sex == 1) {
			return "FEMALE";}
		if(sex == 1) {
			return "SPAYED";}
		if(sex == 1) {
			return "NEUTERED";}
		else {
			return "Wrong sexid";}
	}
	
	public String toString() {
		String result;
		result = this.getPetName() + " owned by " + this.getOwnerName() + "\n";
		result += "Color: " + this.getColor() + "\n";
		result += "Sec: " + this.getSex();
		return result;
	}
}
