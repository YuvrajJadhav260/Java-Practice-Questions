package Array;
import java.util.*;
public class GmailDataExtract {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		
		//String arr[]=str.split("@");
		//System.out.println(arr[0]);
		String username=str.substring(0,str.indexOf("@"));
		
		String digits=username.replaceAll("[^\\d.]", "");
		String ch=username.replaceAll("\\d", "");
		
		String domainname=str.substring(str.indexOf("@")+1,str.indexOf("."));
		String extension=str.substring(str.indexOf(".")+1,str.length());
		
		System.out.println("Username===============>"+username);
		
		System.out.println("digits in username=====>"+digits);
		System.out.println("characters in username=>"+ch);
		
		System.out.println("domainname=============>"+domainname);
		System.out.println("extension==============>"+extension);
	}

}
