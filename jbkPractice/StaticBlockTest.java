package jbkPractice;

public class StaticBlockTest {
	public int n;
	public static int m;
	//Instsance Block
	{
		n=10;
		System.out.println("Instance Block="+n);
	}
	
	static {
		System.out.println("SB1");
	}
	static {
		System.out.println("SB2");
	}
	static {
		System.out.println("SB3");
	}
	static {
		System.out.println("SB4");
	}
	//static block can access only static variables
	static {
		m=1;
		System.out.println("static Block="+m);	}
	//we can write number of lines in sb
	static {
		for(int i=0;i<10;i++) {
		System.out.println(i);
		}
	}

}
