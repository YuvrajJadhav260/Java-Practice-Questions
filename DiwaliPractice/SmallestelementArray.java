package DiwaliPractice;

import java.util.Arrays;

public class SmallestelementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,8,6,45,3};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("smallest element is="+arr[0]);
	}

}
