package Assignment_5;

import java.util.List;
import java.util.ArrayList;

public class Checkout extends java.lang.Object{
	int numbers;
	int cost;
	int tax;
	List<DessertItem> items;
	
	public Checkout(){
		items = new ArrayList<>();
	}
	
	public int numberOfItems() {
		return numbers;
	}
	
	public void enterItem(DessertItem item) {
		items.add(item);
		cost += item.getCost();
	}
	
	public void clear() { 
		items.clear();
		cost = 0;
		System.out.println("\n");
	}
	
	public int totalCost() {
		return cost;
	}
	
	public int totalTax() {
		tax = (int) Math.round(cost * DessertShoppe.TAX_RATE);
		return tax;
	}
	
	public String toString() {
		String receipt = "\t" + DessertShoppe.SHOP_NAME + "\n";
		receipt += "\t" + "-".repeat(DessertShoppe.SHOP_NAME.length()) + "\n\n";
		for (DessertItem item: items) {
			receipt += item.toString() + "\n";
		}
		receipt += "\n" + "Tax" + "\t\t\t\t " + DessertShoppe.cents2dollarsAndCentsmethod(Math.round(cost * DessertShoppe.TAX_RATE));
		int totalCost = cost + tax;
		receipt += "\n"+ "Total Cost" + "\t\t       " + DessertShoppe.cents2dollarsAndCentsmethod(totalCost);
		return receipt;
	}
}
