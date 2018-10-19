package Assignment_5;

public abstract class DessertItem extends java.lang.Object {
	protected String name;
	public DessertItem() {}
	public DessertItem(String name) {
		this.name = name;
	}

	public final java.lang.String getName(){
		return name;
	}
	
	public abstract int getCost();
	
	public String toString() {
		String result = "";
		int i;
		for (i = 0; i < name.length(); i++) {
			result += name.charAt(i);
			if (i + 1 % DessertShoppe.MAX_NAME_LEN == 0) {
				result += "\n";
			}
		}
		
		if (i % DessertShoppe.MAX_NAME_LEN > 0) {
			result += " ".repeat(DessertShoppe.MAX_NAME_LEN - i % DessertShoppe.MAX_NAME_LEN);
		}
		
		return result + "\t" + DessertShoppe.cents2dollarsAndCentsmethod(getCost());
	}
}
