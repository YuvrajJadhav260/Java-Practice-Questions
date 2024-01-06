package AbstractionInterface;

public class Tiger implements Animals {
	public void move() {
		System.out.println("The tiger walks");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t=new Tiger();
		t.move();

	}

}
