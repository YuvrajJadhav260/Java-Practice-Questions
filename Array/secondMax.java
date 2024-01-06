package Array;

public class secondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,10,20,30,5,6};
		int max=arr[0];
		int secondmax=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
				
			}
		}
		System.out.println(max);
		System.out.println(secondmax);
	}

}
