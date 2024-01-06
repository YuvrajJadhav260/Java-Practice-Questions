package Array;

public class Divisiblabyfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,8,43,15,11};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0) {
				sum=sum+a[i];	
			}
		}
		System.out.println("sum="+sum);
	}

}
