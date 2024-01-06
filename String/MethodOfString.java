package String;

public class MethodOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Yuvrajjadhav";
		String str1="   Yuvrajjadhav  ";
		String str3="     ";
		System.out.println(str.charAt(0));
		System.out.println(str.repeat(3));
		System.out.println(str.indexOf("v"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.length());
		System.out.println(str.equals("Yuvraj"));
		System.out.println(str.equalsIgnoreCase("yuvraj"));
		System.out.println(str.codePointAt(0));
		System.out.println(str.concat(" jadhav"));
		System.out.println(str.contains("yuv"));
		System.out.println(str.startsWith("Y"));
		System.out.println(str.endsWith("j"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace("jj","k"));
		System.out.println(str.replaceAll("a","k"));
		
		System.out.println(str1.trim());
		System.out.println(str3.isEmpty());
		System.out.println(str3.isBlank());
		
		String arr[]=str.split("a");
		for(String a:arr) {
			System.out.println("split method="+a);
		}
		
		String n=String.valueOf(123);
		
		System.out.println("this is string converted from int="+n+1);
		

		//String str = "firewings";
		
		//converts lower case alphabets into upper case
		//System.out.println(str.toUpperCase());
		
		//converts upper case alphabets into lower case
		//System.out.println(str.toLowerCase());
		
		//replaces all occurances of 1st parameter with 2nd. 
		//System.out.println(str.replace('I', 'i'));
		
		//repeats the string given no of times.
		//System.out.println(str.repeat(0));
		
		//counts the number of symbols in it, counting from 1
		//System.out.println(str.length());
		
		//returns the index of last occurance of given character.
		//System.out.println(str.lastIndexOf('d'));
		
		//returns the index of first occurance of given character.
		//System.out.println(str.indexOf('d'));
		
		//checks the content is same or not. CASE-INSENSITIVE
		//System.out.println(str.equalsIgnoreCase("ANDROID"));
		
		//checks the content is same or not. Case-sensitive
		//System.out.println(str.equals("Android"));
		
		
		//checks if the string is starting with given string or not.
		//System.out.println(str.startsWith("And"));
		
		//checks if the string is ending with given string or not.
		//System.out.println(str.endsWith("drone"));
		
		//checks if the given string is contained in the string or not.
		//System.out.println(str.contains("dr"));

		//adds the given string in the end.
		//System.out.println(str.concat("fully"));
		
		//returns ASCII value of character at given index.
		//System.out.println(str.codePointAt(0));
		
		//charAt returns character at given index.
		//System.out.println(str.charAt(4));
		
		
	}

}
