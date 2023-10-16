package package1;

public class A {
	static {
		System.out.println("Static block of class A");
	}
	
	A(){
		System.out.println("A's constructor called");
	}
	
	{
		System.out.println("normal block of class A");
	}
	
	public static void main(String []args) {
		
		System.out.println("normal output in A's console");
		A obj=new A();
		C ob2=new C();
		C.main(args);
		System.out.println(ob2.x);
	}
}
