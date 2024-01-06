package GarbageCollection;

public class Student {
	String name;
	int Roll;
	int mobile;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.name="Yuvraj";
		s1.Roll=12;
		s1.mobile=25483;
		System.out.println("Name of Student= "+s1.name+" Roll no is= "+s1.Roll+" Mobile no= "+s1.mobile);
		
		Student s2=new Student();
		s2.name="Shubham";
		s2.Roll=13;
		s2.mobile=245483;
		System.out.println("Name of Student= "+s2.name+" Roll no is= "+s2.Roll+" Mobile no= "+s2.mobile);
		
		Student s3=new Student();
		s3.name="harsh";
		s3.Roll=14;
		s3.mobile=2548345;
		System.out.println("Name of Student= "+s3.name+" Roll no is= "+s3.Roll+" Mobile no= "+s3.mobile);
		
		Student s4=new Student();
		s4.name="ravi";
		s4.Roll=15;
		s4.mobile=2535483;
		System.out.println("Name of Student= "+s4.name+" Roll no is= "+s4.Roll+" Mobile no= "+s4.mobile);
		
		Student s5=new Student();
		s5.name="rushi";
		s5.Roll=16;
		s5.mobile=2355483;
		System.out.println("Name of Student= "+s5.name+" Roll no is= "+s5.Roll+" Mobile no= "+s5.mobile);
		
		//Gc
		s4=null;
		s5=null;
		System.gc();
		//System.out.println("name="+s4.name); //This will Show an Exception
		//System.out.println("name="+s5.name); //This will Show an Exception
	}

}
