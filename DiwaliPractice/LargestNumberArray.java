package DiwaliPractice;

import java.util.Arrays;

public class LargestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,23,50,4,5};
		int max=0;
		for(int n:arr) {
			if(n>max) {
				max=n;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("the Largest number in array="+max);
	}

}
