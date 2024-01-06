package String;

import java.util.*;
public class UserNamePasswrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String user="Ujwal";
		final String passward="12345";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name=");
		String usr=sc.next();
		System.out.println("Enter the pass=");
		String pass=sc.next();
		
		if(user.equals(usr) && passward.equals(pass)) {
			System.out.println("Login Succesful");
		}
		else if(!user.equals(usr)) {
				System.out.println("user is incorrect");}
		else if(!passward.equals(pass)){
			System.out.println("pass is incorrect");}
		else {
		System.out.println("username & pass incorect");
		}
	}

}
