package jbkPractice;
//In Hybrid this is process of combination of another two concepts here we use single and hierarchical inheritance
class School{
	public void methodSchool(){
		System.out.println("This is school");
	}
}
class SchoolPrincipal extends School{
	public void methodSchoolPrincipal(){
		System.out.println("This is schoolPrincipal");
	}
}
class ClassTeacherA extends SchoolPrincipal{
	public void classTeacherA(){
		System.out.println("This is classTeacherA");
	}
}
class ClassTeacherB extends SchoolPrincipal{
	public void classTeacherB(){
		System.out.println("This is classTeacherB");
	}
}
class ClassTeacherC extends SchoolPrincipal{
	public void classTeacherC(){
		System.out.println("This is classTeacherC");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTeacherA ca=new ClassTeacherA();
		ca.classTeacherA();
		ClassTeacherB cb=new ClassTeacherB();
		cb.classTeacherB();
		ClassTeacherC cc=new ClassTeacherC();
		cc.classTeacherC();
		

	}

}
