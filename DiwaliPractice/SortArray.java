package DiwaliPractice;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr[]= {2,5,8,6,45,3};
		System.out.println(Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]>arr[j]) {
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
