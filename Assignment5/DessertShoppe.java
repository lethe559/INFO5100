package Assignment_5;

public class DessertShoppe {
	public static final double TAX_RATE = 0.065;
	public static final String SHOP_NAME = "M & M Dessert Shoppe";
	public static final int MAX_NAME_LEN = 24;
	
	public static String cents2dollarsAndCentsmethod(long cents) {
		if (cents >= 100) {
			return String.format("%.2f", cents / 100.0);
		} else {
			return String.format(".%d", cents);
		}
	}
}
