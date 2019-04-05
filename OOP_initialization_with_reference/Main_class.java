package OOP_initialization_with_reference;

public class Main_class {

	public static void main(String args[]) {
		Abstract_class s1= new Abstract_class();
		s1.id=01;
		s1.name= "Ujjwal";
		s1.course= "PCM";
		System.out.println(s1.id + " "+ s1.name +" "+ s1.course);
		Abstract_class s2= new Abstract_class(); 
		s2.id=02;
		s2.name ="Anmol";
		s2.course ="ENG";
		System.out.println(s2.id +" "+ s2.name+ " "+ s2.course);
		
		
	}
}
 