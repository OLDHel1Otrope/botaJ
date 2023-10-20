package package1;
import java.io.File;
import javax.sound.sampled.*;
import java.io.IOException;
import java.util.Scanner;

public class A {
	
	public static void main(String []args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner=new Scanner(System.in);
		File file=new File("Soothsayer - John Patitucci.wav");
		AudioInputStream audiostream=AudioSystem.getAudioInputStream(file);
		Clip clip= AudioSystem.getClip();
		clip.open(audiostream);
		
		clip.start();
		int x=1;
		
		while(x==1||x==2) {
			x=scanner.nextInt();
			switch(x) {
				case 1:{	
					clip.start();
						break;}
				case 2:{
					clip.stop();
				}
			}
		}
		scanner.close();
	}
}
