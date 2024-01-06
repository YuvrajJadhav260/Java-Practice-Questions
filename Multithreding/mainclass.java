package Multithreding;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi m=new multi();
		music m1=new music();
		calling c=new calling();
		m.start();
		m1.start();
		c.start();
		m.setPriority(6);
		m1.setPriority(Thread.MAX_PRIORITY);
		c.setPriority(4);
		runnebale r=new runnebale();
		Thread t=new Thread(r);
		t.start();
		System.out.println("========================================================");

	}

}
