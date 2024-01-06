package jbkPractice;
class Vehical{
	String VehicalType;
}
public class InheritanceCar extends Vehical{
	String ModelType;
	public void showDetails() {
		VehicalType="Twowheeler";
		ModelType="R15";
		System.out.println("VehicalType="+VehicalType+"\nModelType="+ModelType);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceCar car=new InheritanceCar();
		car.showDetails();

	}

}
