package Multithreding;
public class synchmethod {
	public static void main(String[] args) {
		synch sy=new synch();
		mythread1 m1=new mythread1(sy);
		mythread2 m2=new mythread2(sy);
		m1.start();
		m2.start();
	}}
class synch{
	public synchronized void ptable(int n) {
		for(int i=0;i<5;i++) {
			System.out.println(i*n);}
	}}
class mythread1 extends Thread{
	synch m;
	mythread1(synch n){
		this.m=n;	
	}
	public void run() {
		m.ptable(5);}
}
class mythread2 extends Thread{
	synch m;
	mythread2(synch n){
		this.m=n;
	}
	public void run() {
		m.ptable(1000);}
}