package OOP_initialization_with_method;

public class side_class {
	
	int rollno;
	String name;
	String course;
	String status;
	
	void record(int r, String n, String c, String s) {
		rollno=r;
		name=n;
		course=c;
		status=s;
	}
	void display() {
		System.out.println( rollno + " " + name + " " + " " + course + " " + status);
	}

}
