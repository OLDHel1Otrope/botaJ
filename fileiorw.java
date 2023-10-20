package package1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A {
	
	public static void main(String []args) {
		File file=new File("secret.txt");
		if(file.exists()) {
			System.out.println("that file exists");	
		}
		else {
			System.out.println("that file dosen't exist");
		}
		
		System.out.println(file.getAbsolutePath());
		
		
		try {
			FileWriter writer= new FileWriter("poem.txt");
			writer.write("Roses are red \n violets are blue \n booty booty booty");
			writer.append("he");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader reader=new FileReader("poem.txt");
			int data=reader.read();
			while(data!=-1) {
				System.out.print((char)data);
				data=reader.read();
			}
			reader.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			
		}
		
		
		
	}
}
