package jbkPractice;

public class EncapsulationDemo {
	private int empssn;
	private String empName;
	private int empAge;
	//Setters
	public void setEmpssn(int newValue) {
		empssn=newValue;
	}
	public void setEmpName(String newValue) {
		empName=newValue;
	}
	public void setEmpAge(int newValue) {
		empAge=newValue;
	}
	//Getters
	public int getEmpssn() {
		return empssn;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}


	public static void main(String args[]) {
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setEmpssn(123333);
		obj.setEmpName("Kiran");
		obj.setEmpAge(16);
		System.out.println(obj.getEmpssn());
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpAge());
	}
}
