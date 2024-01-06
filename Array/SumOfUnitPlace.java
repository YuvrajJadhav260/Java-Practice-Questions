package Array;

public class SumOfUnitPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,8,43,15,11};
		int sumofunitplaces=0;
		for(int i=0;i<a.length;i++) {
			sumofunitplaces=sumofunitplaces+a[i]%10;
		}
		System.out.println("sum="+sumofunitplaces);
	}

}
