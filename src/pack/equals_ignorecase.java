package pack;

public class equals_ignorecase {

	public static void main(String[] args) {
		equals_ignorecase glass = new equals_ignorecase();
		glass.mug();
		equals_ignorecase.cup();
		
	}
public void mug() {
String a = "I am doing my practice.";
String b = "I AM DOING MY PRACTICE.";
boolean k = a.equalsIgnoreCase(b);
System.out.println(k);

}
public static void cup() {
String a = "Have a nice day";
String b = "haVe A Nice Day";
String c = "nice picture";
String d = "NICE picTURE";
boolean r = a.equalsIgnoreCase(b);
boolean l = c.equalsIgnoreCase(d);
System.out.println(r);
System.out.println(l);
	
}	
	
	
	
}
