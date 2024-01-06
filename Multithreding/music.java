package Multithreding;

public class music extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
		System.out.println("music");
		}
	}
}
