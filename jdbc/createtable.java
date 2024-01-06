package jdbc;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
public class createtable {
	static final  String username="root";
	static final  String pass="Yuvraj@9596";
	static Scanner sc=new Scanner(System.in);
	//newtable
	public static String newtable (Connection c,String tablename) throws Exception {
		System.out.println("Enter the table table name=>");
		String newtable=sc.next();
		System.out.println("How many columns you want to add=>");
		int n=sc.nextInt();
		String strcreate="create table "+newtable+"( ";
		String increate="";
		for(int i=0;i<n;i++) {
			System.out.println("Enter the column name=>");
			String col=sc.next();
			System.out.println("Enter the type of column=>");
			String type=sc.next();
			increate=increate+col+" "+type+",";
		}
		
		PreparedStatement stm1=c.prepareStatement(strcreate+increate.substring(0,increate.length()-1)+");");
		stm1.executeUpdate();
		tablename=newtable;
		System.out.println("New table is Created succesfully!!!!");
		System.out.println(tablename);
		System.out.println("======================================================================");
		return tablename;
	}
	//main method
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Database You want to use=>");
		String database=sc.next();
		String tables="Tables_in_"+database;
		String path="jdbc:mysql://localhost:3306/"+database;
		
		//load driver into memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connection
		Connection c=DriverManager.getConnection(path,username,pass);
		
		//for printing table names
		PreparedStatement stm=c.prepareStatement("show tables;");
		ResultSet rs=stm.executeQuery();
		System.out.println("==============================================================");
		
		System.out.println("The tables in "+database+" are=>");
		while(rs.next()) {
			System.out.println(rs.getString(tables));
		}
		System.out.println("=============================================================");
		
		System.out.println("Enter the table name for operation you want to choose or enter new to create new table");
		String tablename=sc.next();
		System.out.println("=============================================================");
		
		if(tablename.equals("new")) {
			String ntablename=createtable.newtable(c,tablename);
			tablename=ntablename;
			
		}
			//for printing column
		System.out.println(tablename);
		
		PreparedStatement stmt2=c.prepareStatement("desc "+tablename+";");
		ResultSet rs1=stmt2.executeQuery();
		int count=0;
		while(rs1.next()) {
			System.out.println(rs1.getString("Field")+"        ||"+rs1.getString("Type"));
			count++;
		}

				System.out.println("what operation you want to perform=>");
				System.out.println("insert update delete");
				String op=sc.next();
			
				if(op.equals("insert")) {
					System.out.println("Enter the values for columns=>");
					String ins="insert into "+tablename+" values(";
					String sum="";
					for(int i=0;i<count;i++) {
						String insstr=sc.next();
						sum=sum+insstr+",";
					}
					PreparedStatement stm4=c.prepareStatement(ins+sum.substring(0,sum.length()-1)+");");
					stm4.executeUpdate();
					System.out.println("Insertion completed!!!!");

				}
				
				if(op.equals("delete")) {
					System.out.println("Enter the row Id you want to delete=>");
					String dlt=sc.next();
					PreparedStatement stmt5=c.prepareStatement("delete from "+tablename+" where id="+dlt+";");
					stmt5.executeUpdate();
				}
				if(op.equals("update")) {
					System.out.println("Enter the row Id you want to update=>");
					String idupdate=sc.next();
					System.out.println("Enter the column name you want to update=>");
					String colupdate=sc.next();
					System.out.println("Enter the value=>");
					String valueupdate=sc.next();
					PreparedStatement stmt6=c.prepareStatement("update "+tablename+" set "+colupdate+"="+valueupdate+" where id="+idupdate+";");
					stmt6.executeUpdate();
				}
	}

}
