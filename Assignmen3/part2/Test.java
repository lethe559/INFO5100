package Assignment3_part2;

public class Test {
	public static void main(String[] args) {
		PsychiatristObject psy = new PsychiatristObject();
		MoodyObject happyObject = new HappyObject();
		MoodyObject sadObject = new SadObject();
		psy.examine(happyObject);
		psy.observe(happyObject);
		System.out.println(" ");
		System.out.println(" ");
		psy.examine(sadObject);
		psy.observe(sadObject);
	}
}
