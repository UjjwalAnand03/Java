package OOP_initialization_with_method;

public class main_class {

	public static void main( String args[]) {
		side_class s1= new side_class();
		side_class s2= new side_class();
		s1.record(1, "Ujjwal", "PHY", "Second");
		s1.display();
		s2.record(2,"Anmol", " ENG", " First");
		s2.display();
		
		
	}
}
