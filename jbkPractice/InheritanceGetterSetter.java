package jbkPractice;
class Vehicals{
	String color;
	int speed;
	int size;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
class Car extends Vehicals{
	int CC;
	int gear;
	String color;
	public int getCC() {
		return CC;
	}
	public void setCC(int cC) {
		CC = cC;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
public class InheritanceGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car b1=new Car();
		b1.color="red";
		b1.setSpeed(200);
		b1.setSize(22);
		b1.CC=1000;
		b1.gear=5;
		System.out.println("Color Of Car=>"+b1.color);
		System.out.println("Speed Of Car=>"+b1.getSpeed());
		System.out.println("Size Of Car=>"+b1.getSize());
		System.out.println("CC Of Car=>"+b1.getCC());
		System.out.println("Gear Of Car=>"+b1.getGear());
	}

}
