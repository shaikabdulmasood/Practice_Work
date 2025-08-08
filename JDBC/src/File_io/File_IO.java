package File_io;

import java.io.File;
import java.io.IOException;

public class File_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("test.txt");
			
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
				} 
			else {
				System.out.println("File already exists.");
				}
	
		} 
		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
