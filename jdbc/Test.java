package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String path="jdbc:mysql://localhost:3306/mnc";//jdbc.mysql.mac adress.port.database
		String username="root";
		String pass="Yuvraj@9596";
		Connection c=DriverManager.getConnection(path,username,pass);
		
		if(c!=null) {
			System.out.println("Done!!!!");
		}else {
			System.out.println("Not Done!!!!");
		}
		
	}

}
