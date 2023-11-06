package pack;

public class ends_with {

	public static void main(String[] args) {
		ends_with pen = new ends_with();
		pen.dad();
		ends_with.mom();
		
	}
public void dad() {
String a = "I made a pizza.";
boolean t = a.endsWith("pizza.");
System.out.println(t);
		
}
public static void mom() {
String a = "I want to buy house for us.";
String b = "I will go to my new house.";
boolean n = a.endsWith("us.");
boolean m = b.endsWith("house.");
System.out.println(n);
System.out.println(m);
		
}	
	
	
}
