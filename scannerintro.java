import java.util.Scanner;

public class Main {

	static public void main(String args[]) {
		Scanner firstscan =new Scanner(System.in);
		System.out.println("what is your name?");
		String name=firstscan.nextLine();
		System.out.println("how old are you?");
		int age=firstscan.nextInt();
		System.out.println("what is your favourite fruit?");
		firstscan.nextLine();
		String fruit=firstscan.nextLine();
		System.out.println("your name is "+name+" and "+age+" is really old, and "+fruit+" is really distasteful");
	}
}
