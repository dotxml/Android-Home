package demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class New {
	
	public static void main(String[]args) throws IOException{
		
		String link= "//Users//adityayadav//Documents";
		File file= new File(link);
		file.createNewFile();
		
		
	}

}
