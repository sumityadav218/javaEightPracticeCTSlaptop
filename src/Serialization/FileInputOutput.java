package Serialization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) {
	
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")) ;
			writer.write("this is the demo example of buffered writer");
			writer.write("/nsumit");
			writer.write("/nyadav");
			writer.write("/ndemo ");
			writer.close();
			
			
			BufferedReader reader =  new BufferedReader(new FileReader("output.txt")) ; 
						
			String line  ; 
			while ((line = reader.readLine())!=null) {
				System.out.println(line);
				
			}
			
			reader.close(); 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
