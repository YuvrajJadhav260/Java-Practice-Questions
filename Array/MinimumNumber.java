package Array;

public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,13,4,5};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				}
		}
		System.out.println(min);
	}

}
