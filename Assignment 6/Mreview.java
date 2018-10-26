package Assignment_6;
import java.util.ArrayList;

public class Mreview implements Comparable<Mreview>{
	private String title;
	private ArrayList<Integer> ratings = new ArrayList<Integer>();
	private int firstRating;
	private double sum;
	private String avg;
	private int numRating;
	private String result;
	
	Mreview(){}
	Mreview(String title){
		this.title = title;
	}
	Mreview(String title, int firstRating){
		this.title = title;
		this.firstRating = firstRating;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void addRating(int r) {
		ratings.add(r);
		sum = firstRating;
		sum += r;
	}
	
	public String avgRating() {
		avg = String.format("%.2f", sum / (ratings.size() + 1));
		return avg;
	}
	
	public int numRatings() {
		numRating = ratings.size() + 1;
		return numRating;
	}
	
	public int compareTo(Mreview obj) {
		int compare = this.title.compareTo(obj.title);
		return compare;
	}
	
	public boolean equals(Mreview obj) {
		if(this.title == obj.title) {
			return true;
		}
		else return false;
	}
	
	public String toString() {
		result = this.getTitle() + ", average " + this.avgRating() +  " out of " + this.numRatings() + " ratings";
		return result;
	}
	
	public static void main(String[] args){
		Mreview m = new Mreview("Triangle", 5);
		m.addRating(3);
	    m.addRating(4);
	    m.addRating(4);
	    System.out.println(m.toString());
	 }

}
