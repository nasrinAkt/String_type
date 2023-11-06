package pack;

public class starts_with {

	public static void main(String[] args) {
		starts_with fun = new starts_with ();
		fun.mina();
		starts_with.nina();	
		starts_with.tina();
	}
public void mina() {
String a = "Automation";
boolean t = a.startsWith("A");
System.out.println(t);
	
}
public static void nina() {
String a = "My course";
String b = "My con";
boolean t = a.startsWith("My");
boolean h = b.startsWith("My");
System.out.println(t);	
System.out.println(h);	
	
}	
	public static void tina() {
	String a = "My last name Akter.";
	boolean m = a.startsWith("My");
	System.out.println(m);
	
	}
	
	
}
