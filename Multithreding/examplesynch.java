package Multithreding;
public class examplesynch extends Thread {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		examplesynch11 es1=new examplesynch11();
		examplesynch22 es2=new examplesynch22();
		es1.start();
		es2.start();

	}

}
class  examplesynch11 extends Thread{
	@Override
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			System.out.println("##");
		}
	}
}
class  examplesynch22 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("**");
		}
	}
}