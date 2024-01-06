package AbstractionAbstractClass;

public class IMPcomp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c=new Computer();
		//Machine m=new Machine();
		//we can not create object of abstract class
		c.battery();
		c.Blutooth();
		c.charger();
		c.Wifi();
	}

}
