package jbkPractice;
class College{
	private int age;
	public void setAge(int n) {
		age=n;
	}
	public int getAge() {
		return age;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College clg=new College();
		clg.setAge(10);
		System.out.println(clg.getAge());

	}

}
