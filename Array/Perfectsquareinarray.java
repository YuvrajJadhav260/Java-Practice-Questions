package Array;

import java.util.Arrays;

public class Perfectsquareinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int s;
		for(int i=0;i<arr.length;i++) {
			int sqr=arr[i]*arr[i];
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==sqr) {
					System.out.println(arr[j]);
				}
			}
			}
	}

}
