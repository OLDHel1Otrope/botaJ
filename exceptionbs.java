package package1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int x;
		int y; 
		int z;
		try {
			x=scan.nextInt();
			y=scan.nextInt();
			z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException m) {
			System.out.println("wtf");
		}
		catch(InputMismatchException m) {
			System.out.println("haha");
		}
		
		finally {
			scan.close();
		}
	}

}
