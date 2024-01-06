package Multithreding;

public class IncrementDecrement {
	private static int sharedVariable = 5;

	public static void main(String[] args) {

		Thread incrementThread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				sharedVariable = ++sharedVariable;
				System.out.println(sharedVariable);
			}
		});

		Thread decrementThread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				sharedVariable = --sharedVariable;
				System.out.println(sharedVariable);
			}

		});

		incrementThread.start();
		decrementThread.start();


		try { incrementThread.join();
		decrementThread.join(); 
		} 
		catch(InterruptedException e) { 
			e.printStackTrace(); 
		}

		System.out.println("Final shared variable value: " + sharedVariable);
	}
}
