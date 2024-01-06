package jbkPractice;

public class ConstructorGetterSetter {
	private int studId;
	private String studName;
	private int studAge;
	ConstructorGetterSetter(){
		studId=123;
		studName="Yuvraj";
		studAge=22;
	}
	ConstructorGetterSetter(int num1,String str,int num2){
		studId=num1;
		studName=str;
		studAge=num2;
	}
	//Getter and Setter
	public int getStudId(){
		return studId;
	}
	public void setStudId(int studId){
		this.studId=studId;
	}
	
	public String getStudName(){
		return studName;
	}
	public void setStudName(String studName){
		this.studName=studName;
	}
	
	public int getStudAge(){
		return studAge;
	}
	public void getStudAge(int studAge){
		this.studAge=studAge;
	}
	
	
	

}
