package jdbc;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class sqljdbc {
	static final  String path="jdbc:mysql://localhost:3306/mnc";
	static final  String username="root";
	static final  String pass="Yuvraj@9596";
	public static void create() {};
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter ID=");
		int id=sc.nextInt();
		System.out.println("Enter name=");
		String name=sc.next();
		System.out.println("Enter Department=");
		String department=sc.next();
		System.out.println("Salary=");
		int salary=sc.nextInt();
		System.out.println("Enter the Shift=");
		String shift=sc.next();*/
		//load driver class into the memory
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection 
		Connection c=DriverManager.getConnection(path,username,pass);
		
		PreparedStatement stmt=c.prepareStatement("create table jbkclass(id int(11) primary key,schooName varchar(50));");
		try {stmt.executeUpdate();}
		catch(Exception e) {
			System.out.println("table already created");
		}
		try{
			PreparedStatement stmt1=c.prepareStatement("insert into jbkclass values(1,'dypatil');");
			stmt1.executeUpdate();}
		catch(Exception e){
			System.out.println("table 1 row is created");
		}
		PreparedStatement stmt2=c.prepareStatement("insert into jbkclass values(2,'ajinkytara');");

		try{stmt2.execute();}
		catch(Exception e) {
			System.out.println("2nd row already present");
		}
		PreparedStatement stmt3=c.prepareStatement("select * from jbkclass;");
		ResultSet rs=stmt3.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+"  "+rs.getString("schooName"));
		}
		
		PreparedStatement stmt4=c.prepareStatement("insert into jbkclass values(?,?)");
		stmt4.setInt(1, 3);
		stmt4.setString(2, "spvn");
		try{stmt4.execute();}
		catch(Exception e) {
			System.out.println("3rd row is already created");
		}
		 
		//another method 
		Statement st=c.createStatement();
		st.executeUpdate("insert into jbkclass values(4,'priyadarshni');");
		
		
		
	}

}
