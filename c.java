package package1;

public class C {
	int x=6;
	static {
		System.out.println("Static block of class c");
	}
	
	{
		System.out.println("normal block of class c");
	}
	C(){
		System.out.println("C's constructor called");
	}
	
	public static void main(String[] args) {
		System.out.println("normal output in C's console");
		
	}
			
	
}
