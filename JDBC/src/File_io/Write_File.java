package File_io;

import java.io.*;

public class Write_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 
		BufferedWriter writer=null;
		try {
		
	writer= new BufferedWriter(new FileWriter("test.txt" , true));
		writer.write("Hello Learners ");
		writer.write("I am Shaik Abdul Masood");
		writer.newLine();
		System.out.println("Successfully Written to file");
		}
		catch(IOException e)
		{
			System.out.println("An error occurred while writing to the file: "  +e.getMessage());
 
		}
		finally
		{
			try
			{
				if(writer !=null)
				 writer.close();
			}
			catch(IOException e)
			{
				System.out.println("Error while closing the writer: " +e.getMessage());
			}
		}
		
	}

}
 
 