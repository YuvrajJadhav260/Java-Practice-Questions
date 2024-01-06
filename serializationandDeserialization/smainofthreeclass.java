package serializationandDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
public class smainofthreeclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//serialization
		FileOutputStream filesave1=new FileOutputStream("D:\\Demo.txt");
		ObjectOutputStream fileobject1=new ObjectOutputStream(filesave1);
		
		FileOutputStream filesave2=new FileOutputStream("D:\\Demo1.txt");
		ObjectOutputStream fileobject2=new ObjectOutputStream(filesave2);
		
		FileOutputStream filesave3=new FileOutputStream("D:\\Demo2.txt");
		ObjectOutputStream fileobject3=new ObjectOutputStream(filesave3);
		
		Classfirst c1=new Classfirst();
		c1.name="yuvraj";
		Classsecond c2=new Classsecond();
		c2.name="shubham";
		Classthird c3=new Classthird();
		c3.name="vishal";
		
		fileobject1.writeObject(c1);
		fileobject2.writeObject(c2);
		fileobject3.writeObject(c3);
		System.out.println("objects are saved into file");
		
		//deserialization
		FileInputStream fileread1=new FileInputStream("D:\\Demo.txt");
		ObjectInputStream fileobjread1=new ObjectInputStream(fileread1);
		
		FileInputStream fileread2=new FileInputStream("D:\\Demo1.txt");
		ObjectInputStream fileobjread2=new ObjectInputStream(fileread2);
		
		FileInputStream fileread3=new FileInputStream("D:\\Demo2.txt");
		ObjectInputStream fileobjread3=new ObjectInputStream(fileread3);
		
		Classfirst cl1=(Classfirst)fileobjread1.readObject();
		Classsecond cl2=(Classsecond)fileobjread2.readObject();
		Classthird cl3=(Classthird)fileobjread3.readObject();
		System.out.println(cl1.name);
		System.out.println(cl2.name);
		System.out.println(cl3.name);
		
	}

}