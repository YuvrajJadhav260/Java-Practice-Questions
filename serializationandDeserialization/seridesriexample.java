package serializationandDeserialization;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
public class seridesriexample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//serialization
		FileOutputStream fo=new FileOutputStream("D:\\serialization.txt");
		ObjectOutputStream o=new ObjectOutputStream(fo);
		  
		Bird b=new Bird();
		b.name="Shubham";
		b.color="kala";
		
		Classfirst c1=new Classfirst();
		c1.name="tiger";
		Classsecond c2=new Classsecond();
		c2.name="apple";
		
		
		o.writeObject(b);
		o.writeObject(c1);
		o.writeObject(c2);
		System.out.println("object saved into class");
		
		//Deserialization
		FileInputStream fi=new FileInputStream("D:\\serialization.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		
	
		//Object obj=oi.readObject();
		Bird obj=(Bird)oi.readObject();
		System.out.println(obj.name);
		System.out.println(obj.color);
		
		Classfirst obj1=(Classfirst)oi.readObject();
		Classsecond obj2=(Classsecond)oi.readObject();
		
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		
	}

}
