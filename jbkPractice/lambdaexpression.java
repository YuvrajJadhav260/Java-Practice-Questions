package jbkPractice;
interface Demoi1{
	void add(int a,int b);
	
}
interface Demo1{
	 int sub(int m);
}



public class lambdaexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demoi1 add=(a,b)->{
			int res=a+b;
			System.out.println(res);};
		Demo1 sub=num->num-5;
		
	}

//	Sub sub=  num1->{
//		int res=num1-5;
//		return res;
//	};
//	Sub sub= num1 -> { 
//		return num1-5;
//	};
		
		
}

