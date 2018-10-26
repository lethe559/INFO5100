package Assignment_6;

import java.text.DecimalFormat;

public interface Boardable {
	static void setBoardStart(String month, String day, String year) {
		DecimalFormat twoDigit = new DecimalFormat("00");
		DecimalFormat fourDigit = new DecimalFormat("0000");
		month = twoDigit.format(month);
		day = twoDigit.format(day);
		year = fourDigit.format(year);	
	}; 
	static void setBoardEnd(String month, String day, String year) {
		DecimalFormat twoDigit = new DecimalFormat("00");
		DecimalFormat fourDigit = new DecimalFormat("0000");
		month = twoDigit.format(month);
		day = twoDigit.format(day);
		year = fourDigit.format(year);	
	}; 
	static boolean boarding(int month, int day, int year) {
		return true;
	}; 
}
