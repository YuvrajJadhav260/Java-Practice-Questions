package Array;

public class Copyarrayinreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,8,43,15,11};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int k=b.length-1;k>=0;k--) {
			System.out.println(b[k]);
		}
	}

}
