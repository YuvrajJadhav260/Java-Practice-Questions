package Array;

public class FactorialOfarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,10};
		
		for(int i=0;i<a.length;i++) {
			int factorial=1;
			for(int j=1;j<=a[i];j++) {
				factorial=factorial*j;
			}
			System.out.println("factorial of "+a[i]+"="+factorial);
		}
		
	}

}
