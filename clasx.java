package firstproject;
import java.util.Random;

public class DiceClass {
	int number;
	Random random=new Random();
	
	
	DiceClass(){
		roll(random, number);
	}
	
	void roll(Random random, int number) {
		number=random.nextInt(6)+1;
		System.out.println(number);
	}
}
