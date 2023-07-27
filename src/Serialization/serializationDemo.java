package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		mySerializable obj  = new mySerializable() ; 
		obj.i =10 ; 
		obj.s = "demo object for string " ; 
		 
		FileOutputStream fos =  new FileOutputStream("myFile.ser") ; 
		ObjectOutputStream oos = new ObjectOutputStream(fos) ; 
		
		oos.writeObject(obj);
		oos.close();


		FileInputStream fis  = new FileInputStream("myFile") ; 
		ObjectInputStream ois   = new ObjectInputStream (fis) ; 
		
		mySerializable obj1 =(mySerializable) ois.readObject() ;
		ois.close(); 
		
		System.out.println(obj1.i + obj.s);


	}

}
