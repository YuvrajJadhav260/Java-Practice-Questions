package Array;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {60,10,20,30};
		int max=arr[0]; 
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
